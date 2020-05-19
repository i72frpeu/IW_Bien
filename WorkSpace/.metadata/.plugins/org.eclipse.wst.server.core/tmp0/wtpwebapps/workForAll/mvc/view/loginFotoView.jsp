<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<% 
/* if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } */
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>login Foto</title>
  <link rel="stylesheet" href="../../css/wf7.1.css">
</head>

<body>
  <!--Scripts para el Wireframe 7.2-->
  <script type="text/javascript">
    
    // Funcion que comprueba que los datos introducidos son correctos. Si es verdad, abrimos el home
    function enviarFoto()
    {
      let foto = document.getElementById('foto').value;

      // Ahora mismo no comprueba con ninguna base de datos, por lo que abrimos nuestro home
      if (foto == "")
      {
        return false;
      }
      else
      {
        self.close();
        return true;
      }
    }

  </script>

  <h2><strong>Foto del Curriculum</strong></h2>
  <div>
    <table>
    <tr>
      <td><img src="../../img/profile-42914_960_720.png" class="img_curr"></td>
      <td> 
      <strong>Selecciona una imagen:</strong><br><br>
      <form action="wf2.2.html" method="post">
        <input type="file" id="foto" name="foto" required>
      </form>
      </td>
      </tr>
      
    </table>
    <input type="submit" value="Guardar" onclick="enviarFoto()">  <input type="button" value="Cancelar" onclick="self.close();"><br>
  </div>
</body>
</html>