/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-01 08:46:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class readView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/board/nav.jsp", Long.valueOf(1625126224418L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1624521132367L));
    _jspx_dependants.put("jar:file:/C:/Users/UMC/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TestPjt/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("		<!-- 부가적인 테마 -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("		<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("	 	<title>게시판</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("			var formObj = $(\"form[name='readForm']\");\r\n");
      out.write("			\r\n");
      out.write("			// 수정 \r\n");
      out.write("			$(\".update_btn\").on(\"click\", function(){\r\n");
      out.write("				formObj.attr(\"action\", \"/board/updateView\");\r\n");
      out.write("				formObj.attr(\"method\", \"get\");\r\n");
      out.write("				formObj.submit();				\r\n");
      out.write("			})\r\n");
      out.write("			\r\n");
      out.write("			// 삭제\r\n");
      out.write("			$(\".delete_btn\").on(\"click\", function(){\r\n");
      out.write("				\r\n");
      out.write("				var deleteYN = confirm(\"삭제하시겠습니까?\");\r\n");
      out.write("				if(deleteYN == true){\r\n");
      out.write("					\r\n");
      out.write("				formObj.attr(\"action\", \"/board/delete\");\r\n");
      out.write("				formObj.attr(\"method\", \"post\");\r\n");
      out.write("				formObj.submit();\r\n");
      out.write("					\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("			\r\n");
      out.write("			// 목록\r\n");
      out.write("			$(\".list_btn\").on(\"click\", function(){\r\n");
      out.write("\r\n");
      out.write("			location.href = \"/board/list?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("			+\"&perPageNum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.perPageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("			+\"&searchType=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.searchType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&keyword=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("			})\r\n");
      out.write("		\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<header>\r\n");
      out.write("				<h1> 게시판 - 상세</h1>\r\n");
      out.write("			</header>\r\n");
      out.write("			<hr />\r\n");
      out.write("			 \r\n");
      out.write("			<div>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("	li {list-style: none; display:inline; padding: 6px;}\r\n");
      out.write("		</style>\r\n");
      out.write("	\r\n");
      out.write("		<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("		<!-- 부가적인 테마 -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("		<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("	 	<title></title>\r\n");
      out.write("	</head>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("<div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<a href=\"/board/list\">게시물 목록</a>\r\n");
      out.write("		-\r\n");
      out.write("		<a href=\"/board/writeView\">글 작성</a>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr />\r\n");
      out.write("			\r\n");
      out.write("			<section id=\"container\">\r\n");
      out.write("				<form name=\"readForm\" role=\"form\" method=\"post\">\r\n");
      out.write(" 					 <input type=\"hidden\" id=\"bno\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write(" 					 <input type=\"hidden\" id=\"page\" name=\"page\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write(" 					 <input type=\"hidden\" id=\"perPageNum\" name=\"perPageNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.perPageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write(" 					 <input type=\"hidden\" id=\"searchType\" name=\"searchType\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.searchType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("					 <input type=\"hidden\" id=\"keyword\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scri.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"title\" class=\"col-sm-2 control-label\">제목</label>\r\n");
      out.write("								");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"content\" class=\"col-sm-2 control-label\">내용</label>\r\n");
      out.write("								<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"writer\" class=\"col-sm-2 control-label\">작성자</label>\r\n");
      out.write("								");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("								\r\n");
      out.write("							</div>\r\n");
      out.write("								\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"regdate\" class=\"col-sm-2 control-label\">작성날짜</label>\r\n");
      out.write("								");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("					\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"editor\" class=\"col-sm-2 control-label\">수정자</label>\r\n");
      out.write("								");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.editor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("								\r\n");
      out.write("							</div>\r\n");
      out.write("								\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"editdate\" class=\"col-sm-2 control-label\">수정날짜</label>\r\n");
      out.write("								");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("					\r\n");
      out.write("							</div>		\r\n");
      out.write("							\r\n");
      out.write("				<div>\r\n");
      out.write("					<button type=\"button\" class=\"update_btn btn btn-outline-info\">수정</button>\r\n");
      out.write("\r\n");
      out.write("					<button type=\"button\" class=\"list_btn btn btn-outline-info\">목록</button>	\r\n");
      out.write("				</div>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/board/readView.jsp(91,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.regdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/board/readView.jsp(91,8) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f1_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f1.setParent(null);
      // /WEB-INF/views/board/readView.jsp(102,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${read.editdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/board/readView.jsp(102,8) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setPattern("yyyy-MM-dd HH:mm:ss");
      int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      _jspx_th_fmt_005fformatDate_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f1_reused);
    }
    return false;
  }
}
