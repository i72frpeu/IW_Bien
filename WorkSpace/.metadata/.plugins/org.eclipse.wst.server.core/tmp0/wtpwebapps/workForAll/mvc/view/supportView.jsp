<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>


<!DOCTYPE html>
<html>
<head>
  <title>Soporte tecnico</title>
  <link rel="stylesheet" type="text/css" href="../../css/header.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf13.css">

</head>
<body>
  <div class="div_home">
    <h2>Soporte tecnico</h2>
    <form>
        <strong>Selecciones el problema</strong>
        <select name="problema" required>
                <option value="q1">Problema 1</option>
                <option value="q2">Problema 2</option>
                <option value="q3">Problema 3</option>
                <option value="q4">Problema 4</option>
                <option value="q5">Problema 5</option>
                <option value="q6">Problema 6</option>
        </select><br><br>
        <strong>Redacte el problema</strong><br><br>
        <textarea name="comentarios" rows="10" cols="40" placeholder="Escriba el problema" required></textarea><br><br>
        <strong>Gracias por contactarnos</strong>
        <input type="submit" value="Enviar"><br><br><br>
                    
    </form>
  </div>
    
 </body>
 </html>