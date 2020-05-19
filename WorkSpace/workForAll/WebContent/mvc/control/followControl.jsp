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
	 int id2 = -1;
	 
	 AmigosDAO bd = new AmigosDAO();
	 UserDAO bd2 = new UserDAO();
	 String nombre = " ";
	 String apellido = " ";
	 String nombrecompleto = " ";
	 
	  bd.save(customerBean.getuserID(), id);

	 	amigosBean.setAmigos(bd.numberfriends(customerBean.getuserID()));
	 	
	 	for(int i = 0; i < amigosBean.getAmigos(); i++){
	 		nombre = bd.getFriend(customerBean.getuserID(), i);
	 		apellido = bd.getFriendApellido(customerBean.getuserID(), i);
	 		nombrecompleto = nombre + " " + apellido;
	 		amigosBean.setAmigoArray(nombrecompleto, i);
	 		if(bd.getFriendID(customerBean.getuserID(), i) == id){
	 			id2 = i;
	 		}
	 	}
%>
<jsp:forward page="myFriendControl.jsp">
	<jsp:param value="<%= id2 %>" name="nombre"/>
</jsp:forward>

<%
 }

%>