<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="es.uco.pw.display.javadao.UserDAO"%>
<jsp:useBean id="customerBean" class="es.uco.pw.display.javabean.CustomerBean" scope="session" />

<% 
if (customerBean.getuserID() == 0 ) { 
     response.sendRedirect("../../index.jsp");
 } 
%>

<%
    UserDAO control = new UserDAO();

    customerBean.setuserID(0);
    customerBean.setuserName("");
    customerBean.setuserPassword("");
    customerBean.setuserNameR("");
    customerBean.setuserSurname("");
    customerBean.setuserGender(0);
    response.sendRedirect("../../index.jsp");
%>
