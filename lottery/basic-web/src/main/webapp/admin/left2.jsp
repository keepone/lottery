<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    
	<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>

  </head>
  
  <body style="background: #1abc9c;">
	<!-- <div class="lefttop"><span></span>通讯录</div> -->
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>信息管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="/company/BackGroundAction" target="rightFrame">首页</a><i></i></li>
       
        <li><cite></cite><a href="lbacomment/ToAddLbaCommentAction" target="rightFrame">添加专栏</a><i></i></li>
        <li><cite></cite><a href="lbacomment/LbaCommentListAction" target="rightFrame">专栏列表</a><i></i></li>
         <li><cite></cite><a href="/news/NewsListAction" target="rightFrame">News</a><i></i></li>
        <li class="active"><cite></cite><a href="/direct/DirectListAction" target="rightFrame">直播</a><i></i></li>
        <li><cite></cite><a href="/news/SpecialListAction" target="rightFrame">专题</a><i></i></li>
  		
  		<li><cite></cite><a href="/videoapp/VideoListForApp?pageNo=1&pageSize=10" target="_blank">视频</a><i></i></li>
        <li><cite></cite><a href="/tacticsapp/TacticsListForApp?pageNo=1&pageSize=10" target="_blank">战术</a><i></i></li>
         <li><cite></cite><a href="" target="_blank">规则</a><i></i></li>
        <li><cite></cite><a href="/newsapp/NewsListForApp?pageNo=1&pageSize=10" target="_blank">新闻</a><i></i></li>
          <li><cite></cite><a href="/newsapp/BestPlayerListForApp" target="_blank">历届状元</a><i></i></li>
        <li><cite></cite><a href="/newsapp/ChampionListForApp" target="_blank">历届冠军</a><i></i></li>
        </ul>    
    </dd>
        
    
    
    
   
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>权限管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="/sys/manage/authority/user_role.html"  target="rightFrame">用户-角色</a><i></i></li>
        <li><cite></cite><a href="/sys/manage/authority/role_resource.html"  target="rightFrame">角色-资源</a><i></i></li>
    </ul>    
    </dd><%--  
    
    
    <dd><div class="title"><span><img src="../images/leftico04.png" /></span>数据分析</div>
    <ul class="menuson">
        <li><cite></cite><a href="/sys/manage/data/user_area.html"  target="rightFrame">用户-地区</a><i></i></li>  
    </ul>
    
    </dd>   
    
    --%></dl>
    
</body>
</html>
