<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="libroactivo" class="trabajo.IW.LibroBean" scope="session" />
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
	<title>Libro (Admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf4.0.css">
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
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 4> Imagen </td> <td class = "tdlibro"> <%= libroactivo.getId_libro() %> </td> <td class = "tdlibro"> <%= libroactivo.getTitulo() %> </td> <td class = "tdlibro"> Estado </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> <%= libroactivo.getAutor() %> </td> <td class = "tdlibro"> <%= libroactivo.getPaginas() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro"> <%= libroactivo.getMateria() %> </td> <td class = "tdlibro"> <%= libroactivo.getEditorial() %> </td> <td class = "tdlibro" rowspan = 2> <%= libroactivo.getEncuadernamiento() %> </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Descripcion </td> <td class = "tdlibro"> <a href = "Formulario Prestar.jsp"><button>Prestar</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>