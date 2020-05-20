<%@page import="trabajo.DAO.LibroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<jsp:useBean id="libroactivo" class="trabajo.IW.LibroBean" scope="session" />
<%


	LibroDAO x = new LibroDAO();
	
	System.out.println(request.getParameter("titulo"));
	
	String libro = request.getParameter("titulo");
	
	if(x.load_libro(libro) == true){
		libroactivo.setId_libro(x.getId_libro());
		libroactivo.setTitulo(x.getTitulo());
		libroactivo.setAutor(x.getAutor());
		libroactivo.setMateria(x.getMateria());
		libroactivo.setPaginas(x.getPaginas());
		libroactivo.setEditorial(x.getEditorial());
		libroactivo.setEncuadernamiento(x.getEncuadernamiento());
		response.sendRedirect("../Vistas/Libro.jsp");
	}


%>