/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-16 05:09:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.15.RELEASE.jar", Long.valueOf(1624522595697L));
    _jspx_dependants.put("jar:file:/C:/Users/UMC/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TestPjt/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1624521132367L));
    _jspx_dependants.put("jar:file:/C:/Users/UMC/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TestPjt/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/UMC/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TestPjt/WEB-INF/lib/spring-webmvc-5.2.15.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1620767206000L));
    _jspx_dependants.put("jar:file:/C:/Users/UMC/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TestPjt/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Board_Register</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template-->\r\n");
      out.write("<link href=\"/resources/boot/vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template-->\r\n");
      out.write("<link href=\"/resources/boot/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("function fn_idChk(){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/member/idChk\",\r\n");
      out.write("				type : \"post\",\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("				data : {\"userId\" : $(\"#userId\").val()},\r\n");
      out.write("				success : function(data){\r\n");
      out.write("					if(data == 1){\r\n");
      out.write("						alert(\"중복된 아이디입니다.\");\r\n");
      out.write("					}\r\n");
      out.write("					else if(data == 0){\r\n");
      out.write("						$(\"#idChk\").attr(\"value\", \"Y\");\r\n");
      out.write("						alert(\"사용가능한 아이디입니다.\");\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("</script>\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Page Wrapper -->\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Sidebar -->\r\n");
      out.write("		<ul\r\n");
      out.write("			class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\"\r\n");
      out.write("			id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Sidebar - Brand -->\r\n");
      out.write("			<a\r\n");
      out.write("				class=\"sidebar-brand d-flex align-items-center justify-content-center\"\r\n");
      out.write("				href=\"index.html\">\r\n");
      out.write("				<div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("					<i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"sidebar-brand-text mx-3\">\r\n");
      out.write("					DH<sup>PAGE</sup>\r\n");
      out.write("				</div>\r\n");
      out.write("			</a>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Dashboard -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("				href=\"index.html\"> <i class=\"fas fa-fw fa-tachometer-alt\"></i> <span>HOME</span></a>\r\n");
      out.write("			</li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Heading -->\r\n");
      out.write("			<!-- <div class=\"sidebar-heading\">\r\n");
      out.write("                Interface\r\n");
      out.write("            </div> -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("			<!-- <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                    <span>Components</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Components:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"buttons.html\">Buttons</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"cards.html\">Cards</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li> -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("			<!--  <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("                    <span>Utilities</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("                    data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Utilities:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-border.html\">Borders</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li> -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<!-- <hr class=\"sidebar-divider\"> -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Heading -->\r\n");
      out.write("			<div class=\"sidebar-heading\">Addons</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link collapsed\" href=\"#\"\r\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("				aria-expanded=\"true\" aria-controls=\"collapsePages\"> <i\r\n");
      out.write("					class=\"fas fa-fw fa-folder\"></i> <span>PAGES</span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<div id=\"collapsePages\" class=\"collapse\"\r\n");
      out.write("					aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("					<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("						<h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("						<a class=\"collapse-item \" href=\"/home\">Login</a> <a\r\n");
      out.write("							class=\"collapse-item active\" id=\"registerBtn\" type=\"button\">Register</a>\r\n");
      out.write("						<!--                       <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\r\n");
      out.write("                        <div class=\"collapse-divider\"></div>\r\n");
      out.write("                        <h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a> -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Charts -->\r\n");
      out.write("			<!--             <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("                    <span>Charts</span></a>\r\n");
      out.write("            </li> -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Tables -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"/board/list\">\r\n");
      out.write("					<i class=\"fas fa-fw fa-table\"></i> <span>BOARD</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("			<div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("				<button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("		<!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Content Wrapper -->\r\n");
      out.write("		<div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Main Content -->\r\n");
      out.write("			<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("				<!-- Topbar -->\r\n");
      out.write("				<nav\r\n");
      out.write("					class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("					<!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("					<button id=\"sidebarToggleTop\"\r\n");
      out.write("						class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("						<i class=\"fa fa-bars\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- Topbar Search -->\r\n");
      out.write("					<form\r\n");
      out.write("						class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							REGISTER\r\n");
      out.write("							<!--                              <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\r\n");
      out.write("                                aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                    <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- Topbar Navbar -->\r\n");
      out.write("					<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("						<li class=\"nav-item dropdown no-arrow d-sm-none\"><a\r\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\"\r\n");
      out.write("							role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("							aria-expanded=\"false\"> <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("						</a> <!-- Dropdown - Messages -->\r\n");
      out.write("							<div\r\n");
      out.write("								class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\r\n");
      out.write("								aria-labelledby=\"searchDropdown\">\r\n");
      out.write("								<form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("									<div class=\"input-group\">\r\n");
      out.write("										<input type=\"text\"\r\n");
      out.write("											class=\"form-control bg-light border-0 small\"\r\n");
      out.write("											placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("											aria-describedby=\"basic-addon2\">\r\n");
      out.write("										<div class=\"input-group-append\">\r\n");
      out.write("											<button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("												<i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("											</button>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!-- Nav Item - User Information -->\r\n");
      out.write("						<li class=\"nav-item dropdown no-arrow\"><a\r\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\"\r\n");
      out.write("							role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("							aria-expanded=\"false\"> <span\r\n");
      out.write("								class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas\r\n");
      out.write("									McGee</span> <img class=\"img-profile rounded-circle\"\r\n");
      out.write("								src=\"/resources/boot/img/undraw_profile.svg\">\r\n");
      out.write("						</a></li>\r\n");
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("\r\n");
      out.write("				</nav>\r\n");
      out.write("				<!-- End of Topbar -->\r\n");
      out.write("				\r\n");
      out.write("				<!-- 회원가입 창 시작-->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("            <div class=\"card-body p-0\">\r\n");
      out.write("                <!-- Nested Row within Card Body -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-5 d-none d-lg-block bg-register-image\"></div>\r\n");
      out.write("                    <div class=\"col-lg-7\">\r\n");
      out.write("                        <div class=\"p-5\">\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <h1 class=\"h4 text-gray-900 mb-4\">Create an Account!</h1>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <form class=\"user\" action=\"/member/register\" method=\"post\">\r\n");
      out.write("  								<div class=\"form-group row\">\r\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" maxlength=\"15\" id=\"userId\" name=\"userId\"\r\n");
      out.write("                                            placeholder=\"ID\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <button class=\"idChk btn btn-primary btn-user btn-block\" type=\"button\" id=\"idChk\" onclick=\"fn_idChk();\" value=\"N\">중복확인</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" maxlength=\"12\" id=\"userName\" name=\"userName\"\r\n");
      out.write("                                            placeholder=\"Name\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" maxlength=\"12\" id=\"userNick\" name=\"userNick\"\r\n");
      out.write("                                            placeholder=\"NickName\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" maxlength=\"13\" id=\"userTell\" name=\"userTell\"\r\n");
      out.write("                                            placeholder=\"Tell\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" maxlength=\"8\" id=\"userBirth\" name=\"userBirth\"\r\n");
      out.write("                                            placeholder=\"Birth ex) 19991201\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"email\" class=\"form-control form-control-user\" maxlength=\"20\" id=\"userEmail\" name=\"userEmail\"\r\n");
      out.write("                                        placeholder=\"Email Address\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-user\"\r\n");
      out.write("                                             maxlength=\"20\" id=\"userPass\" name=\"userPass\" placeholder=\"Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-user\"\r\n");
      out.write("                                            maxlength=\"20\" id=\"userPass2\" name=\"userPass2\" onchange=\"passchk()\" placeholder=\"Repeat Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write(" 								<div class=\"form-group row\">\r\n");
      out.write(" 									<div class=\"col-sm-6 mb-3 mb-sm-0\">	\r\n");
      out.write("										<label class=\"box-radio-input\"><input type=\"radio\" name=\"userGender\" value=\"M\" checked=\"checked\" ><span>남자</span></label>\r\n");
      out.write("								</div>\r\n");
      out.write("									<div class=\"col-sm-6\">\r\n");
      out.write("                    					<label class=\"box-radio-input\"><input type=\"radio\" name=\"userGender\" value=\"F\" ><span>여자</span></label>\r\n");
      out.write("                    				</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								\r\n");
      out.write("                                <button class=\"btn btn-primary btn-user btn-block\" type=\"submit\" id=\"submit\">회원가입</button>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <a href=\"/board/index\" class=\"btn btn-google btn-user btn-block\">\r\n");
      out.write("                                    <i class=\"fab  fa-fw\"></i> 회원가입 취소\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a href=\"/board/list\" class=\"btn btn-facebook btn-user btn-block\">\r\n");
      out.write("                                    <i class=\"fab -f fa-fw\"></i> 게시판\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <!-- <a class=\"small\" href=\"forgot-password.html\">Forgot Password?</a> -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <a class=\"small\" href=\"/home\">Already have an account? Login!</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("<!-- 회원가입 창 끝-->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Footer -->\r\n");
      out.write("			<footer class=\"sticky-footer bg-white\">\r\n");
      out.write("				<div class=\"container my-auto\">\r\n");
      out.write("					<div class=\"copyright text-center my-auto\">\r\n");
      out.write("						<span>Copyright &copy; Your Website 2021</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</footer>\r\n");
      out.write("			<!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Scroll to Top Button-->\r\n");
      out.write("	<a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i\r\n");
      out.write("		class=\"fas fa-angle-up\"></i>\r\n");
      out.write("	</a>\r\n");
      out.write("\r\n");
      out.write("	<!-- Logout Modal-->\r\n");
      out.write("	<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("					<button class=\"close\" type=\"button\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">×</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">Select \"Logout\" below if you are ready\r\n");
      out.write("					to end your current session.</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("						data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("					<a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Bootstrap core JavaScript-->\r\n");
      out.write("	<script src=\"/resources/boot/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"/resources/boot/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Core plugin JavaScript-->\r\n");
      out.write("	<script src=\"/resources/boot/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Custom scripts for all pages-->\r\n");
      out.write("	<script src=\"/resources/boot/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Page level plugins -->\r\n");
      out.write("	<script src=\"/resources/boot/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Page level custom scripts -->\r\n");
      out.write("	<script src=\"/resources/boot/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("	<script src=\"/resources/boot/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<style>\r\n");
      out.write("	.box-radio-input input[type=\"radio\"]{\r\n");
      out.write("  display:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box-radio-input input[type=\"radio\"] + span{\r\n");
      out.write("  background:none;\r\n");
      out.write("  border:1px solid #dfdfdf;  \r\n");
      out.write("  text-align:center;\r\n");
      out.write("  height:35px;\r\n");
      out.write("  line-height:33px;\r\n");
      out.write("  font-weight:500;\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("  font-size: .8rem;\r\n");
      out.write("    border-radius: 10rem;\r\n");
      out.write("    padding: .75rem 1rem;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box-radio-input input[type=\"radio\"]:checked + span{\r\n");
      out.write("	color: #fff;\r\n");
      out.write("    background-color: #4e73df;\r\n");
      out.write("    border-color: #4e73df;\r\n");
      out.write("    font-size: .8rem;\r\n");
      out.write("    border-radius: 10rem;\r\n");
      out.write("    padding: .75rem 1rem;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("	</style>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			$(\"#submit\").on(\"click\", function(){\r\n");
      out.write("				var right = 0;\r\n");
      out.write("				var regx = /^[a-zA-Z0-9]*$/;\r\n");
      out.write("				var chk1 = /\\d/;\r\n");
      out.write("				var chk2 = /[a-z]/i;\r\n");
      out.write("				var num_regx = /^[0-9]*$/;\r\n");
      out.write("				var userId = $(\"#userId\").val()\r\n");
      out.write("				var userPass = $(\"#userPass\").val()\r\n");
      out.write("				var userPass2 = $(\"#userPass2\").val()\r\n");
      out.write("				var userName = $(\"#userName\").val()\r\n");
      out.write("				var userBirth = $(\"#userBirth\").val()\r\n");
      out.write("				var userNick = $(\"#userNick\").val()\r\n");
      out.write("				var userEmail = $(\"#userEmail\").val()\r\n");
      out.write("				var userEmail = $(\"#userEmail\").val()\r\n");
      out.write("				\r\n");
      out.write("				if(userId == \"\"){\r\n");
      out.write("					alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("					$(\"#userId\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				if (!regx.test(userId)){\r\n");
      out.write("					alert(\"아이디는 영어, 숫자만 입력가능합니다.\");\r\n");
      out.write("					$(\"#userId\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(userPass == null || userPass.length < 6){\r\n");
      out.write("					alert(\"비밀번호를 입력해주세요.(6글자 이상)\");\r\n");
      out.write("					$(\"#userPass\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				if(userPass2 == null || userPass2.length < 6){\r\n");
      out.write("					alert(\"비밀번호확인을 입력해주세요.(6글자 이상)\");\r\n");
      out.write("					$(\"#userPass2\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(!regx.test(userPass)){\r\n");
      out.write("					alert(\"비밀번호는 영어,숫자 조합입니다.\");\r\n");
      out.write("					$(\"#userPass\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(right == 0){\r\n");
      out.write("					alert(\"비밀번호가 동일한지 확인하세요.\");\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(userName == \"\"){\r\n");
      out.write("					alert(\"성명을 입력해주세요.\");\r\n");
      out.write("					$(\"#userName\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(userBirth == \"\"){\r\n");
      out.write("					alert(\"생년월일을 입력해주세요.\");\r\n");
      out.write("					$(\"#userBirth\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if(userNick == \"\"){\r\n");
      out.write("					alert(\"닉네임을 입력해주세요.\");\r\n");
      out.write("					$(\"#userNick\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				if($(\"#userEmail\").val()==\"\"){\r\n");
      out.write("					alert(\"이메일을 입력해주세요.\");\r\n");
      out.write("					$(\"#userEmail\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				if(userTell.length==0 || userTell.val() == \"\" ){\r\n");
      out.write("					alert(\"핸드폰번호를 입력하세요.\");\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				if (!num_regx.test(userTell)){\r\n");
      out.write("				   alert(\"핸드폰번호는 숫자만 입력가능합니다\");\r\n");
      out.write("				   return false;\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				var idChkVal = $(\"#idChk\").val();\r\n");
      out.write("				if(idChkVal == \"N\"){\r\n");
      out.write("					alert(\"중복확인 버튼을 눌러주세요.\");\r\n");
      out.write("				}else if(idChkVal == \"Y\"){\r\n");
      out.write("					$(\"#regForm\").submit();\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("		function passchk(){\r\n");
      out.write("			 var userPass = $(\"#userPass\").val()\r\n");
      out.write("			 var userPass2 = $(\"#userPass2\").val()\r\n");
      out.write("			 if (userPass2.length == 0 || userPass2 == null) {\r\n");
      out.write("				 $(\"#chk\").text(\"비밀번호를 입력하세요\");\r\n");
      out.write("				 right = 0;\r\n");
      out.write("			 } else if (userPass != userPass2) {\r\n");
      out.write("				 alert(\"비밀번호가 다릅니다.\");\r\n");
      out.write("				 right = 0;\r\n");
      out.write("			 } else {   \r\n");
      out.write("				 alert(\"비밀번호가 동일합니다.\");\r\n");
      out.write("				 right = 1;\r\n");
      out.write("			 }\r\n");
      out.write("			 return;\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
