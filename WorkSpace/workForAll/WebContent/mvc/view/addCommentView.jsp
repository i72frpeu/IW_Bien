<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Comentario</title>
</head>

<body>
  <!--Anadir comentarios-->
  <script type="text/javascript">
    
    // Funcion que comprueba que los datos introducidos son correctos. Si es verdad, abrimos el home
    function enviarComentario()
    {
      let comentario = document.getElementById('comentario').value;

      // Ahora mismo no comprueba con ninguna base de datos, por lo que abrimos nuestro home
      if (comentario == "")
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
  <h2><strong>A&ntilde;adir Comentario</strong></h2>
  <div>
  <form action="eventView.jsp" method="post">
    <h3>Comentario</h3>
    <textarea name="comentario" id="comentario" rows="10" cols="40" placeholder="Escribe aqu&iacute; el comentario" required></textarea><br>
    <input type="submit" onclick="enviarComentario()" value="A&ntilde;adir"> <input type="button" value="Cancelar" onclick="self.close();">
  </form>
  </div>
</body>
</html>