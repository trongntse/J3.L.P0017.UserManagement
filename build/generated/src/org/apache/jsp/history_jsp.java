package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tag_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tag_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tag_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tag_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tag_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tag_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tag_set_var_value_scope_nobody.release();
    _jspx_tagPool_tag_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_tag_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>History_Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("         <script src=\"https://kit.fontawesome.com/478461b23c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-xl\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"adminPage.jsp\">MANAGER_USER</a>\n");
      out.write("                                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8\">\t\t\t\t\t\t\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>                 \n");
      out.write("                    ");
      if (_jspx_meth_tag_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.LOGIN_USER.userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <h2>WELLCOME ADMIN: </b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h2>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"LogoutController\" class=\"btn btn-primary\"><i class=\"fa fa-user-o\"></i> <span>Logout</span></a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_tag_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_tag_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_tag_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_tag_if_0.setPageContext(_jspx_page_context);
    _jspx_th_tag_if_0.setParent(null);
    _jspx_th_tag_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LIST_HISTORY != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_tag_if_0 = _jspx_th_tag_if_0.doStartTag();
    if (_jspx_eval_tag_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_tag_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tag_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_tag_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_tag_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_tag_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_tag_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_tag_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tag_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_0);
      return true;
    }
    _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_0);
    return false;
  }

  private boolean _jspx_meth_tag_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tag_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_tag_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_tag_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_tag_set_0.setPageContext(_jspx_page_context);
    _jspx_th_tag_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tag_if_0);
    _jspx_th_tag_set_0.setVar("list");
    _jspx_th_tag_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LIST_HISTORY}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_set_0.setScope("page");
    int _jspx_eval_tag_set_0 = _jspx_th_tag_set_0.doStartTag();
    if (_jspx_th_tag_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tag_set_var_value_scope_nobody.reuse(_jspx_th_tag_set_0);
      return true;
    }
    _jspx_tagPool_tag_set_var_value_scope_nobody.reuse(_jspx_th_tag_set_0);
    return false;
  }

  private boolean _jspx_meth_tag_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_tag_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_tag_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_tag_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_tag_if_1.setPageContext(_jspx_page_context);
    _jspx_th_tag_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tag_if_0);
    _jspx_th_tag_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty list}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_tag_if_1 = _jspx_th_tag_if_1.doStartTag();
    if (_jspx_eval_tag_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <table class=\"table table-striped table-hover\">\n");
        out.write("                                <thead>\n");
        out.write("                                    <tr>                                   \n");
        out.write("\n");
        out.write("                                        <th>User ID</th>\n");
        out.write("                                        <th>Assignment Date</th>                 \n");
        out.write("                                        <th>Rank</th>\t\t\t\t\t\t\n");
        out.write("                                        <th></th>\n");
        out.write("                                        <th></th>  \n");
        out.write("                                        <th></th>\n");
        out.write("                                        <th></th>\n");
        out.write("                                    </tr>\n");
        out.write("                                </thead>\n");
        out.write("                                <tbody>\n");
        out.write("                                    ");
        if (_jspx_meth_tag_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_tag_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </tbody>\n");
        out.write("                            </table>\n");
        out.write("                        </div>\n");
        out.write("                    </div>        \n");
        out.write("                </div>  \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_tag_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tag_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_1);
      return true;
    }
    _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_1);
    return false;
  }

  private boolean _jspx_meth_tag_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tag_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_tag_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_tag_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_tag_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_tag_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tag_if_1);
    _jspx_th_tag_forEach_0.setVar("dto");
    _jspx_th_tag_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageScope.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_tag_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_tag_forEach_0 = _jspx_th_tag_forEach_0.doStartTag();
      if (_jspx_eval_tag_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                    <form action=\"HistoryController\">  \n");
          out.write("                                        <td><input style=\"width: 120px\" class=\"form-control\" type=\"text\" name=\"userID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly=\"true\"/></td>\n");
          out.write("                                        <td><input style=\"width: 120px\" class=\"form-control\" type=\"text\" name=\"promotionID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.itemsName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly=\"true\"/></td>                                      \n");
          out.write("                                        <td><input type=\"number\" name=\"rank\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly=\"true\"></td>\n");
          out.write("                                        <td></td>\n");
          out.write("                                        <td></td> \n");
          out.write("                                        <td></td>\n");
          out.write("                                        <td></td>                                        \n");
          out.write("                                        </tr>\n");
          out.write("                                    </form>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_tag_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_tag_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tag_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tag_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tag_forEach_0.doFinally();
      _jspx_tagPool_tag_forEach_var_items.reuse(_jspx_th_tag_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_tag_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_tag_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_tag_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_tag_if_2.setPageContext(_jspx_page_context);
    _jspx_th_tag_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tag_if_0);
    _jspx_th_tag_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ empty list}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_tag_if_2 = _jspx_th_tag_if_2.doStartTag();
    if (_jspx_eval_tag_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <h1>No Items</h1>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_tag_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tag_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_2);
      return true;
    }
    _jspx_tagPool_tag_if_test.reuse(_jspx_th_tag_if_2);
    return false;
  }
}
