package trabajo.IW;

import trabajo.DAO.LibroDAO;

public class PrestamoBean {
	
	private int id_prestamo;
	private int id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private String carnet;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;
	
	public PrestamoBean() {
		this.id_prestamo = -1;
		this.id_libro = -1;
	    this.titulo = null;
	    this.autor = null;
	    this.usuario = null;
	    this.carnet = null;
	    this.fecha_inicio_prestamo = -1;
	    this.fecha_final_prestamo = -1;
	}
	
	public PrestamoBean(int id_prestamo, int id_libro, String titulo, String autor, String usuario, String carnet, int fecha_inicio_prestamo) {
		this.id_prestamo = id_prestamo;
		this.id_libro = id_libro;
	    this.titulo = titulo;
	    this.autor = autor;
	    this.usuario = usuario;
	    this.carnet = carnet;
	    this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	    this.fecha_final_prestamo = this.fecha_inicio_prestamo + 30;
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setIDLibroPrestamo() {
		  LibroDAO aux = new LibroDAO();
		  aux.load_libro(this.titulo);
		  this.id_libro = aux.getId_libro();
	  }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public int getFecha_inicio_prestamo() {
		return fecha_inicio_prestamo;
	}

	public void setFecha_inicio_prestamo(int fecha_inicio_prestamo) {
		this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	}

	public int getFecha_final_prestamo() {
		return fecha_final_prestamo;
	}

	public void setFecha_final_prestamo(int fecha_inicio_prestamo) {
		this.fecha_final_prestamo = fecha_inicio_prestamo+30;
	}
	
}

