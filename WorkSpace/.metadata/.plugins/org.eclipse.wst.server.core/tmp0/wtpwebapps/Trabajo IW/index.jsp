<!DOCTYPE html>
<html>

<head>
  <title>Inicio Sesio</title>
  <meta charset="ISO-8859-1">
  <link rel="stylesheet" type="text/css" href="CSS/wf1.css">
</head>

<body>
  <div class="loggin">
    <!--Cuadro para introducir username, password o si ha olvidado la contraseņa-->
    <div class="inicio_sesion">
      <form action="Controlador/loginControl.jsp" method="post" target="_self">

        <!--Introduce el usuario-->
        Email<br>
        <input type="email" name="email" id="email" required><br><br>

        <!--Introduce la contraseņa-->
        Contrase&ntilde;a<br>
        <input type="password" name="contr" id="contr" required><br><br>

        <!--Quiere entrar en la aplicacion-->
        <input type="submit" value="Entrar">
      </form>
      <br>
      <a  href="Vistas/Registro.jsp"> Registrarse</a>
    </div>

    <!--Unirse si no tienes cuenta-->

  </div>

  <!--Mensaje de bienvenida-->
  <h2 class="mensaje_inicio"><strong>BICO</strong></h2>

  <!--Definimos la foto de inicio-->
  <img src="img/logo.PNG" alt="LOGO" class="logo_inicio">

</body>
</html>