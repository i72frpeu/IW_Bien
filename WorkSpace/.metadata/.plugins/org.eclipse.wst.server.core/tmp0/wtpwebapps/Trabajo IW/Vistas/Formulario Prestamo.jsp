<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Guardar Libro</title>
  <link rel="stylesheet" href="../CSS/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>
  <!--Mensaje de bienvenida-->
  <h2 class="title_wf2-1"><strong>Pedir Expansion</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="Prestamo (Admin).jsp" method="post" target="_self">
      
      <strong>Nombre</strong><br>
      <input type="text" name="nombre" required><br><br>
      
      <strong>Apellidos</strong><br>
      <input type="text" name="apellidos" required><br><br>
      
      <strong>ID libro</strong><br>
      <input type="text" name="id" required><br><br>
      
      <strong>Titulo</strong><br>
      <input type="text" name="Título" required><br><br>
      
      <strong>Fecha Inico</strong><br>
      <input type="text" name="fecha" required><br><br>
           
      <input type="submit" value="Confirmar Prestamo"> 
    </form>
  </div>
</body>
</html>