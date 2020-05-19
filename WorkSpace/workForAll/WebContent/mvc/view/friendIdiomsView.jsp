<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
  <meta charset="ISO-8859-1">
  <title>Idiomas</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Idiomas</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                      <tr>
                         <td>Idiomas</td>
                         <td><%= request.getParameter("idioma") %></td>
                     </tr>
                     <tr>
                         <td>Lectura</td>
                         <td><%= request.getParameter("leer") %></td>
                     </tr>
                     <tr>
                         <td>Conversacion</td>
                         <td><%= request.getParameter("hablar") %></td>
                     </tr>
                     <tr>
                         <td>Escritura</td>
                         <td><%= request.getParameter("escribir") %></td>
                     </tr>
                     <tr>
                        <td>Nivel Europeo</td>
                        <td><%= request.getParameter("europa") %></td>
                    </tr>
                 </table>
             </td>
         </tr>
     </table>
    <button onclick="self.close();">Volver</button>
    </div>
</body>
</html>