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
	<title>My Friends</title>
	<link rel="stylesheet" type="text/css" href="../../css/header.css">
	<link rel="stylesheet" type="text/css" href="../../css/wf7.0.css">
</head>

<!--Roll de artículos-->

  

  <div class="div_home">
    <div >
    	<table>
    		<tr>
    			<td>
    				<form action="../control/followControl.jsp">
    					<input type="hidden" name="id" value=<%= request.getParameter("id") %>>
    					<input type="submit" value="Seguir">
    				</form>
    			</td>
    			<td>
    			 <a href="../control/writeMessageControl.jsp"><button name="Mensaje" class="boton_mensaje">Enviar mensaje</button></a>
    			</td>
    		</tr>
    	</table>
    </div>
      
    <h3><%= request.getParameter("nombre") %> </h3>
    <table class="dos">
        <tr>
          <td>
            <div >
                <table class="uno">
                    <tr>
                      <td><h3>Observe el curriculum</h3></td>
                      <td>
  				
      <table class="table_curriculum">
          <tr><td class="td_curriculum"><a href="#" onclick="window.open('../control/friendPhotoControl.jsp', 'Foto', 'top=300,left=700,width=600,height=400')">Foto</a></td></tr>
          <tr><td class="td_curriculum"><form action="../control/nofriendPersonalControl.jsp" name="form">
          									<input type="hidden" name="id" value=<%= request.getParameter("id") %>>
          								</form><a href="javascript:document.form.submit()">Datos personales</a></td></tr>
          <tr><td class="td_curriculum"><form action="../control/nofriendAcademyControl.jsp" name="form2">
          									<input type="hidden" name="id" value=<%= request.getParameter("id") %>>
          								</form><a href="javascript:document.form2.submit()">Datos Academicos</a></td></tr>
          <tr><td class="td_curriculum"><form action="../control/nofriendIdiomasControl.jsp" name="form3">
          									<input type="hidden" name="id" value=<%= request.getParameter("id") %>>
          								</form><a href="javascript:document.form3.submit()">Idiomas</a></td></tr>
          <tr><td class="td_curriculum"><form action="../control/nofriendLaboralControl.jsp" name="form4">
          									<input type="hidden" name="id" value=<%= request.getParameter("id") %>>
          								</form><a href="javascript:document.form4.submit()">Esperiencia Profesional</a></td></tr>
      </table>
  </td>
                    </tr>
                  </table>
            </div>
          </td>
        </tr>
    </table>
    <h3 class="h3_anuncio"> Comentarios del usuario </h3>
          <table class="dos">
                <tr>
                    <td>
                      <div>
                      <%if (bd_coment.numOfCommentByUser(customerBean.getuserID()) == 0){%>
                      	<table class="uno">
                        	<tr>
                          		<td><%out.println("Usted no ha publicado ningun comentario"); %></td>
                        	</tr>
                      	</table>

                      <%}else
                      {
                      	for (int i = 1; i <= bd_coment.commentIDAssigned(); i++)
                      	{
                      		if (Integer.parseInt(bd_coment.get(i, "userID")) == customerBean.getuserID())
                      		{%>
	                      	<table class="uno">
	                        	<tr>
	                          		<td><%out.println(bd_coment.get(i, "Texto")); %></td>
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