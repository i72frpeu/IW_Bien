<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<%@ page import="es.uco.pw.display.javadao.ComentariosDAO" %>
<jsp:useBean id="comentariosBean" class="es.uco.pw.display.javabean.ComentariosBean" scope="session" />

<%
ComentariosDAO bd_coment = new ComentariosDAO();
%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>User</title>
	<link rel="stylesheet" type="text/css" href="../../css/header.css">
	<link rel="stylesheet" type="text/css" href="../../css/wf7.0.css">
</head>

<div class="div_home">
    <h3 class="h3_perfil"><jsp:getProperty name="customerBean" property="userNameR" /> <jsp:getProperty name="customerBean" property="userSurname" /></h3>
    <table class="dos">
        <tr>
          <td>
            <div >
                <table class="uno">
                    <tr>
                      <td><h3>Personalice su curr&iacute;culum</h3></td>
                      <td>
                      <div>
					      <table class="table_curriculum">
					          <tr><td class="td_curriculum"><a href="../control/userControl.jsp" onclick="window.open('../control/loginFotoControl.jsp', 'WireFrame 7.1', 'top=300,left=700,width=600,height=400')">Foto</a></td></tr>
					          <tr><td class="td_curriculum"><a href="../control/userControl.jsp" onclick="window.open('../control/seePersonalControl.jsp', 'WireFrame 7.2.2', 'top=300,left=700,width=600,height=400')">Datos personales</a></td></tr>
					          <tr><td class="td_curriculum"><a href="../control/userControl.jsp" onclick="window.open('../control/seeAcademyControl.jsp', 'WireFrame 7.3', 'top=300,left=700,width=600,height=400')">Datos academicos</a></td></tr>
					          <tr><td class="td_curriculum"><a href="../control/userControl.jsp" onclick="window.open('../control/seeIdiomsControl.jsp', 'WireFrame 7.5', 'top=300,left=700,width=600,height=400')">Idiomas</a></td></tr>
					          <tr><td class="td_curriculum"><a href="../control/userControl.jsp" onclick="window.open('../control/seeProfesionalControl.jsp', 'WireFrame 7.7', 'top=300,left=700,width=600,height=400')">Experiencia profesional</a></td></tr>
					      </table>
					  </div>
					  </td>
                    </tr>
                  </table>
            </div>
          </td>
        </tr>
    </table>
    <h3 class="h3_perfil"> Comentarios </h3>
          <table class="dos">
                <tr>
                    <td>
                      <div>
                      <%if (bd_coment.numOfCommentByUser(customerBean.getuserID()) == 0){%>
                      	<table class="uno">
                        	<tr>
                          		<td>Usted no ha publicado ningun comentario </td>
                        	</tr>
                      	</table>

                      <%}else{
                      	for (int i = 1; i <= bd_coment.commentIDAssigned(); i++)
                      	{
	                      		if (Integer.parseInt(bd_coment.get(i, "userID")) == customerBean.getuserID())
	                      		{%>
		                      	<table class="uno">
		                        	<tr>
		                          		<td><%=bd_coment.get(i, "Texto")%></td>
		                        	</tr>
		                      	</table>
		                      	<br>
	                      		<%}
                      	}
                      }%>
                      </div>
                    </td>
                  </tr>
          </table>
  </div>    
 </body>
 </html>