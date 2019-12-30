<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int num=Integer.parseInt(request.getParameter("LuckNo").trim());
java.util.Random random=new java.util.Random();
int luck=random.nextInt(10);
%>
<h2>Infoway badluck center</h2>
<br>
You entered number:<%= num %>
<br>
Lucky number:<%= luck %>
<br>
<%
 if(num==luck)
 {
	 out.print("your guess is correct....Congrats!!");
 }
 else
 {
	 out.print("Oops");
 }
%>


</body>
</html>