<%-- 
    Document   : ViewProfile
    Created on : Feb 22, 2016, 11:53:12 PM
    Author     : dono
--%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <jsp:useBean id="objcon" scope="session" class="model.DbConnector"></jsp:useBean>
 <jsp:useBean id="objenc" scope="session" class="util.DesEncrypter"></jsp:useBean>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%out.println(objcon.getNameOfEmail((String)request.getSession().getAttribute("attr")));%></title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="css/styles.css" />

<script type="text/javascript" 
src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js">
</script>
<script language="javascript" type="text/javascript" src="js/viewProfile.js"></script>



</head>
<%@include file="header.jsp" %>

&nbsp;<h1 style="color:white" >&nbsp; &nbsp; &nbsp;<%out.println((String)request.getSession().getAttribute("attr"));%></h1>

<% Vector<String> vecData=new Vector<>();
    vecData=objcon.getAllData((String)request.getSession().getAttribute("attr"));
%>
<div id="dataProfile">
<form action="#" method="get">
    <br>
<span class="title">Birthday:</span><label class="res" id="birth"><%=vecData.get(1) %></label><br><br>
<span class="title">Password:</span><label class="res" id="pass"><%=objenc.decrypt(vecData.get(2)) %></label><br><br>
<span class="title">Job:</span><label class="res" id="job"><%=vecData.get(3) %></label><br><br>
<span class="title">Name:</span><label class="res" id="name"><%out.println(objcon.getNameOfEmail((String)request.getSession().getAttribute("attr")));%></label><br><br>
<span class="title">Credit Limit:</span><label class="res" id="credit"><%=vecData.get(5) %> </label><b>L.E</b><br><br>
<span class="title">Address:</span><label class="res" id="address"><%=vecData.get(6) %></label><br><br>
<span class="title">interest:</span><label class="res" id="interest"><%=vecData.get(7) %></label><br><br>
<br>

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="submit" value="Edit" id="Edit">
<br>
<br>

</form>
</div>
<br>
<%@include file="footer.jsp" %>