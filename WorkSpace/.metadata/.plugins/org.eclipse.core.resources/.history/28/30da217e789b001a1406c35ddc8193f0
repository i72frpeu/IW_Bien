<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="Includes/headerhome.jsp" %>
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />



<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Home (Libros)</title>
	<link rel="stylesheet" type="text/css" href="CSS/header.css">
	<link rel="stylesheet" type="text/css" href="CSS/wf4.0.css">
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
    <% for (int i = 0; i < 2; i++){ %>
        <tr>
          <td>
              <table class="uno">
                  <tr>
                    <td class="td_user_img"><img src="img/libro.png" alt="IMG_USER" class="img_user_2"></td>
                    <td class="tdlibro"> <%= listaLibros.getLibro(i).getTitulo()  %> </td>
                    <td class="td_user_des">Aqui va la descripcion que será muy larga</td>
                    <td><form action = Controlador/Libro.jsp>
                    	<input type="hidden" name="titulo" value=<%= listaLibros.getLibro(i).getTitulo() %>>
    					<input type="submit" value="Libro">
    				</form>
                    </td>
                  </tr>
                </table>
          </td>
        </tr>
        <%} %>
    </table>
  </div>

</body>

</html>