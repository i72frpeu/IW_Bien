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
  <title>WireFrame 7.3</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Datos Academicos</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                     <tr>
                         <td>Estudios</td>
                         <td><%= request.getParameter("titulo") %></td>
                     </tr>
                     <tr>
                         <td>Centor</td>
                         <td><%= request.getParameter("universidad") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de inicio</td>
                         <td><%= request.getParameter("inicio") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de fin</td>
                         <td><%= request.getParameter("fin") %></td>
                     </tr>
                 </table>
             </td>
         </tr>
     </table>
	<button onclick="self.close();">Volver</button> <a href="../control/loginAcademyControl.jsp"><button>Editar</button></a><br>
  </div>
</body>
</html>