<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../Includes/header.jsp" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Libro (Admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/header.css">
	<link rel="stylesheet" type="text/css" href="../CSS/wf4.0.css">
</head>

<body>
  <!--Roll de art�culos-->
  
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
			<td class = "tdlibro" rowspan = 4> Imagen </td> <td class = "tdlibro"> ID </td> <td class = "tdlibro"> Titulo </td> <td class = "tdlibro"> Estado </td>
		</tr>
		<tr>
			<td class = "tdlibro" > Autor </td> <td class = "tdlibro" rowspan = 2> Materiles </td> <td class = "tdlibro"> N� Pag </td>
		</tr>
		<tr>
			<td class = "tdlibro"> Materia </td> <td class = "tdlibro"> Encuadernamiento </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2> Descripcion </td> <td class = "tdlibro"> <a href = "Formulario Prestar.jsp"><button>Prestar</button></a> </td>
		</tr>
	</table>
  </div>


</body>

</html>