<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="welcome.jsp" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 id="bk">YOUR DETAILS</h1>
<br>
<h1 id="ob"><%=ob %></h1>
<br>
<button type="button" id="bb" onclick="fun()">Hide details</button>
<br><br>
<br>

<script>
function fun(){
	
	
	
	const b=document.getElementById("bk");
		
	const	s=document.getElementById("ob");
	const	c=document.getElementById("bb");
		s.remove();
	b.remove();
	c.remove();
}

</script>

</body>
</html>