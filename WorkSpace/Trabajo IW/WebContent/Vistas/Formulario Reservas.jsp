<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="libroactivo" class="trabajo.IW.LibroBean" scope="session" />


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
  <h2 class="title_wf2-1"><strong>Crear Reserva</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="../Controlador/Realizar Reserva.jsp" method="post" target="_self">
      <strong>Titulo</strong></td><br>
      <input type="text" name="titulo" value="<%= libroactivo.getTitulo() %>" required><br><br>
      
      <strong>Usuario</strong><br>
      <input type="text" name="usuario" value="<%= Usuario.getUsuario() %>" required><br><br>
      
      <strong>Carnet Universitario</strong><br>
      <input type="text" name="carnet" value="<%= Usuario.getCarnet() %>" required><br><br>
      
      <strong>Fecha</strong><br>
      <input type="text" name="Fecha" required><br><br>
      
      <input type="submit" value="Reservar"> 
    </form>
  </div>
</body>
</html>