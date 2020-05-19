<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<%@ page import="es.uco.pw.display.javadao.ComentariosDAO" %>
<%@ page import="es.uco.pw.display.javadao.UserDAO" %>
<jsp:useBean id="comentariosBean" class="es.uco.pw.display.javabean.ComentariosBean" scope="session" />

<%
ComentariosDAO bd_coment = new ComentariosDAO();
UserDAO bd_usuario = new UserDAO();
%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="../../css/header.css">
	<link rel="stylesheet" type="text/css" href="../../css/wf8.0.css">
</head>

  <div class="div_home">
    <div class="buscador">
      <input type="search" id="miBusqueda" name="q" class="q_buscador">
      <input type="button" value="Buscar">
    </div>
    <br>
    <table class="dos">
    <% for (int i = 1; i <= bd_coment.commentIDAssigned(); i++)
    {
    	int uid = Integer.parseInt(bd_coment.get(i, "userID"));
    	String username = bd_usuario.getUser(uid, "userName");%>
       <tr>
           <td>
                <table class="uno">
                  <tr>
                      <td><%out.println(bd_coment.get(i, "Texto")); %></td>
                      <td>Creador: <%out.println(username); %></td>
                  </tr>
                </table>
           </td>
       </tr>
	<% } %>    
    </table>
  </div>
  
 </body>
 </html>