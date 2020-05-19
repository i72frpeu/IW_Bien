<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.AmigosDAO"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />


<% 
AmigosDAO bd = new AmigosDAO();
String nombre = "";
String apellido = " ";
String nombrecompleto = "";

	amigosBean.setAmigos(bd.numberfriends(customerBean.getuserID()));
	
	for(int i = 0; i < amigosBean.getAmigos(); i++){
		nombre = bd.getFriend(customerBean.getuserID(), i);
		apellido = bd.getFriendApellido(customerBean.getuserID(), i);
		nombrecompleto = nombre + " " + apellido;
		amigosBean.setAmigoArray(nombrecompleto, i);
	}
	
	response.sendRedirect("../../home.jsp");
%> 