<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<%@ page import="es.uco.pw.display.javadao.AmigosDAO" %>
<%@ page import="es.uco.pw.display.javadao.AcademyDAO" %>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } else{
	 AmigosDAO bd = new AmigosDAO();
	 AcademyDAO bd2 = new AcademyDAO();
	 UserDAO bd3 = new UserDAO();
	 int id = 0;
	 
	 for(int i = 0; i < amigosBean.getAmigos(); i++) {
		 if(i == amigosBean.getId()){
			id = bd.getFriendID(customerBean.getuserID(), i);
		 }
	 }

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
	<jsp:forward page="../view/friendAcademyDataView.jsp">
		<jsp:param value="<%= titulo %>" name="titulo"/>
		<jsp:param value="<%= universidad %>" name="universidad"/>
		<jsp:param value="<%= inicio %>" name="inicio"/>
		<jsp:param value="<%= fin %>" name="fin"/>
	</jsp:forward>
<% 
}
%>