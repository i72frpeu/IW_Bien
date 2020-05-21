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
	<title>Usuario</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf.css">
</head>

<body>
  <!--Roll de artículos-->
  
  <div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 2> Imagen </td>  <td class = "tdlibro"> Nombre </td> <td class = "tdlibro" colspan = 2> Apellidos </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 3> Usuario </td> 
		</tr>
		<tr>
			<td></td><td class = "tdlibro" colspan = 3> Email </td>
		</tr>
		<tr>
			<td></td><td class = "tdlibro" colspan = 2> Carnet Universitario </td> <td class = "tdlibro"> <a href = "Editar Usuario.jsp"><button>Editar Usuario</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>