<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
	
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		
		<script type="text/javascript" src="/resources/se2/js/service/HuskyEZCreator.js" charset="utf-8"></script>
		
		<!-- 합쳐지고 최소화된 최신 CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<!-- 부가적인 테마 -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		
		
		
	 	<title>게시판</title>
	</head>
	
		<!-- 작성버튼을 눌렀을때 벨리데이션을 체크하기 위한 함수  -->
		<!-- chk라는 클래스의 i번째가 공백이거나 null이면 알러트로 i번째의 타이틀을 출력해주는 함수  -->
		<script type="text/javascript">
		var oEditors = [];
		$(document).ready(function(){
			
			nhn.husky.EZCreator.createInIFrame({
 			oAppRef: oEditors,
 			elPlaceHolder: "content",
 			sSkinURI: "/resources/se2/SmartEditor2Skin.html",
 			fCreator: "createSEditor2"
			});
			var formObj = $("form[name='writeForm']");
			
			$(".write_btn").on("click", function(){
				if(fn_valiChk()){
					return false;
				}
				formObj.attr("action", "/board/write");
				formObj.attr("method", "post");
				formObj.submit();
			});
			$(".cancel_btn").on("click", function(){
				event.preventDefault();
				location.href = "/board/table";
			})
		})
		function fn_valiChk(){
			var regForm = $("form[name='writeForm'] .chk").length;
			for(var i = 0; i<regForm; i++){
				if($(".chk").eq(i).val() == "" || $(".chk").eq(i).val() == null){
					alert($(".chk").eq(i).attr("title"));
					return true;
				}
			}
			oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []);
			 var content = document.getElementById("content").value;;
	         if(content == "" || content == null || content == '&nbsp;' || 
	         content == '<br>' || content == '<br/>' || content == '<p>&nbsp;</p>' || content == '<p><br></p>'){ 
	        	 alert("본문을 작성해주세요."); 
	        	 oEditors.getById["content"].exec("FOCUS"); //포커싱 
	        	 return true; 
	        	 }

		}
		</script>
			
	<body>
	
		<div class="container">
			<header>
				<h1> 게시판 - 글 작성 </h1>
			</header>
			<hr />
			 
			<div>
				<%@include file="nav.jsp" %>
			</div>
			<hr />
			
			<section id="container">
				<form name="writeForm" method="post" action="/board/write">
					<table class="table table-hover">
					<c:if test="${member.userId != null}">
					
					<div class="form-group">
						<label for="title" class="col-sm-2 control-label" >제목</label>
						<input type="text" id="title" name="title" class="chk" title="제목을 입력하세요." />
					</div>
					
					<div class="form-group">
						<label for="writer" class="col-sm-2 control-label">작성자</label>
						<input type="text" id="writer" name="writer" class="chk" title="작성자을 입력하세요." value="${member.userId}" readonly="readonly"/>
					</div>
		
					<div class="form-group">
						<label for="content" class="col-sm-2 control-label">내용</label>
						<input name="content" id="content" rows="10" cols="156"></input>
					</div>
					
					
					   <span>
						<button type="submit" class="write_btn btn btn-outline-info" onclick = "submitContents()">작성</button>
						
					   </span>
					   <button type="submit" class="cancel_btn btn btn-outline-info" >취소</button>
					   		</c:if>
							<c:if test="${member.userId == null}">
								<p>로그인 후에 작성하실 수 있습니다.</p>
							</c:if>
					</table>
				</form>
			</section>
			<hr />
		</div>
	</body>
	
</html>