<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Formulario Expansion</title>
  <link rel="stylesheet" href="../CSS/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>
  <!--Mensaje de bienvenida-->
  <h2 class="title_wf2-1"><strong>Pedir Expansion</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="Reserva.jsp" method="post" target="_self">
      
      <strong>Fecha</strong><br>
      <input type="text" name="Fecha" required><br><br>
      
      <strong>Motivo</strong><br>
      <textarea name="motivo" cols="20" rows="5"></textarea><br><br>
      
      <input type="submit" value="Enviar Expansión"> 
    </form>
  </div>
</body>
</html>