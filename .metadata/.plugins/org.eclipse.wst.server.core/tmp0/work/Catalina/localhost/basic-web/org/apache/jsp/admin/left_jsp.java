/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2017-12-21 04:01:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("\n");
      out.write("<title>My JSP 'left.jsp' starting page</title>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\" src=\"js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t//导航切换\n");
      out.write("\t\t$(\".menuson li\").click(function() {\n");
      out.write("\t\t\t$(\".menuson li.active\").removeClass(\"active\")\n");
      out.write("\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('.title').click(function() {\n");
      out.write("\t\t\tvar $ul = $(this).next('ul');\n");
      out.write("\t\t\t$('dd').find('ul').slideUp();\n");
      out.write("\t\t\tif ($ul.is(':visible')) {\n");
      out.write("\t\t\t\t$(this).next('ul').slideUp();\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$(this).next('ul').slideDown();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t})\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background: #1abc9c;\">\n");
      out.write("\t<!-- <div class=\"lefttop\"><span></span>通讯录</div> -->\n");
      out.write("\n");
      out.write("\t<dl class=\"leftmenu\">\n");
      out.write("\n");
      out.write("\t\t<dd>\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<span><img src=\"images/leftico01.png\" /> </span>信息管理\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"menuson\">\n");
      out.write("\n");
      out.write("\t\t\t\t  <li><cite></cite><a href=\"http://localhost:8080/houtaiJsp/admin.jsp\" target=\"_blank\">另外一个管理后台</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/admin/add_user.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加用户</a><i></i></li>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/add_text.jsp\" target=\"rightFrame\">录入文章</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/admin/user/UserList\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">用户管理</a><i></i></li>\n");
      out.write("\t\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/admin/user/BattleList\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">约战管理</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/admin/court/GetReviewList\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">审核管理</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/admin/court/GetSchoolList \"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">学校管理</a><i></i></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/dynamic/ToAddDynamic\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">发布动态</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/admin/add_park.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加公园</a><i></i></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/admin/uploadPhoto.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">上传图片</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/jsp/add_special.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加专题</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/ailanqiu/jsp/add_zhuanji.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加专辑</a><i></i></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/craw.jsp\" target=\"rightFrame\">CRAW</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/common_craw.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">COMMON_CRAW</a><i></i></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/downloadimg.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">下载公众号图片</a><i></i></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- <li><cite></cite><a href=\"jsp/add_video.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">下载视频</a><i></i></li> -->\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/admin/addTeam.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">录入球队</a><i></i></li>\n");
      out.write("\t\t\t\t<!-- <li><cite></cite><a href=\"lbacomment/ToAddLbaCommentAction\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加专栏</a><i></i></li> -->\n");
      out.write("\t\t\t\t<!-- <li><cite></cite><a href=\"lbacomment/LbaCommentListAction\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">专栏列表</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/news/NewsListAction\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">News</a><i></i></li> -->\n");
      out.write("\t\t\t\t<!-- <li class=\"active\"><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"/direct/DirectListAction\" target=\"rightFrame\">直播</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/news/SpecialListAction\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">专题</a><i></i></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"/videoapp/VideoListForApp?pageNo=1&pageSize=10\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\">视频</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"/tacticsapp/TacticsListForApp?pageNo=1&pageSize=10\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\">战术</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"\" target=\"_blank\">规则</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"/newsapp/NewsListForApp?pageNo=1&pageSize=10\" target=\"_blank\">新闻</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/newsapp/BestPlayerListForApp\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\">历届状元</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/newsapp/ChampionListForApp\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\">历届冠军</a><i></i></li> -->\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<dd>\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<span><img src=\"images/leftico03.png\" /> </span>资讯管理\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"menuson\">\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/add_video.jsp\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">录入视频</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"jsp/add_text.jsp\" target=\"rightFrame\">录入文章</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<dd>\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<span><img src=\"images/leftico03.png\" /> </span>社区管理\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"menuson\">\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/dynamic/ToAddDynamic\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">发布动态</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"admin/dynamic/DynamicList?pageNo=1&pageSize=20\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">帖子管理</a><i></i></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<dd>\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<span><img src=\"images/leftico03.png\" /> </span>问卷管理\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"menuson\">\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"admin/dynamic/GetAllQuestionnaire\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">添加问卷</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"http://www.lanqiure.com/review/lbquestionnaire/GetQuestionnaireList\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">问卷列表</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("\t\t<dd>\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<span><img src=\"images/leftico03.png\" /> </span>权限管理\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"menuson\">\n");
      out.write("\t\t\t\t<li><cite></cite><a href=\"/sys/manage/authority/user_role.html\"\n");
      out.write("\t\t\t\t\ttarget=\"rightFrame\">用户-角色</a><i></i></li>\n");
      out.write("\t\t\t\t<li><cite></cite><a\n");
      out.write("\t\t\t\t\thref=\"/sys/manage/authority/role_resource.html\" target=\"rightFrame\">角色-资源</a><i></i>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t</dl>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
