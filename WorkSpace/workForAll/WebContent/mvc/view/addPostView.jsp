<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
  <title>A&ntilde;adir post</title>
  <link rel="stylesheet" type="text/css" href="../../css/header.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf15.css">

</head>
<body>
<script type="text/javascript">
	function textTransform()
	{
		var mytext = document.getElementById('comment').value;
		mytext = mytext.replace(/\r?\n/g, "<br>");
		document.getElementById('comment').value = mytext;
	}
</script>
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
    <form action="../control/userControl.jsp" method="post">
    <h3>Escriba el comentario</h3>
    <textarea name="comentario" id="comment" class="area_text" placeholder="Escribe aqu&iacute; el comentario" required></textarea> <br><br>
    <input type="submit" value="Enviar" onclick="textTransform()">
    </form>
  </div>
 </body>
 </html>
 