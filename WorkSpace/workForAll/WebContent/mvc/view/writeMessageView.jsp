<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>

<html>

<head>
  <title>Mensajes</title>
  <link rel="stylesheet" type="text/css" href="../../css/header.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf11.2.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf11.0.css">
</head>
<body>

  <div class="div_home">
    <p><a href="../control/receiveMessagesControl.jsp"> Recibidos </a>  /  <a href="../control/sendMessagesControl.jsp"> Enviados </a>  /  <a href="../control/writeMessageControl.jsp"> Redactar </a></p>
	<form>
	    <table class="dos">
	        <tr>
	            <td>Para</td>
	            <td><input type="text" name="nombredelacaja"  placeholder="Usuario" class="text_men" required></td>
	        </tr>
	        <tr>
	            <td>CC</td>
	            <td><input type="text" name="nombredelacaja" placeholder="Usuario" class="text_men"></td>
	        </tr>
	        <tr>
	            <td>Asunto</td>
	            <td><input type="text" name="nombredelacaja" placeholder="Asunto" class="text_men" required></td>
	        </tr>
	        <tr>
	            <td>Mensaje: </td>
	        </tr>
	        <tr>
	            <td><textarea name="comentarios" class="area_text" placeholder="Escribe aqu&iacute; el mensaje" required></textarea></td>
	        </tr>
	        <tr>
	            <td><input type="file" name="nombredelacaja" class="adjuntar"></td>
	        </tr>
	        <tr>
	            <input type="submit" value="Enviar" class="button_en">
	        </tr>
	    </table>
	</form>
  </div>
 </body>
 </html>