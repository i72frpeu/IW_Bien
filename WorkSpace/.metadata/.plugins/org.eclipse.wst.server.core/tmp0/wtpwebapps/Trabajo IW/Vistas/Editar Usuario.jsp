<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Realizar Reserva</title>
  <link rel="stylesheet" href="../CSS/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>
  <!--Mensaje de bienvenida-->
  <h2 class="title_wf2-1"><strong>Registrate y Reserva libros en nuestra biblioteca</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="Usuario.jsp" method="post" target="_self">
      <strong>Usuario</strong></td><br>
      <input type="text" name="usuario" required><br><br>
      
      <strong>Nombre</strong><br>
      <input type="text" name="nombre" required><br><br>
      
      <strong>Apellidos</strong><br>
      <input type="text" name="apellido" required><br><br>
      
      <strong>Email</strong><br>
      <input type="email" name="email" required><br><br>
      
      <strong>Carnet Universitario</strong><br>
      <input type="text" name="carnet" required><br><br>
      
      <strong>Contraseña</strong><br>
      <input type="text" name="password" required><br><br>
      
      <input type="submit" value="Editar"> 
    </form>
  </div>
</body>
</html>