<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="prestamoactivo" class="trabajo.IW.PrestamoBean" scope="session" />
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
	<title>Prestamo (admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf6.0.css">
</head>

<body>
  <!--Roll de artículos-->
   
  <div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 4> Imagen </td> <td class = "tdlibro"> <%= prestamoactivo.getId_prestamo() %> </td> <td class = "tdlibro" colspan = 2> <%= prestamoactivo.getTitulo() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> <%= prestamoactivo.getUsuario() %> </td> <td class = "tdlibro"> <%= prestamoactivo.getCarnet() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro"> <%= prestamoactivo.getFecha_inicio_prestamo() %> </td> <td class = "tdlibro"> <%= prestamoactivo.getFecha_final_prestamo() %> </td> <td class = "tdlibro"> Retraso: Si o No </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 3> <a href = "../Controlador/Cancelar Prestamo.jsp"><button>Terminar Prestamo</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>