<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<% 
if (customerBean.getuserName() != "" ) { 
	 response.sendRedirect("../../home.jsp");
 } 
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>Sing On</title>
  <link rel="stylesheet" href="../../css/wf2.1.css">
  <script src="p2.js"></script>
</head>

<body>
  <script type="text/javascript">
    // Funcion que muestra la contraseņa 1
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

    // Funcion que muestra la contraseņa 2
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
  <h2 class="title_wf2-1"><strong>Comparte tu vida profesional</strong></h2>

  <!--NOMBRE Y APELLIDOS-->
  <div class="registro">
    <form action="../control/enterinfouserControl.jsp" method="post" target="_self">
      <table>
        <tr>
          <td> <strong>Nombre</strong></td> <td class="td_user"><strong>Apellidos</strong></td>
        </tr>
        <tr>
          <td><input type="text" name="nombre" required></td> <td><input type="text" name="apellidos" required></td>
        </tr>
      </table>
      
      <!--CORREO ELECTRONICO-->
      <strong>Correo electr&oacute;nico</strong><br>
      <input type="email" name="email" required><br><br>
      
      <!--SEXO-->
      <strong>Sexo</strong><br>
      <input type="radio" name="genero" value="fem" required>Femenino&nbsp&nbsp&nbsp&nbsp<input type="radio" name="genero" value="masc" required>Masculino&nbsp&nbsp&nbsp&nbsp<input type="radio" name="genero" value="ind" required>Indiferente<br><br>
      
      <!--CONTRASEŅA 1-->
      <strong>Contrase&ntilde;a</strong><br>
      <input type="password" name="password" id="verpassword" required>&nbsp&nbsp<input type="Checkbox" onclick="mostrarContrasena()">Mostrar Contrase&ntilde;a<br><br>
      
      <!--CONTRASEŅA 2-->
      <strong>Confirmar contrase&ntilde;a</strong><br>
      <input type="password" name="password2" id="verpassword2" required>&nbsp&nbsp<input type="Checkbox" onclick="mostrarContrasena2()">Mostrar Contrase&ntilde;a<br><br>
      
      <!--POLITICAS DE PRIVACIDAD-->
      <a href="wf16.0.html" target="_blank">Pol&iacute;ticas de privacidad</a><br>
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="Checkbox" name="acept_polpriv" value="polpriv" required>Acepto pol&iacute;ticas de privacidad<br><br>
      
      
      <input type="submit" value="Continuar">
    </form>

    <!--El usuario desea cancelar su registro-->
    <a href="../control/indexControl.jsp"><input type="button" value="Cancelar"></a><br>
  </div>

  

</body>
</html>
