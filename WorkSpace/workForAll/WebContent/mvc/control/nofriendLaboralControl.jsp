<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.ProfesionalDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />


<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 ProfesionalDAO bd2 = new ProfesionalDAO();

	 int id = Integer.parseInt(request.getParameter("id"));
	 
	 
	 String tipo = bd2.get(id, "type");
	 String organizacion = bd2.get(id, "organization");
	 String start = bd2.get(id, "dateStart");
	 String end = bd2.get(id, "dateEnd");
	 
	 if(bd2.checkIDProfesional(id) == false){
		 tipo = "Ninguno";
		 organizacion = "Ninguno";
		start = "Ninguno";
		 end = "Ninguno";
	 }
%>
	<jsp:forward page="../view/nofriendProfessionalExperienceView.jsp">
		<jsp:param value="<%= id %>" name="id"/>
		<jsp:param value="<%= tipo %>" name="tipo"/>
		<jsp:param value="<%= organizacion %>" name="organizacion"/>
		<jsp:param value="<%= start %>" name="start"/>
		<jsp:param value="<%= end %>" name="end"/>
	</jsp:forward>
<%

 }

%>