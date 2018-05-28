<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
<META http-equiv=Content-Type content="text/html; charset=UTF-8">
<LINK href="css/admin.css" type="text/css" rel="stylesheet">
<SCRIPT language=javascript>
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
<style type="text/css">
   .d1{
     border: 
   }
</style>
</HEAD>
<BODY >
	<div class="d1">
<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170 
 background="images/tab1.jpg" braorder=5px >
  <TR>
    <TD vAlign=top align=middle>
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        
        <TR>
          <TD height=10></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(1) 
            href="javascript:void(0);">系统用户管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child1 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
      
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listUser" 
            target=mainFrame>管理员信息</A></TD></TR>
            
        
            
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(2) 
            href="javascript:void(0);">客户管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listKehu" 
            target=mainFrame>客户信息</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/add/addkehu.jsp" 
            target=mainFrame>添加客户</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/left/ziliao.jsp" 
            target=mainFrame>客户资料上传</A></TD></TR>
            
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(3) 
            href="javascript:void(0);">商品信息管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child3 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listShangpin" 
           target=mainFrame>商品库存</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/left/xiaoShouEr.jsp" 
            target=mainFrame>销售额分析</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/add/addshangpin.jsp" 
            target=mainFrame>添加商品</A></TD></TR>
            
     
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(4) 
            href="javascript:void(0);">订单管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child4 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listDingdan" 
           target=mainFrame>订单详情</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/add/adddingdan.jsp" 
           target=mainFrame>添加订单</A></TD></TR>
            
            
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(5) 
            href="javascript:void(0);">项目管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child5 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listProject" 
            target=mainFrame>项目查看</A></TD></TR>
            
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/left/ziliao.jsp" 
            target=mainFrame>项目资料上传</A></TD></TR>
        <TR height=4>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/add/addproject.jsp" 
            target=mainFrame>添加项目</A></TD></TR>
        <TR height=4>
        
   
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(6) 
            href="javascript:void(0);">销售机会管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child6 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listJihui" 
            target=mainFrame>销售概率查看</A></TD></TR>
            
            
            
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(7) 
            href="javascript:void(0);">竞争对手管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child7 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="listDuisho" 
            target=mainFrame>竞争对手详情</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="main/left/ziliao.jsp" 
            target=mainFrame>竞争对手资料上传</A></TD></TR>
        
        
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=30>
          <TD style="PADDING-LEFT: 30px" ><A 
            class=menuParent onclick=expand(0) 
            href="javascript:void(0);">考勤管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child0 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=mainFrame>考勤查询</A></TD></TR>
       
         
         </TABLE></TD>
    <TD width=1 bgColor=#d1e6f7></TD></TR>
    </TABLE>
    </div>
    </BODY></HTML>
