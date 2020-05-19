<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
  <meta charset="ISO-8859-1">
  <title>Experiencia Profesional</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Experiencia profesional</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                     <tr>
                         <td>Tipo</td>
                         <td><%= request.getParameter("tipo") %></td>
                     </tr>
                     <tr>
                         <td>Empresa</td>
                         <td><%= request.getParameter("organizacion") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de inicio</td>
                         <td><%= request.getParameter("start") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de fin</td>
                         <td><%= request.getParameter("end") %></td>
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