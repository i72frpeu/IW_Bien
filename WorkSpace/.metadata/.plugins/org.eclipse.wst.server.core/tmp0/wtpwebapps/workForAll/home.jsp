<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="mvc/view/headerhome.jsp" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/wf4.0.css">
</head>

<body>
  <!--Roll de art�culos-->

  <div class="div_home">
    <table class="dos">
    <% for (int i = 0; i < 8; i++){ %>
        <tr>
          <td>
              <table class="uno">
                  <tr>
                    <td class="td_user_img"><a href="mvc/control/myFriendControl.jsp"><img src="img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></a></td>
                    <td class="td_user_des">Aqui va la descripcion que ser� muy larga</td>
                  </tr>
                  <tr>
                    <td></td>
                    <td><a href="mvc/control/eventControl.jsp"><button name="foro" class="boton_user">Foro</button></a></td>
                  </tr>
                </table>
          </td>
        </tr>
        <%} %>
    </table>
  </div>

</body>

</html>
