<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<% 
response.setHeader("Pragma","no-cache"); 
response.setDateHeader("Expires",0); 
response.setHeader("Cache-Control", "no-cache");
%>
<!DOCTYPE html>
<c:if test="${member.userId != null}">
	<html lang="en">

<head>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Board_memberCheck</title>

<!-- Custom fonts for this template-->
<link href="/resources/boot/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/resources/boot/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

	<!-- 탈퇴 창 시작-->
	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">비밀번호 확인</h1>
									</div>
									<form class="user" method="post" id="checkForm">

										<div class="form-group">
											<label class="control-label" for="userId">아이디</label> <input
												type="text" class="form-control form-control-user"
												id="userId" name="userId" value="${member.userId}"
												readonly="readonly" />
										</div>
										<div class="form-group">
											<label class="control-label" for="userPass">패스워드</label> <input
												type="password" class="form-control form-control-user"
												id="userPass" maxlength="20" name="userPass"
												placeholder="비밀번호입력...">
										</div>
									</form>

									<hr>
									<form class="user">
										<button class="btn btn-google btn-user btn-block"
											type="button" id="submit">회원정보수정</button>
										<input type="button" value="취소"
											class="btn btn-primary btn-user btn-block"
											onclick="goBack();" />

									</form>
									<div>
										<c:if test="${msg == false}">
											비밀번호가 맞지 않습니다.
										</c:if>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>

	</div>
	<!-- 탈퇴 창 끝-->

	<!-- Bootstrap core JavaScript-->
	<script src="/resources/boot/vendor/jquery/jquery.min.js"></script>
	<script
		src="/resources/boot/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="/resources/boot/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/resources/boot/js/sb-admin-2.min.js"></script>


	<script type="text/javascript">
   		function goBack(){
     	 window.history.back();
   		}
	</script>
</body>
<script type="text/javascript">
		$(document).ready(function(){
			// 취소
			$(".cencle").on("click", function(){
				
				location.href = "/home";
						    
			})
		
			$("#submit").on("click", function(){
				if($("#userPass").val()==""){
					Swal.fire("비밀번호를 입력해주세요.","","info");
					$("#userPass").focus();
					return false;
				}
				$.ajax({
					url : "/member/passChk",
					type : "POST",
					dateType : "json",
					data : $("#checkForm").serializeArray(),
					success: function(data){
							
							if(data==true){
							
							location.href = "/member/memberModifyView";
						}else{
							Swal.fire("패스워드가 틀렸습니다.","","error");
							return;
						}
					}
				})
				
			});
			
				
			
		})
	</script>
	</html>
</c:if>
<c:if test="${member.userId == null}">
	<script>
location.href = "/home";
</script>
</c:if>