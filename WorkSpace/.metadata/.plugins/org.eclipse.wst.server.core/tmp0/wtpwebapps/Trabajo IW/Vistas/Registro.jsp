<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Registrarse</title>
  <link rel="stylesheet" href="../CSS/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>
  <script type="text/javascript">
    // Funcion que muestra la contraseña 1
    function mostrarContrasena()
    {
      if (document.getElementById('verpassword').type == "password")
      {
        document.getElementById('verpassword').type = "text";
      }
      else
      {
        document.getElementById('verpassword').type = "password";
      }
    }

    // Funcion que muestra la contraseña 2
    function mostrarContrasena2()
    {
      if (document.getElementById('verpassword2').type == "password")
      {
        document.getElementById('verpassword2').type = "text";
      }
      else
      {
        document.getElementById('verpassword2').type = "password";
      }
    }
  </script>

  <!--Mensaje de bienvenida-->
  <h2 class="title_wf2-1"><strong>Registrate y Reserva libros en nuestra biblioteca</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="../Controlador/Registro.jsp" method="post" target="_self">
      <table>
        <tr>
          <td> <strong>Nombre</strong></td> <td class="td_user"><strong>Apellidos</strong></td>
        </tr>
        <tr>
          <td><input type="text" name="nombre" required></td> <td><input type="text" name="apellidos" required></td>
        </tr>
      </table>
      
      <strong>Usuario</strong><br>
      <input type="text" name="usuario" required><br><br>
      
      <!--CORREO ELECTRONICO-->
      <strong>Correo electr&oacute;nico</strong><br>
      <input type="email" name="email" required><br><br>
      
      <!--Carnet Universitario-->
      <strong>Carnet Universitario</strong><br>
      <input type="text" name="carnet" required><br><br>
      
      <!--CONTRASEÑA 1-->
      <strong>Contrase&ntilde;a</strong><br>
      <input type="password" name="password" id="verpassword" required>&nbsp&nbsp<input type="Checkbox" onclick="mostrarContrasena()">Mostrar Contrase&ntilde;a<br><br>
      
      <input type="submit" value="Registrarse"> 
    </form>

    <!--El usuario desea cancelar su registro-->
    <br>
    <a href="../index.jsp"><input type="button" value="Iniciar Sesion"></a><br>
  </div>

  

</body>
</html>
