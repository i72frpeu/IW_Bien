<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="usuario" class="trabajo.IW.Usuario" scope="session" />

<% 
// if (usuario.getuserName() != "" ) { 
	 //response.sendRedirect("../../home.jsp");
 //} 
%>

<%
	

	int id = 0;
	
	if(usuario.iniciarSesion(request.getParameter("email"), request.getParameter("contr")) == true){
		
		/* if(usuario.getTipo == 1){
			response.sendRedirect("Home (Libros).jsp");
		}else{
			if(usuario.getTipo == 2){
				response.sendRedirect("Home (Profesor).jsp");
		}else{
			if(usuario.getTipo == 3){
				response.sendRedirect("Home (Admin).jsp");
			}
		}
	} */
}
%>
