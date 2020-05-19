<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 int id = Integer.parseInt(request.getParameter("id"));
	 
	 UserDAO bd = new UserDAO();
	 String name = bd.getUser(id, "userNameR");
	 String apellido = bd.getUser(id, "userSurname");
	 String nameC = name + " " + apellido;
	 
%>
<jsp:forward page="../view/nofriendView.jsp">
<jsp:param value="<%= nameC %>" name="nombre"/>
<jsp:param value="<%= id%>" name="id"/>
</jsp:forward>
<%
 }
 
 %>