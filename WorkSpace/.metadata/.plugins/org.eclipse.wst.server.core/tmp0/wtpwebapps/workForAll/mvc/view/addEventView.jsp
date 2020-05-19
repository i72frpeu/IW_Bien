<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
  <title>Evento</title>
  <link rel="stylesheet" type="text/css" href="../../css/header.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf15.css">

</head>
<body>
  <div class="div_home">
    <h3>A&ntilde;adir publicaci&oacute;n</h3>
    <table class="publicacion">
        <tr>
            <td ><a href="../control/addPostControl.jsp">Comentario</a></td>
            <td><a href="../control/addEventControl.jsp">Evento</a></td>
            <td><a href="../control/addArticleControl.jsp">Art&iacute;culo</a></td>
        </tr>
    </table>
    <br>
    <form action="../../home.jsp" method="post">
        <table>
          <tr>
            <td><strong>Nombre del evento</strong></td>
            <td><input type="text" name="nombredelevento" placeholder="Evento" required></td>
          </tr>
          <tr>
              <td><strong>Fecha del evento</strong></td>
              <td><input type="text" name="Fecha" placeholder="Fecha" required></td>
          </tr>
          <tr>
              <td><strong>Etiquetas</strong></td>
              <td>
                  <select name="Etiquetas" class = "Etiquietas" required>
                      <option value="q1">Etiqueta 1</option>
                      <option value="q2">Etiqueta 2</option>
                      <option value="q3">Etiqueta 3</option>
                      <option value="q4">Etiqueta 4</option>
                  </select>
              </td>
          </tr>
          <tr>
              <td><strong>Imagen</strong></td>
              <td><input type="file" value="imagen" required></td>
          </tr>
        </table>
        <h3>Descripci�n del evento</h3>
        <textarea name="comentarios" rows="10" cols="40" class="area_text" placeholder="Escribe aqu� el comentario" required></textarea>
        <br>
        <input type="submit" value="Enviar"> 
        <br><br>
    </form>
  </div>
 </body>
 </html>