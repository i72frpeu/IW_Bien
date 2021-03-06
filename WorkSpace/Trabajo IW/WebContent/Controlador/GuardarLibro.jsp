<%@page import="trabajo.DAO.LibroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<jsp:useBean id="libroactivo" class="trabajo.IW.LibroBean" scope="session" />
<%


	LibroDAO x = new LibroDAO();

	int i = x.numeroLibros();

	x.guardarLibro(i, request.getParameter("titulo"), request.getParameter("autor"), request.getParameter("materia"), request.getParameter("editorial"), Integer.parseInt(request.getParameter("paginas")), Integer.parseInt(request.getParameter("encuadernamiento")), 1);

	x.setId_libro(i);
	x.setTitulo(request.getParameter("titulo"));
	x.setAutor(request.getParameter("autor"));
	x.setMateria(request.getParameter("materia"));
	x.setEditorial(request.getParameter("editorial"));
	x.setPaginas(Integer.parseInt(request.getParameter("paginas")));
	x.setEncuadernamiento(Integer.parseInt(request.getParameter("encuadernamiento")));
	x.setReservado(1);
	
	listaLibros.addlibro(x);
	
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