<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="kr">
<head>
		<style>
      .outer{
      text-align: center;
      }
      div.absolute{
      position: absolute;
      left: 658px;
      }
      </style>

<!--         합쳐지고 최소화된 최신 CSS
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		부가적인 테마
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"> -->
		
      <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css" />
  	  <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
		
		<!--   <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
	 	<title>게시판</title>
	 	
	 	<script>
         jQuery(function($){
            $("#boardList").DataTable({
               dom: '1t',
               aaSorting: [

               ],
               columnDefs: [
                   { targets: 0, width: 50 },
                   { targets: 1, width: 180 },
                   { targets: 2, width: 100 },
                   { targets: 3, width: 200 },
                   { targets: 4, width: 100 },
                   { targets: 5, width: 200 },
                   { targets: 6, width: 60 }
               ]

            });
         });
      </script> 
	</head>
	<body>
		<div class="container">
			<header>
				<h1> 게시판 </h1>
				
			</header>
			<hr />
			 
			<div>
				<%@include file="nav.jsp" %>
			</div>
			<hr />
			
	
				<form role="form" method="get" action="/board/write">
					<table id="boardList" class="table table-bordered"  style='display:inline-block'>
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>등록일</th>
							<th>수정자</th>
							<th>수정일</th>
							<th>조회수</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${list}" var = "list">
						<c:choose>
						<c:when test="${list.deleted == 'N' or list.deleted == NULL}">
							<tr>
								<td><c:out value="${list.bno}" /></td>
								<td>
									<a href="/board/readView?bno=${list.bno}&
															 page=${scri.page}&
															 perPageNum=${scri.perPageNum}&
															 searchType=${scri.searchType}&
															 keyword=${scri.keyword}"><c:out value="${list.title}" /></a>
								</td>
								<td><c:out value="${list.writer}" /></td>
								<td><fmt:formatDate value="${list.regdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><c:out value="${list.editor}" /></td>
								<td><fmt:formatDate value="${list.editdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><c:out value="${list.hit}" /></td>
							</tr>	
							</c:when>
							<c:otherwise>
							
							</c:otherwise>
							</c:choose>
						</c:forEach>
						</tbody>
					</table>
					<br>
		
					<div class="outer">
						<select name="searchType" style="width:100px; height:34px; fontsize:20px;">
      						<option value="n"<c:out value="${scri.searchType == null ? 'selected' : ''}"/>>----전체----</option>
     				    	<option value="t"<c:out value="${scri.searchType eq 't' ? 'selected' : ''}"/>>제목</option>
     			   	    	<option value="c"<c:out value="${scri.searchType eq 'c' ? 'selected' : ''}"/>>내용</option>
   					    	<option value="w"<c:out value="${scri.searchType eq 'w' ? 'selected' : ''}"/>>작성자</option>
  					    	<option value="tc"<c:out value="${scri.searchType eq 'tc' ? 'selected' : ''}"/>>제목+내용</option>
 					    </select>
				
		

  					    <input type="text" name="keyword" id="keywordInput" style="width:180px; height:34px;" value="${scri.keyword}"/>


  					    <button id="searchBtn" type="button" class="btn btn-success">검색</button>
  					  </div>
  					  
  					  
  					  	<div class="absolute">
 						 <ul class="pagination">
    						<c:if test="${pageMaker.prev}">
    							<li><a href="list${pageMaker.makeSearch(pageMaker.startPage - 1)}">이전</a></li>
    						</c:if> 

    						<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
    							<li <c:out value="${pageMaker.cri.page == idx ? 'class=info' : ''}" />>
    							<a href="list${pageMaker.makeSearch(idx)}">${idx}</a></li>
    						</c:forEach>

    						<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
    							<li><a href="list${pageMaker.makeSearch(pageMaker.endPage + 1)}">다음</a></li>
    						</c:if> 
 						 </ul>
 						 </div>
  					  
  					  <script>
 					     $(function(){
   					     $('#searchBtn').click(function() {
     					     self.location = "list" + '${pageMaker.makeQuery(1)}' + "&searchType=" + $("select option:selected").val() + "&keyword=" + encodeURIComponent($('#keywordInput').val());
    					    });
   					   });   
  					  </script> 
					<br><br><br>
				</form>
	
			<hr />
		</div>
	</body>
</html>