<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AcademyDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 AcademyDAO bd2 = new AcademyDAO();
	 UserDAO bd3 = new UserDAO();
	 int id = Integer.parseInt(request.getParameter("id"));
	 

	String titulo = bd2.get(id, "userStudy");
	 String universidad = bd2.get(id, "userUniversity");
	 String inicio = bd2.get(id, "userStart");
	 String fin = bd2.get(id, "userEnd");
	 
	 if(bd2.checkIDAcademy(id) == false){
		 titulo = "Ninguno";
		 universidad = "Ninguno";
		 inicio = "Ninguno";
		 fin = "Ninguno";
	 }
	 
%>
	<jsp:forward page="../view/nofriendAcademyDataView.jsp">
	<jsp:param value="<%= id %>" name="id"/>
		<jsp:param value="<%= titulo %>" name="titulo"/>
		<jsp:param value="<%= universidad %>" name="universidad"/>
		<jsp:param value="<%= inicio %>" name="inicio"/>
		<jsp:param value="<%= fin %>" name="fin"/>
	</jsp:forward>
<% 
}
%>