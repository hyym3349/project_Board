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
<html lang="en">

<head>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Board_Register</title>

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
<!-- <body id="page-top">

	Page Wrapper
	<div id="wrapper">

		Sidebar
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			Sidebar - Brand
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">
					DH<sup>PAGE</sup>
				</div>
			</a>

			Divider
			<hr class="sidebar-divider my-0">

			Nav Item - Dashboard
			<li class="nav-item"><a class="nav-link" href="/board/index">
					<i class="fas fa-fw fa-tachometer-alt"></i> <span>HOME</span>
			</a></li>

			Divider
			<hr class="sidebar-divider"> -->

			<!-- Heading -->
			<!-- <div class="sidebar-heading">
                Interface
            </div> -->

			<!-- Nav Item - Pages Collapse Menu -->
			<!-- <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>Components</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Components:</h6>
                        <a class="collapse-item" href="buttons.html">Buttons</a>
                        <a class="collapse-item" href="cards.html">Cards</a>
                    </div>
                </div>
            </li> -->

			<!-- Nav Item - Utilities Collapse Menu -->
			<!--  <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-wrench"></i>
                    <span>Utilities</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Utilities:</h6>
                        <a class="collapse-item" href="utilities-color.html">Colors</a>
                        <a class="collapse-item" href="utilities-border.html">Borders</a>
                        <a class="collapse-item" href="utilities-animation.html">Animations</a>
                        <a class="collapse-item" href="utilities-other.html">Other</a>
                    </div>
                </div>
            </li> -->

			<!-- Divider -->
			<!-- <hr class="sidebar-divider"> -->

			<!-- Heading -->
			<%-- <div class="sidebar-heading">USER ADMIN</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item active"><a class="nav-link collapsed"
				href="#" data-toggle="collapse" data-target="#collapsePages"
				aria-expanded="true" aria-controls="collapsePages"> <i
					class="fas fa-fw fa-folder"></i> <span>USER</span>
			</a>
				<div id="collapsePages" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Login Screens:</h6>
						<a class="collapse-item " href="/home">Login Menu</a>
						<c:if test="${member.userId == null}">
							<a class="collapse-item" id="registerBtn" type="button">Register</a>
						</c:if>
						<c:if test="${member.userId != null}">
						</c:if>
						<!--                       <a class="collapse-item" href="forgot-password.html">Forgot Password</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Other Pages:</h6>
                        <a class="collapse-item" href="404.html">404 Page</a>
                        <a class="collapse-item" href="blank.html">Blank Page</a> -->
					</div>
				</div></li> --%>

			<!-- Nav Item - Charts -->
			<!--             <li class="nav-item">
                <a class="nav-link" href="charts.html">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>Charts</span></a>
            </li> -->

			<!-- Nav Item - Tables -->
			<!-- <li class="nav-item"><a class="nav-link" href="/board/list">
					<i class="fas fa-fw fa-table"></i> <span>BOARD</span>
			</a></li>

			Divider
			<hr class="sidebar-divider d-none d-md-block">

			Sidebar Toggler (Sidebar)
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>


		</ul> -->
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
<%-- 		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>


					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							REGISTER
							<!--                              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                                aria-label="Search" aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div> -->
						</div>
					</form>
 --%>

					<!-- Topbar Navbar -->
					<%-- <ul class="navbar-nav ml-auto">



						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>



						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <c:if test="${member.userId != null}">
							????????? : ${member.userName} 
							</c:if> <c:if test="${member.userId == null}">
							?????????????????????.
							</c:if> <span class="mr-2 d-none d-lg-inline text-gray-600 small"></span>
								<img class="img-profile rounded-circle"
								src="/resources/boot/img/undraw_profile.svg">
						</a> <!-- Dropdown - User Information --> <c:if
								test="${member.userId != null}">
								<div
									class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
									aria-labelledby="userDropdown">
									<a class="dropdown-item" href="/member/memberCheckView"> <i
										class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
										Profile
									</a>

									<!--                                  <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a> 
                                
                                 <a class="dropdown-item" href="#">
                                    <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>  -->

									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="/member/logout"
										data-toggle="modal" data-target="#logoutModal"> <i
										class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
										Logout
									</a>
								</div>
							</c:if> <c:if test="${member.userId == null}">
								<div
									class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
									aria-labelledby="userDropdown">
									<a class="dropdown-item" href="/home"> <i
										class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Login
									</a> <a class="dropdown-item" href="/member/register"> <i
										class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
										Register
									</a>
								</div>
							</c:if></li>

					</ul>

				</nav> --%>
				<!-- End of Topbar -->

				<!-- ???????????? ??? ??????-->
				<div class="container">

					<div class="card o-hidden border-0 shadow-lg my-5">
						<div class="card-body p-0">
							<!-- Nested Row within Card Body -->
							<div class="row">
								<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
								<div class="col-lg-7">
									<div class="p-5">
										<div class="text-center">
											<h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
										</div>
										<form class="user" action="/member/register" method="post">
											<div class="form-group row">
												<div class="col-sm-6 mb-3 mb-sm-0">
													<input type="text" class="form-control form-control-user"
														maxlength="15" id="userId" name="userId" placeholder="ID">
												</div>
												<div class="col-sm-6">
													<button class="idChk btn btn-primary btn-user btn-block"
														type="button" id="idChk" onclick="fn_idChk();" value="N">????????????</button>
												</div>
											</div>
											<div class="form-group row">
												<div class="col-sm-6 mb-3 mb-sm-0">
													<input type="password"
														class="form-control form-control-user" maxlength="20"
														id="userPass" name="userPass" placeholder="Password">
												</div>
												<div class="col-sm-6">
													<input type="password"
														class="form-control form-control-user" maxlength="20"
														id="userPass2" name="userPass2" onchange="passchk()"
														placeholder="Repeat Password">
												</div>
											</div>
											<div class="form-group row">
												<div class="col-sm-6 mb-3 mb-sm-0">
													<input type="text" class="form-control form-control-user"
														maxlength="5" id="userName" name="userName"
														placeholder="Name">
												</div>
												<div class="col-sm-6">
													<input type="text" class="form-control form-control-user"
														maxlength="12" id="userNick" name="userNick"
														placeholder="NickName">
												</div>
											</div>
											<div class="form-group row">
												<div class="col-sm-6 mb-3 mb-sm-0">
													<input type="text" class="form-control form-control-user"
														maxlength="11" id="userTell" name="userTell"
														placeholder="Tell">
												</div>
												<div class="col-sm-6">
													<input type="text" class="form-control form-control-user"
														maxlength="8" id="userBirth" name="userBirth"
														placeholder="Birth ex) 19991201">
												</div>
											</div>
											<div class="form-group">
												<input type="email" class="form-control form-control-user"
													maxlength="50" id="userEmail" name="userEmail"
													placeholder="Email Address">
											</div>


											<div class="form-group row">
												<div class="col-sm-6 mb-3 mb-sm-0">
													<label class="box-radio-input"><input type="radio"
														name="userGender" value="M" checked="checked"><span>??????</span></label>
												</div>
												<div class="col-sm-6">
													<label class="box-radio-input"><input type="radio"
														name="userGender" value="F"><span>??????</span></label>
												</div>
											</div>

											<button class="btn btn-primary btn-user btn-block"
												type="submit" id="submit">????????????</button>
											<hr>
											<a href="/board/index"
												class="btn btn-google btn-user btn-block"> <i
												class="fab  fa-fw"></i> ???????????? ??????
											</a> <a href="/board/index"
												class="btn btn-facebook btn-user btn-block"> <i
												class="fab -f fa-fw"></i> ???
											</a>

											<hr>

											<a href="/home"><button
													class="btn btn-secondary btn-user btn-block" id="loginBtn"
													type="button">?????????</button> </a>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
				<!-- ???????????? ??? ???-->
			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
<!-- 			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2021</span>
					</div>
				</div>
			</footer> -->
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">???????????? ???????????????????</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">??</span>
					</button>
				</div>
				<div class="modal-body">??????????????? ????????? ???????????? ???????????????.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">??????</button>
					<a class="btn btn-primary" href="/member/logout">????????????</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="/resources/boot/vendor/jquery/jquery.min.js"></script>
	<script
		src="/resources/boot/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="/resources/boot/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/resources/boot/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="/resources/boot/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="/resources/boot/js/demo/chart-area-demo.js"></script>
	<script src="/resources/boot/js/demo/chart-pie-demo.js"></script>

	<style>
.box-radio-input input[type="radio"] {
	display: none;
}

.box-radio-input input[type="radio"]+span {
	background: none;
	border: 1px solid #dfdfdf;
	text-align: center;
	height: 35px;
	line-height: 33px;
	font-weight: 500;
	cursor: pointer;
	font-size: .8rem;
	border-radius: 10rem;
	padding: .75rem 1rem;
	width: 100%;
}

.box-radio-input input[type="radio"]:checked+span {
	color: #fff;
	background-color: #4e73df;
	border-color: #4e73df;
	font-size: .8rem;
	border-radius: 10rem;
	padding: .75rem 1rem;
	width: 100%;
}
</style>
	<script type="text/javascript">
	$(document).ready(function(){
		// ??????
		$(".cencle").on("click", function(){
			location.href = "/";
		})
		
		$("#submit").on("click", function(){
			if($("#userId").val()==""){
				Swal.fire("???????????? ??????????????????.","","warning");
				$("#userId").focus();
				return false;
			}
			if($("#userPass").val()==""){
				Swal.fire("??????????????? ??????????????????.","","warning");
				$("#userPass").focus();
				return false;
			}
			if($("#userPass").val().length <= 5){
				Swal.fire("???????????? 6?????? ???????????? ??????!","","warning");
				$("#userPass").focus();
				return false;
			}
			if($("#userPass2").val()==""){
				Swal.fire("????????????????????? ??????????????????.","","warning");
				$("#userPass2").focus();
				return false;
			}
			if($("#userPass2").val().length <= 5){
				Swal.fire("???????????? 6?????? ???????????? ??????!","","warning");
				$("#userPass2").focus();
				return false;
			}
			if($("#userName").val()==""){
				Swal.fire("????????? ??????????????????.","","warning");
				$("#userName").focus();
				return false;
			}
			if($("#userNick").val() == ""){
				Swal.fire("???????????? ??????????????????.","","warning");
				$("#userNick").focus();
				return false;
			}
			if($("#userTell").val()==""){
				Swal.fire("??????????????? ??????????????????.","","warning");
				$("#userTell").focus();
				return false;
			}

			if($("#userBirth").val() == ""){
				Swal.fire("??????????????? ??????????????????.","","warning");
				$("#userBirth").focus();
				return false;
			}
			if($("#userEmail").val()==""){
				Swal.fire("???????????? ??????????????????.","","warning");
				$("#userEmail").focus();
				return false;
			}
			
			var idChkVal = $("#idChk").val();
			if(idChkVal == "N"){
				Swal.fire("??????????????? ???????????????.","","info");
				return false;
			}else if(idChkVal == "Y"){
				$("#regForm").submit();
			}
			var regx = /^[a-zA-Z0-9]*$/;
			if (!num_regx.test($("#userTell").val())){
				Swal.fire("????????? ??????????????????.","","warning");
				   $("#userTell").focus();
				   return false;
				}
			 var userPass = $("#userPass").val()
			 var userPass2 = $("#userPass2").val()
			 if (userPass2.length != userPass2) {
				 Swal.fire($("#chk").text("??????????????? ???????????????"),"","warning");
			 } 
		});
	})
	function fn_idChk(){
			$.ajax({
				url : "/member/idChk",
				type : "post",
				dataType : "json",
				data : {"userId" : $("#userId").val()},
				success : function(data){
					console.log(data)
					if(data == 1){
						Swal.fire("????????? ??????????????????.","?????? ???????????? ??????????????????","warning");
					}else if(data == 0){
						$("#idChk").attr("value", "Y");
						Swal.fire("??????????????? ??????????????????.","","success");
					}
					else {
						Swal.fire("???????????????.","","success");
						
					}
				}
			})
		}
	function passchk(){
		 var userPass = $("#userPass").val()
		 var userPass2 = $("#userPass2").val()
		 if (userPass2.length == 0 || userPass2 == null) {
			 $("#chk").text("??????????????? ???????????????");
			
		 } else if (userPass != userPass2) {
				Swal.fire("??????????????? ????????????.","?????? ??????????????????","warning");
			
		 } else {   
				Swal.fire("??????????????? ???????????????.","????????? ??????????????????.","success");
			
		 }
		 return;
		}
			/*  $("#submit").on("click", function(){
				var right = 0;
				var regx = /^[a-zA-Z0-9]*$/;
				var chk1 = /\d/;
				var chk2 = /[a-z]/i;
				var num_regx = /^[0-9]*$/;
				var userId = $("#userId").val()
				var userPass = $("#userPass").val()
				var userPass2 = $("#userPass2").val()
				var userName = $("#userName").val()
				var userBirth = $("#userBirth").val()
				var userNick = $("#userNick").val()
				var userEmail = $("#userEmail").val()
				var userEmail = $("#userEmail").val()
				
				if(userId == ""){
					alert("???????????? ??????????????????.");
					$("#userId").focus();
					return false;
				}
				if (!regx.test(userId)){
					alert("???????????? ??????, ????????? ?????????????????????.");
					$("#userId").focus();
					return false;
				}
				
				if(userPass == null || userPass.length < 6){
					alert("??????????????? ??????????????????.(6?????? ??????)");
					$("#userPass").focus();
					return false;
				}
				if(userPass2 == null || userPass2.length < 6){
					alert("????????????????????? ??????????????????.(6?????? ??????)");
					$("#userPass2").focus();
					return false;
				}
				
				if(!regx.test(userPass)){
					alert("??????????????? ??????,?????? ???????????????.");
					$("#userPass").focus();
					return false;
				}
				
				if(right == 0){
					
				}
				
				if(userName == ""){
					alert("????????? ??????????????????.");
					$("#userName").focus();
					return false;
				}
				
				if(userBirth == ""){
					alert("??????????????? ??????????????????.");
					$("#userBirth").focus();
					return false;
				}
				
				if(userNick == ""){
					alert("???????????? ??????????????????.");
					$("#userNick").focus();
					return false;
				}
				
				if($("#userEmail").val()==""){
					alert("???????????? ??????????????????.");
					$("#userEmail").focus();
					return false;
				}
				
				
				if(userTell.length==0 || userTell.val() == "" ){
					alert("?????????????????? ???????????????.");
					return false;
				}
				if (!num_regx.test(userTell)){
				   alert("?????????????????? ????????? ?????????????????????");
				   return false;
				}

				
				var idChkVal = $("#idChk").val();
				if(idChkVal == "N"){
					alert("???????????? ????????? ???????????????.");
				}else if(idChkVal == "Y"){
					$("#regForm").submit();
				}
				
			});
			
		}); */

		 
	</script>

</body>

</html>