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
	<title>Prestamo</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf6.0.css">
</head>

<body>
  <!--Roll de artículos-->
   
  <div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 4> Imagen </td> <td class = "tdlibro"> ID </td> <td class = "tdlibro" colspan = 2> Titulo </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Usuario </td> <td class = "tdlibro"> Carnet</td>
		</tr>
		<tr>
			<td class = "tdlibro"> Fecha Inicio </td> <td class = "tdlibro"> Fecha Final </td> <td class = "tdlibro"> Retraso </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 3> <a href = "Reservas.jsp"><button>Pedir Expansion</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>