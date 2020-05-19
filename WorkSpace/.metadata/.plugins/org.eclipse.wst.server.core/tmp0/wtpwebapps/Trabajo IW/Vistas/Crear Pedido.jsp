<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Crear Pedido</title>
  <link rel="stylesheet" href="../CSS/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>

  <!--Mensaje de bienvenida-->
  <h2 class="title_wf2-1"><strong>Crear Pedido</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="Pedido.jsp" method="post" target="_self">
      <table>
        <tr>
          <td> <strong>Nombre</strong></td> <td class="td_user"><strong>Apellidos</strong></td>
        </tr>
        <tr>
          <td><input type="text" name="nombre" required></td> <td><input type="text" name="apellidos" required></td>
        </tr>
      </table>
      
      <strong>Titulo Libro</strong><br>
      <input type="text" name="titulo" required><br><br>
      
      <strong>Autores</strong><br>
      <input type="text" name="autor" required><br><br>
      
      <strong>Numero Ejemplares</strong><br>
      <input type="text" name="ejemplares" required><br><br>
      
      <strong>Prescio Estimado</strong><br>
      <input type="text" name="precio" required><br><br>
      
      <input type="submit" value="Enviar Pedido"> 
    </form>

  </div>
</body>
</html>
