<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dynatestaction.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>testaction ��̬actionform����</h1>
   <!--  <form action="dynaform.do" method="post">
    ������<input type="text" name="username"/></br>
    ���䣺<input type="text" name="age"/></br>
    <input type="submit" value="�ύ" />
    </form> -->
    <form action="upload.do" method="post" enctype="multipart/form-data">
    ���⣺<input type="text" name="title"/>
    �ļ�:<input type="file" name="myfile"/>
    <input type="submit" value="�ύ"/> 
    </form><br>
    <h2>strut �����Զ�ת��</h2>
    <form action="convert.do" method="post"><br>
    int:<input type="text" name="integer"/><br>
    Double:<input type="text" name="doubles"/><br>
    boolean:<input type="text" name="booleans"/><br>
    java.sql.date:<input type="text" name="sqldates"/><br>
    <input type="submit" value="����"/>
    
    
    </form>
  </body>
</html>
