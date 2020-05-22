<%@page import="trabajo.DAO.LibroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<jsp:useBean id="libroactivo" class="trabajo.IW.LibroBean" scope="session" />
<%


	LibroDAO x = new LibroDAO();
	
	String libro = request.getParameter("titulo");
	
	if(x.load_libro(libro) == true){
		libroactivo.setId_libro(x.getId_libro());
		libroactivo.setTitulo(x.getTitulo());
		libroactivo.setAutor(x.getAutor());
		libroactivo.setMateria(x.getMateria());
		libroactivo.setPaginas(x.getPaginas());
		libroactivo.setEditorial(x.getEditorial());
		libroactivo.setEncuadernamiento(x.getEncuadernamiento());
		libroactivo.setReservado(x.getReservado());
		if(Usuario.getTipo() == 1){
			response.sendRedirect("../Vistas/Libro.jsp");
		}else{
			if(Usuario.getTipo() == 2){
				response.sendRedirect("../Vistas/Libro.jsp");
		}else{
			if(Usuario.getTipo() == 3){
				response.sendRedirect("../Vistas/Libro Admin.jsp");
			}
		}
	} 
	}


%>