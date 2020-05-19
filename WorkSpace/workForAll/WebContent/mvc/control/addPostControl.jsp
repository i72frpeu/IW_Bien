<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.ComentariosDAO"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="comentariosBean" class="es.uco.pw.display.javabean.ComentariosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 )
	response.sendRedirect("../../index.jsp");
else
	response.sendRedirect("../view/addPostView.jsp");
%>
