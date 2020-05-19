<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<% 
if (customerBean.getuserID() == 0 ) { 
	 response.sendRedirect("../../index.jsp");
 } 
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
  <title>WireFrame 7.2.2</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Información Personal</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                     <tr>
                         <td>Nombre</td>
                         <td><%= request.getParameter("nombre") %></td>
                     </tr>
                     <tr>
                         <td>Apellidos</td>
                         <td><%= request.getParameter("apellido") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de Nacimiento</td>
                         <td><%= request.getParameter("fecha") %></td>
                     </tr>
                     <tr>
                         <td>Pais</td>
                         <td><%= request.getParameter("pais") %></td>
                     </tr>
                     <tr>
                         <td>Localidad</td>
                         <td><%= request.getParameter("localidad") %></td>
                     </tr>
                     <tr>
                         <td>Movil</td>
                         <td><%= request.getParameter("movil") %></td>
                     </tr>
                     <tr>
                         <td>Email</td>
                         <td><%= request.getParameter("email") %></td>
                     </tr>
                 </table>
             </td>
         </tr>
     </table>
    <button onclick="self.close();">Volver</button>  <a href="../control/loginPersonalInfoControl.jsp"><button>Editar</button></a> <br>
  </div>
</body>
</html>