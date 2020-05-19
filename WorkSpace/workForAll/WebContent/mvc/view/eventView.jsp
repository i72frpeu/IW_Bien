<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Foro</title>
	<link rel="stylesheet" type="text/css" href="../../css/header.css">
	<link rel="stylesheet" type="text/css" href="../../css/wf9.0.css">
	<link rel="stylesheet" type="text/css" href="../../css/wf8.0.css">
</head>

<body>
  <!--Roll de articulos-->
  <div class="div_home">
    <table>
        <tr>
          <td>
                <table >
                  <tr>
                    <td><img src="../../img/evento.jpg" alt="IMG_EVENT" class="img_event"> <h2>Nombre del evento</h2></td>
                  </tr>
                  <tr >
                      <td class="td_event">Aqui ir&aacute; la descripci&oacute;n del evento</td>
                  </tr>
                  <tr>
                    <td><input type="button" value="A&ntilde;adir comentario" onclick="window.open('addCommentView.jsp', 'A&ntildeadir comentario', 'top=300,left=700,width=600,height=400')"></a></td>
                  </tr>
                  <tr> 
                      <td><h2> Comentarios </h2></td>
                  </tr>
                  <tr>
                          <td>
                                <div >
                                  <table class="t_comentarios">
                                        <tr>
                                            <td class="td_dos_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></td>
                                            <td class="td_dos_com">Comentario del usuario</td>
                                        </tr>
                                        <tr>
                                            <td class="td_dos_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></td>
                                            <td class="td_dos_com">Comentario del usuario</td>
                                        </tr>
                                        <tr>
                                            <td class="td_dos_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></td>
                                            <td class="td_dos_com">Comentario del usuario</td>
                                        </tr>

                                        <tr>
                                            <td class="td_dos_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_USER" class="img_user_2"></td>
                                            <td class="td_dos_com">Comentario del usuario</td>
                                        </tr>

                                        <tr>
                                            <td class="td_dos_img"><img src="../../img/profile-42914_960_720.png" alt="IMG_EVENT" class="img_user_2"></td>
                                            <td class="td_dos_com">Comentario del usuario</td>
                                        </tr>
                                    </table>
                                </div>
                          </td>
                      
                  </tr>
                </table>
          </td>
        </tr>
    </table>
  </div>
 </body>
 </html>