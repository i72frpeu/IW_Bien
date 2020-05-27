package trabajo.IW;

import trabajo.DAO.LibroDAO;

/**
 * 
 * Clase Prestamo que contiene la informacion de los prestamos del sistema 
 *
 */

public class PrestamoBean {
	
	private int id_prestamo;
	private int id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private String carnet;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;
	
	/**
	   * Constructor de la clase Prestamo sin parametrizar
	   */
	
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
	
	/**
	 * Constructor de la clase Prestamo con parametros
	 * @param id_prestamo
	 * @param id_libro
	 * @param titulo
	 * @param autor
	 * @param usuario
	 * @param carnet
	 * @param fecha_inicio_prestamo
	 */
	
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
	
	/**
	   * Observador de id_prestamo
	   * @return Identificador del Prestamo
	   */

	public int getId_prestamo() {
		return id_prestamo;
	}
	
	/**
	   * Modificador de id_prestamo
	   * @param id_prestamo
	   */

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	
	/**
	   * Observador de id_libro
	   * @return Identificador del libro
	   */

	public int getId_libro() {
		return id_libro;
	}
	
	/**
	 * Modificador de id_libro usando la clase LibroDAO
	 */
	
	public void setIDLibroPrestamo() {
		  LibroDAO aux = new LibroDAO();
		  aux.load_libro(this.titulo);
		  this.id_libro = aux.getId_libro();
	}
	
	/**
	   * Observador del titulo
	   * @return titulo
	   */

	public String getTitulo() {
		return titulo;
	}
	
	/**
	   * Modificador del titulo
	   * @param titulo
	   */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	   * Observador del autor
	   * @return autor
	   */

	public String getAutor() {
		return autor;
	}
	
	/**
	   * Modificador del autor
	   * @param autor
	   */

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	   * Observador del usuario
	   * @return usuario
	   */

	public String getUsuario() {
		return usuario;
	}
	
	/**
	   * Modificador del usuario
	   * @param usuario
	   */

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	   * Observador del carnet universitario
	   * @return carnet
	   */

	public String getCarnet() {
		return carnet;
	}
	
	/**
	   * Modificador del carnet universitario
	   * @param carnet
	   */

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	/**
	   * Observador de la fecha de inicio del prestamo
	   * @return fecha de inicio del prestamo
	   */

	public int getFecha_inicio_prestamo() {
		return fecha_inicio_prestamo;
	}
	
	/**
	   * Modificador de la fecha de inicio del prestamo
	   * @param fecha_inicio_prestamo
	   */

	public void setFecha_inicio_prestamo(int fecha_inicio_prestamo) {
		this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	}
	
	/**
	   * Observador de la fecha final del prestamo
	   * @return fecha final del prestamo
	   */

	public int getFecha_final_prestamo() {
		return fecha_final_prestamo;
	}

	/**
	   * Modificador de la fecha final del prestamo
	   * @param fecha_inicio_prestamo
	   */
	
	public void setFecha_final_prestamo(int fecha_inicio_prestamo) {
		this.fecha_final_prestamo = fecha_inicio_prestamo+30;
	}
	
}

