<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
  <meta charset="ISO-8859-1">
  <title>Datos Personales</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Informaci&oacute;n Personal</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                     <tr>
                         <td>Nombre</td>
                         <td><%= request.getParameter("nombre") %></td>
                     </tr>
                     <tr>
                         <td>Apellidos</td>
                         <td><%= request.getParameter("apellido") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de Nacimiento</td>
                         <td><%= request.getParameter("fecha") %></td>
                     </tr>
                     <tr>
                         <td>Pais</td>
                         <td><%= request.getParameter("pais") %></td>
                     </tr>
                     <tr>
                         <td>Localidad</td>
                         <td><%= request.getParameter("localidad") %></td>
                     </tr>
                     <tr>
                         <td>Movil</td>
                         <td><%= request.getParameter("movil") %></td>
                     </tr>
                     <tr>
                         <td>Email</td>
                         <td><%= request.getParameter("email") %></td>
                     </tr>
                 </table>
             </td>
         </tr>
     </table>
   <form action="../control/nofriendControl.jsp">
   	<input type="hidden" value="<%= request.getParameter("id") %>" name="id">
   	<input type="submit" value="Volver">
   </form>
  </div>
</body>
</html>