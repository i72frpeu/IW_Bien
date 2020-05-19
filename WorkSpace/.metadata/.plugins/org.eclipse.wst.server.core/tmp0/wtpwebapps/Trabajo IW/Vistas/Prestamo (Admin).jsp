<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../Includes/headeradmin.jsp" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Prestamo (admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/headeradmin.css">
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
			<td class = "tdlibro" colspan = 3> <a href = "Cancelar Prestamo.jsp"><button>Terminar Prestamo</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>