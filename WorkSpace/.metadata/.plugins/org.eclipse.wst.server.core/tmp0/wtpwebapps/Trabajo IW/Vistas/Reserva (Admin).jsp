<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="reservaactiva" class="trabajo.IW.ReservaBean" scope="session" />
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
	<title>Reserva (Admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf5.0.css">
</head>

<body>
  <!--Roll de artículos-->
   
  <div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 4> Imagen </td> <td class = "tdlibro"> ID: <%= reservaactiva.getIdReserva() %> </td> <td class = "tdlibro"> Titulo: <%= reservaactiva.getTitulo() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro" > Usuario: <%= reservaactiva.getUsuario() %> </td> <td class = "tdlibro"> Carnet: <%= reservaactiva.getCarnet_universidad() %></td>
		</tr>
		<tr>
			<td class = "tdlibro"> Fecha Inicio: <%= reservaactiva.getFecha_inicio_Reserva() %> </td> <td class = "tdlibro"> Fecha Final: <%= reservaactiva.getFecha_final_Reserva() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro"> <a href = "Formulario Prestamo Reserva.jsp"><button>Prestar Libro</button></a></td>
		</tr>
	</table>
  </div>


</body>

</html>