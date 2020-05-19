<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AcademyDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 AcademyDAO bd = new AcademyDAO();
	
	 String titulo = bd.get(customerBean.getuserID(), "userStudy");
	 String universidad = bd.get(customerBean.getuserID(), "userUniversity");
	 String inicio = bd.get(customerBean.getuserID(), "userStart");
	 String fin = bd.get(customerBean.getuserID(), "userEnd");
	 
	 if(bd.checkIDAcademy(customerBean.getuserID()) == false){
		 titulo = "Ninguno";
		 universidad = "Ninguno";
		 inicio = "Ninguno";
		 fin = "Ninguno";
	 }
	 
%>
	<jsp:forward page="../view/seeAcademyView.jsp">
		<jsp:param value="<%= titulo %>" name="titulo"/>
		<jsp:param value="<%= universidad %>" name="universidad"/>
		<jsp:param value="<%= inicio %>" name="inicio"/>
		<jsp:param value="<%= fin %>" name="fin"/>
	</jsp:forward>
<% 
 }
%>