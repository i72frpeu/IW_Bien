<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AmigosDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />
<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 
	 AmigosDAO bd = new AmigosDAO();
	
	 String id = request.getParameter("nombre");
	 int numEntero = Integer.parseInt(id);
	 id = amigosBean.getAmigosArray(numEntero); 
	 amigosBean.setId(numEntero);
%>
<jsp:forward page="../view/myFriendView.jsp">
	<jsp:param value="<%=bd.getFriendID(customerBean.getuserID(), numEntero)%>" name="id"/>
	<jsp:param value="<%=id%>" name="nombre"/>
</jsp:forward>

<%
 }

%>