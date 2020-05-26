<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="prestamoactivo" class="trabajo.IW.PrestamoBean" scope="session"/>
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
			 <td class = "tdlibro"> ID: <%= prestamoactivo.getId_prestamo() %> </td> <td class = "tdlibro" colspan = 2> <%= prestamoactivo.getTitulo() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Usuario: <%= prestamoactivo.getUsuario() %> </td> <td class = "tdlibro"> Carnet: <%= prestamoactivo.getCarnet() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro"> Fecha Inico: <%= prestamoactivo.getFecha_inicio_prestamo() %> </td> <td class = "tdlibro"> Fecha Fin: <%= prestamoactivo.getFecha_final_prestamo() %> </td> <td class = "tdlibro"> Retraso: Si o No </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> <a href = "Reservas.jsp"><button>Pedir Expansion</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>
