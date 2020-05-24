<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaReservas" class="trabajo.IW.ListaReservasBean" scope="session" />
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
	<title>Home Reservas</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf5.0.css">
</head>

<body>
  <!--Roll de artículos-->
  
  <div class="buscador">
  	<form>
  		<table>
  		<tr>
  		<td><input type="text" name="buscar" required></td>
  		<td><input type="submit" value="Buscar"></td> 
  		</tr>
  		</table>
  	</form>
  </div>

  <div class="div_home">
    <table class="dos">
    <% for (int i = 0; i < listaReservas.getsize(); i++){ %>
        <tr>
          <td>
              <table class="uno">
                  <tr>
                    <td class="tdlibro"> <%= listaReservas.getReserva(i).getTitulo() %></td>
                    <td class="tdlibro"> <%= listaReservas.getReserva(i).getUsuario() %> </td>
                    <td class="tdlibro"> <%= listaReservas.getReserva(i).getFecha_final_Reserva() %> </td>
                    <td><form action = ../Controlador/Reserva2.jsp>
                    	<input type="hidden" name="titulo" value=<%= listaReservas.getReserva(i).getTitulo() %>>
    					<input type="hidden" name="usuario" value=<%= listaReservas.getReserva(i).getUsuario() %>>
    					<input type="submit" value="Reserva">
    				</form> <td>
                  </tr>
                </table>
          </td>
        </tr>
        <%} %>
    </table>
  </div>
</body>

</html>