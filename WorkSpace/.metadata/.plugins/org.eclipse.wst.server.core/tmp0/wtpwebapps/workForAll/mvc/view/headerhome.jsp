<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="amigosBean" class="es.uco.pw.display.javabean.AmigosBean" scope="session" />

<% 
 if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("index.jsp");
 } 

%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
</head>

<body>
  <header class="main-header">
    <!--Definimos el logo-->
    <img src="img/logo.jpg" alt="LOGO" class="logo_home">
    <!--Enlace a HOME-->
	<a href="mvc/control/homeControl.jsp" class="link_home"><strong>HOME</strong></a>
    <!--Enlace a AMIGOS-->
    <a href="mvc/control/friendsControl.jsp" class="link_amigos"><strong>AMIGOS</strong></a>
    <!--Enlace a BUSCADOR-->
    <a href="mvc/control/lookforControl.jsp" class="link_buscador"><strong>BUSCADOR</strong></a>
    <!--Enlace a FORO-->
    <a href="mvc/control/foroControl.jsp" class="link_foro"><strong>FORO</strong></a>   
    <!--Definimos imagen usuario-->
    <div>
      <img src="img/profile-42914_960_720.png" alt="IMG_USER" class="img_user">
      <div class="options_user">
        <form>
          <br><a href="mvc/control/userControl.jsp"> <jsp:getProperty name="customerBean" property="userNameR" /> <jsp:getProperty name="customerBean" property="userSurname" /> </a><br>
          <a href="mvc/control/receiveMessagesControl.jsp"> Mensajes </a><br>
          <a href="mvc/control/logoutControl.jsp"> Cerrar Sesion </a>
        </form>
      </div>
    </div>
  </header>


  <div class="div_lista_amigos">
    <h3 class = "lista_amigos">Lista de tus amigos</h3>
		<% for(int i = 0; i < amigosBean.getAmigos(); i++){ %>
    	<form name=<%= "form" + i %> action="mvc/control/myFriendControl.jsp">
    		<input type="hidden" name="nombre" value=<%= i %>>
    		<a href="javascript:document.form<%= i %>.submit()"><%=amigosBean.getAmigosArray(i)%></a><br>
    	</form>
    	<br>
      <%} %>
  </div> 
  
  <a href="mvc/control/aboutUsControl.jsp" class="sobre"> Sobre nosotros</a>
  <a href="mvc/control/supportControl.jsp" class="tecnico"> Soporte tecnico</a>
  <a href="mvc/control/addPostControl.jsp"><input type="button" class="boton_cir" value="+"></a>
 
 </body>
 </html> 
