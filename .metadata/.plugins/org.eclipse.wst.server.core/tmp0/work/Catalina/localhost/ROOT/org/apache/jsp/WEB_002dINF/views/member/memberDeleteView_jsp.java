/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-19 02:05:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberDeleteView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
response.setHeader("Pragma","no-cache"); 
response.setDateHeader("Expires",0); 
response.setHeader("Cache-Control", "no-cache");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Board_memberDelete</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom fonts for this template-->\r\n");
      out.write("    <link href=\"/resources/boot/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template-->\r\n");
      out.write("    <link href=\"/resources/boot/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("	\r\n");
      out.write("<body class=\"bg-gradient-primary\">\r\n");
      out.write("\r\n");
      out.write("<!-- 탈퇴 창 시작-->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Outer Row -->\r\n");
      out.write("        <div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-10 col-lg-12 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("                    <div class=\"card-body p-0\">\r\n");
      out.write("                        <!-- Nested Row within Card Body -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>\r\n");
      out.write("                            <div class=\"col-lg-6\">\r\n");
      out.write("                                <div class=\"p-5\">\r\n");
      out.write("                                    <div class=\"text-center\">\r\n");
      out.write("                                        <h1 class=\"h4 text-gray-900 mb-4\">회원 탈퇴</h1>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <form class=\"user\" action=\"/member/memberDelete\" method=\"post\" id=\"delForm\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"userId\">아이디</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-control-user\"\r\n");
      out.write("                                                id=\"userId\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"userPass\">패스워드</label>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control form-control-user\"\r\n");
      out.write("                                                  id=\"userPass\" name=\"userPass\" placeholder=\"비밀번호입력...\" >\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"userName\">성명</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-control-user\"\r\n");
      out.write("                                                  id=\"userName\" name=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <hr>\r\n");
      out.write("             					<button class=\"btn btn-google btn-user btn-block\" type=\"button\" id=\"submit\">회원탈퇴</button>\r\n");
      out.write("                                <input type=\"button\" value=\"취소\" class=\"btn btn-primary btn-user btn-block\" onclick=\"goBack();\"/>\r\n");
      out.write("  \r\n");
      out.write("                                    </form>\r\n");
      out.write("										<div>\r\n");
      out.write("										");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("<!-- 탈퇴 창 끝-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"/resources/boot/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/boot/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"/resources/boot/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"/resources/boot/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("   		function goBack(){\r\n");
      out.write("     	 window.history.back();\r\n");
      out.write("   		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("			// 취소\r\n");
      out.write("			$(\".cencle\").on(\"click\", function(){\r\n");
      out.write("				\r\n");
      out.write("				location.href = \"/home\";\r\n");
      out.write("						    \r\n");
      out.write("			})\r\n");
      out.write("		\r\n");
      out.write("			$(\"#submit\").on(\"click\", function(){\r\n");
      out.write("				if($(\"#userPass\").val()==\"\"){\r\n");
      out.write("					alert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("					$(\"#userPass\").focus();\r\n");
      out.write("					return false;\r\n");
      out.write("				}\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url : \"/member/passChk\",\r\n");
      out.write("					type : \"POST\",\r\n");
      out.write("					dataType : \"json\",\r\n");
      out.write("					data : $(\"#delForm\").serializeArray(),\r\n");
      out.write("					success: function(data){\r\n");
      out.write("						\r\n");
      out.write("						if(data==0){\r\n");
      out.write("							alert(\"패스워드가 틀렸습니다.\");\r\n");
      out.write("							return;\r\n");
      out.write("						}else{\r\n");
      out.write("							if(confirm(\"회원탈퇴하시겠습니까?\")){\r\n");
      out.write("								$(\"#delForm\").submit();\r\n");
      out.write("							}\r\n");
      out.write("							\r\n");
      out.write("						}\r\n");
      out.write("					}\r\n");
      out.write("				})\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/memberDeleteView.jsp(81,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg == false}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("											비밀번호가 맞지 않습니다.\r\n");
          out.write("										");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
