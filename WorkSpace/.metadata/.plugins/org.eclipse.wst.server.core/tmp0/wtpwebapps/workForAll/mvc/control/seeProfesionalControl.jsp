<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.ProfesionalDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 ProfesionalDAO bd = new ProfesionalDAO();
	 
	 String tipo = bd.get(customerBean.getuserID(), "type");
	 String organizacion = bd.get(customerBean.getuserID(), "organization");
	 String start = bd.get(customerBean.getuserID(), "dateStart");
	 String end = bd.get(customerBean.getuserID(), "dateEnd");
	 
	 if(bd.checkIDProfesional(customerBean.getuserID()) == false){
		 tipo = "Ninguno";
		 organizacion = "Ninguno";
		start = "Ninguno";
		 end = "Ninguno";
	 }
%>
	<jsp:forward page="../view/seeProfesionalView.jsp">
		<jsp:param value="<%= tipo %>" name="tipo"/>
		<jsp:param value="<%= organizacion %>" name="organizacion"/>
		<jsp:param value="<%= start %>" name="start"/>
		<jsp:param value="<%= end %>" name="end"/>
	</jsp:forward>
<%

 }

%>