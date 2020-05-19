<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.PersonaDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />


<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 PersonaDAO bd = new PersonaDAO();
	 String nombre = bd.get(customerBean.getuserID(), "userName");
	 String apellido = bd.get(customerBean.getuserID(), "userSurname");
	 String fecha = bd.get(customerBean.getuserID(), "userDate");
	 String pais = bd.get(customerBean.getuserID(), "userCountry");
	 String localidad = bd.get(customerBean.getuserID(), "userLocal");
	 int movil = bd.getMovil(customerBean.getuserID(), "userMovil");
	 String email = bd.get(customerBean.getuserID(), "useremail");
	 
%>
<jsp:forward page="../view/seePersonalView.jsp">
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