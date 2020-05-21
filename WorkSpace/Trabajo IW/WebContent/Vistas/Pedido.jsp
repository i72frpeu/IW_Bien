<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<%
if(Usuario.getTipo() == 1){
%>
<%@ include file="../Includes/header.jsp" %>
<% 
}else{
	if(Usuario.getTipo() == 2){
%>
<%@ include file="../Includes/headerprof.jsp" %>
<% 
}else{
	if(Usuario.getTipo() == 3){
%>
<%@ include file="../Includes/headeradmin.jsp" %>
<%
}}}
%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Pedido</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf7.0.css">
</head>
<body>

	<div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro"> Nombre </td> <td class = "tdlibro"> Apellido </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Titulo Libro </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Autor </td> 
		</tr>
		<tr>
			<td class = "tdlibro"> N� Ejemplares </td> <td class = "tdlibro"> Precio Estimado </td>
		</tr>
		<tr>
			<td class = "tdlibro"> <a href = "Crear Pedido.jsp"><button>Modificar Pedido</button></a></td> <td class = "tdlibro"> <a href = ""><button>Cancelar Pedido</button></a> </td>
		</tr>
	</table>
  </div>

</body>
</html>