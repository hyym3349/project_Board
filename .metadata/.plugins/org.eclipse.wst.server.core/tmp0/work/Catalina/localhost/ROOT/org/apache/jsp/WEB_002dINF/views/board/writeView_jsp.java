/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-06-28 01:50:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/board/nav.jsp", Long.valueOf(1624839839722L));
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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("		<!-- 부가적인 테마 -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("		\r\n");
      out.write("		<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("		\r\n");
      out.write("	 	<title>게시판</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("		<!-- 작성버튼을 눌렀을때 벨리데이션을 체크하기 위한 함수  -->\r\n");
      out.write("		<!-- chk라는 클래스의 i번째가 공백이거나 null이면 알러트로 i번째의 타이틀을 출력해주는 함수  -->\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("			var formObj = $(\"form[name='writeForm']\");\r\n");
      out.write("			$(\".write_btn\").on(\"click\", function(){\r\n");
      out.write("				if(fn_valiChk()){\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				formObj.attr(\"action\", \"/board/write\");\r\n");
      out.write("				formObj.attr(\"method\", \"post\");\r\n");
      out.write("				formObj.submit();\r\n");
      out.write("			});\r\n");
      out.write("		})\r\n");
      out.write("		function fn_valiChk(){\r\n");
      out.write("			var regForm = $(\"form[name='writeForm'] .chk\").length;\r\n");
      out.write("			for(var i = 0; i<regForm; i++){\r\n");
      out.write("				if($(\".chk\").eq(i).val() == \"\" || $(\".chk\").eq(i).val() == null){\r\n");
      out.write("					alert($(\".chk\").eq(i).attr(\"title\"));\r\n");
      out.write("					return true;\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<header>\r\n");
      out.write("				<h1> 게시판</h1>\r\n");
      out.write("			</header>\r\n");
      out.write("			<hr />\r\n");
      out.write("			 \r\n");
      out.write("			<div>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("	li {list-style: none; display:inline; padding: 6px;}\r\n");
      out.write("</style>\r\n");
      out.write("<div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<a href=\"/board/list\">목록</a>\r\n");
      out.write("		<a href=\"/board/writeView\">글 작성</a>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr />\r\n");
      out.write("			\r\n");
      out.write("			<section id=\"container\">\r\n");
      out.write("				<form role=\"writeForm\" method=\"post\" action=\"/board/write\">\r\n");
      out.write("					<table class=\"table table-hover\">\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"title\" class=\"col-sm-2 control-label\">제목</label>\r\n");
      out.write("						<input type=\"text\" id=\"title\" name=\"title\" class=\"form-control\" title=\"제목을 입력하세요.\" />\r\n");
      out.write("					</div>\r\n");
      out.write("		\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"content\" class=\"col-sm-2 control-label\">내용</label>\r\n");
      out.write("						<textarea id=\"content\" name=\"content\" class=\"form-control\" title=\"내용을 입력하세요.\"></textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"writer\" class=\"col-sm-2 control-label\">작성자</label>\r\n");
      out.write("						<input type=\"text\" id=\"writer\" name=\"writer\" class=\"form-control\" title=\"작성자을 입력하세요.\"/>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("						<button type=\"submit\" class=\"update_btn btn btn-success\">작성</button>\r\n");
      out.write("		\r\n");
      out.write("					</table>\r\n");
      out.write("				</form>\r\n");
      out.write("			</section>\r\n");
      out.write("			<hr />\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
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
