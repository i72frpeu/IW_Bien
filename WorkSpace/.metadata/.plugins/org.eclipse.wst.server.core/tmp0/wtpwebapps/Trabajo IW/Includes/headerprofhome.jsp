<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
</head>

<body>
  <header class="main-header">
    <!--Definimos el logo-->
    <img src="img/logo.PNG" alt="LOGO" class="logo_home">
    <!--Enlace a HOME-->
	<a href="Controlador/Home.jsp" class="link_home"><strong>HOME</strong></a>
    <!--Enlace a Reservas-->
    <a href="Vistas/Home Reservas.jsp" class="link_amigos"><strong>RESERVAS</strong></a>
    <!--Enlace a Prestamos-->
    <a href="Vistas/Home Prestamos.jsp" class="link_buscador"><strong>PRESTAMOS</strong></a>
    <!-- Enlace pedidos -->
    <a href="Vistas/Home Pedidos.jsp" class="link_foro"><strong>PEDIDOS</strong></a>
    <!--Definimos imagen usuario-->
    <div>
      <img src="img/profile-42914_960_720.png" alt="IMG_USER" class="img_user">
      <div class="options_user">
      	<h3><jsp:getProperty name="Usuario" property="usuario" /></h3>
      	<a href="index.jsp"> Cerrar Sesion </a>
      </div>
    </div>
  </header>
 </body>
 </html> 