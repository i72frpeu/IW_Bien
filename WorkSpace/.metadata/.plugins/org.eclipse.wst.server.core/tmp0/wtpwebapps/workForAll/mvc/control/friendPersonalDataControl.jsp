<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AmigosDAO" %>
<%@ page import="es.uco.pw.display.javadao.PersonaDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 AmigosDAO bd = new AmigosDAO();
	 PersonaDAO bd2 = new PersonaDAO();
	 UserDAO bd3 = new UserDAO();
	 int id = 0;
	 
	 for(int i = 0; i < amigosBean.getAmigos(); i++) {
		 if(i == amigosBean.getId()){
			id = bd.getFriendID(customerBean.getuserID(), i);
		 }
	 }
	 
	 String nombre = bd2.get(id, "userName");
	 String apellido = bd2.get(id, "userSurname");
	 String fecha = bd2.get(id, "userDate");
	 String pais = bd2.get(id, "userCountry");
	 String localidad = bd2.get(id, "userLocal");
	 int movil = bd2.getMovil(id, "userMovil");
	 String email = bd2.get(id, "useremail");
	 
	 if(bd2.checkIDPersona(id) == false){
		 nombre = bd3.getUser(id, "userNameR");
		 apellido = bd3.getUser(id, "userSurName");
		 fecha = "No introducido";
		 pais = "No introducido";
		 localidad = "No introducido";
		 movil = 0;
		 email = bd3.getUser(id, "userName");
	 }
%>
<jsp:forward page="../view/friendPersonalDataView.jsp">
	<jsp:param value="<%= nombre %>" name="nombre"/>
	<jsp:param value="<%= apellido %>" name="apellido"/>
	<jsp:param value="<%= fecha %>" name="fecha"/>
	<jsp:param value="<%= pais %>" name="pais"/>
	<jsp:param value="<%= localidad %>" name="localidad"/>
	<jsp:param value="<%= movil %>" name="movil"/>
	<jsp:param value="<%= email %>" name="email"/>
</jsp:forward>

<%	 
 }

%>