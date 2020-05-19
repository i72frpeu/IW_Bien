<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.IdiomDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 IdiomDAO bd = new IdiomDAO();
	 String idioma = bd.get(customerBean.getuserID(), "Idiom");
	 String leer = bd.getInt(customerBean.getuserID(), "levelread");
	 String hablar = bd.getInt(customerBean.getuserID(), "levelspeak");
	 String escribir = bd.getInt(customerBean.getuserID(), "levelwrite");
	 String europa = bd.getInt(customerBean.getuserID(), "levelEurope");
	 
	 if(bd.checkIDIdiom(customerBean.getuserID()) == false){
		 idioma = "Ninguno";
		 leer = "Ninguno";
		 hablar = "Ninguno";
		 escribir = "Ninguno";
		 europa = "Ninguno";
	 }
%>
	<jsp:forward page="../view/seeIdiomsView.jsp">
		<jsp:param value="<%= idioma %>" name="idioma"/>
		<jsp:param value="<%= leer %>" name="leer" />
		<jsp:param value="<%= hablar %>"  name="hablar"/>
		<jsp:param value="<%= escribir %>" name="escribir"/>
		<jsp:param value="<%= europa %>" name="europa"/>
	</jsp:forward>
<%
 }
%>