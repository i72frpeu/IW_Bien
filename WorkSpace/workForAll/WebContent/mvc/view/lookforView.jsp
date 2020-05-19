<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<html>

<head>
<meta charset="ISO-8859-1">
  <title>Buscador</title>
  <link rel="stylesheet" type="text/css" href="../../css/header.css">
  <link rel="stylesheet" type="text/css" href="../../css/wf6.0.css">

</head>

<body>

<div class="div_home">
    
      <div class="buscador">
        <input type="search" id="miBusqueda" name="q" class="q_buscador">
        <input type="button" value="Buscar">
      </div>
   
    <table class="dos">
    <% for(int i = 0; i < 8; i++){ %>
       <tr>
           <td>
                <table class="uno">
                        <tr>
                          <td class="td_user_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></td>
                          <td class="td_user_des"><a href=../control/myFriendControl.jsp>Usuario y Apellido</a></td>
                        </tr>
                      </table>
           </td>
       </tr>
	<% } %>
    </table>
  </div>
    
 </body>
 </html>