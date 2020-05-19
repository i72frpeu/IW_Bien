<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.IdiomDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 IdiomDAO bd2 = new IdiomDAO();
	 int id = Integer.parseInt(request.getParameter("id"));
	 
	 String idioma = bd2.get(id, "Idiom");
	 String leer = bd2.getInt(id, "levelread");
	 String hablar = bd2.getInt(id, "levelspeak");
	 String escribir = bd2.getInt(id, "levelwrite");
	 String europa = bd2.getInt(id, "levelEurope");
	 
	 if(bd2.checkIDIdiom(id) == false){
		 idioma = "Ninguno";
		 leer = "Ninguno";
		 hablar = "Ninguno";
		 escribir = "Ninguno";
		 europa = "Ninguno";
	 }
%>
	<jsp:forward page="../view/nofriendIdiomsView.jsp">
		<jsp:param value="<%= id %>" name="id"/>
		<jsp:param value="<%= idioma %>" name="idioma"/>
		<jsp:param value="<%= leer %>" name="leer" />
		<jsp:param value="<%= hablar %>"  name="hablar"/>
		<jsp:param value="<%= escribir %>" name="escribir"/>
		<jsp:param value="<%= europa %>" name="europa"/>
	</jsp:forward>
<%
 }
%>
	