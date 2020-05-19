<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AmigosDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 int id = Integer.parseInt(request.getParameter("id"));
	 
	 AmigosDAO bd = new AmigosDAO();
	 UserDAO bd2 = new UserDAO();
	 String nombre = " ";
	 String apellido = " ";
	 String nombrecompleto = " ";
	 
	  bd.delete(customerBean.getuserID(), id);

	 	amigosBean.setAmigos(bd.numberfriends(customerBean.getuserID()));
	 	
	 	for(int i = 0; i < amigosBean.getAmigos(); i++){
	 		nombre = bd.getFriend(customerBean.getuserID(), i);
	 		apellido = bd.getFriendApellido(customerBean.getuserID(), i);
	 		nombrecompleto = nombre + " " + apellido;
	 		amigosBean.setAmigoArray(nombrecompleto, i);
	 	}
%>
<jsp:forward page="nofriendControl.jsp">
	<jsp:param value="<%= id %>" name="id"/>
</jsp:forward>

<%
 }

%>