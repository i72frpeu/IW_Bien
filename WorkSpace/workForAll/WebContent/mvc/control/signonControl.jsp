<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserName() != "" ) { 
	 response.sendRedirect("../../home.jsp");
 }
	
 response.sendRedirect("../view/signonView.jsp");


%>