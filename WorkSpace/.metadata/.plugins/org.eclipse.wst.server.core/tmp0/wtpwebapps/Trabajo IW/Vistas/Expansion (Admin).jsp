<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../Includes/headeradmin.jsp" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Expansión (Admin)</title>
	<link rel="stylesheet" type="text/css" href="../CSS/headeradmin.css">
	<link rel="stylesheet" type="text/css" href="../CSS/wf8.0.css">
</head>
<body>

	<div class="div_home">
  		<table class = "tablalibro">
		<tr>
			<td class = "tdlibro" rowspan = 4> Libro </td> <td class = "tdlibro"> Id Libro </td> <td class = "tdlibro" colspan = 2> Título </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 3> Fecha Expansion </td>
		</tr>
		<tr>
			<td class = "tdlibro" colspan = 2 rowspan = 2> Motivo </td> <td class = "tdlibro"> <a href = "Cancelar Expansión.jsp"><button>Cancelar Expansión</button></a></td>
		</tr>
		<tr>
			<td class = "tdlibro"> <a href = "Aceptar Expansion.jsp"><button>Aceptar Expansion</button></a></td>
		</tr>
	</table>
  </div>

</body>
</html>