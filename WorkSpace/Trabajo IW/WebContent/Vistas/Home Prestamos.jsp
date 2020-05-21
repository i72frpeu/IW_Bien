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
	<title>Home Prestamos</title>
	<link rel="stylesheet" type="text/css" href="../CSS/wf6.0.css">
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
    <% for (int i = 0; i < 8; i++){ %>
        <tr>
          <td>
              <table class="uno">
                  <tr>
                    <td class="td_user_img"><a href=""><img src="../img/libro.png" alt="IMG_BOOK" class="img_user_2"></a></td>
                    <td class="td_user_des">Usuario</td>
                    <td class="tdlibro"> Fecha Fin </td>
                    <td> <a href="Prestamo.jsp"><button name="foro" class="boton_user">Ver Prestamo</button></a><td>
                  </tr>
                </table>
          </td>
        </tr>
        <%} %>
    </table>
  </div>

</body>

</html>