<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<%

if(Usuario.getTipo() == 1){
			response.sendRedirect("../Home (Libros).jsp");
		}else{
			if(Usuario.getTipo() == 2){
				response.sendRedirect("../Home (Profesor).jsp");
		}else{
			if(Usuario.getTipo() == 3){
				response.sendRedirect("../Home (Admin).jsp");
			}
		}
	} 
%>