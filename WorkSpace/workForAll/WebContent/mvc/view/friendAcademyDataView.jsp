<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
  <meta charset="ISO-8859-1">
  <title>Datos Acad&eacute;micos</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Datos Academicos</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                    <tr>
                         <td>Estudios</td>
                         <td><%= request.getParameter("titulo") %></td>
                     </tr>
                     <tr>
                         <td>Centor</td>
                         <td><%= request.getParameter("universidad") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de inicio</td>
                         <td><%= request.getParameter("inicio") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de fin</td>
                         <td><%= request.getParameter("fin") %></td>
                     </tr>
                 </table>
             </td>
         </tr>
     </table>
    <button onclick="self.close();">Volver</button>
  </div>
</body>
</html>