<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="float:right;"><form action="logo">
<input type="submit" value="LOGOUT">
</form></div>
<%

response.setHeader("Cache-Control","no-cache, no-store");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
HttpSession s=request.getSession();
String ob=null;
ob=(String)s.getAttribute("s");
if(ob==null)
{
	response.sendRedirect("index.jsp");
	
}

%>
<h1>Welcome you are successfully loged</h1>
<br>
<h3>For ur Details</h3>
<form action="det.jsp" >
<input type="submit" value="Click Here">
</form>
<br><br>



</body>
</html>