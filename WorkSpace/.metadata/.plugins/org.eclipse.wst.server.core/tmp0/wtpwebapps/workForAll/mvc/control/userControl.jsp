<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.ComentariosDAO"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />
<jsp:useBean id="comentariosBean" class="es.uco.pw.display.javabean.ComentariosBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 )
	response.sendRedirect("../../index.jsp");
else
	response.sendRedirect("../view/userView.jsp");
%>

<%
ComentariosDAO bd_comments = new ComentariosDAO();
String text = "";
int userid = 0;
int commentid;
int rs;

// Extraigo variables
commentid = bd_comments.commentIDAssigned()+1;
userid = customerBean.getuserID();
text = request.getParameter("comentario");

// Guardo el comentario en la base de datos
rs = bd_comments.saveComentario(text, userid, commentid);
%>