package trabajo.IW;

/**
 * 
 * Clase Libro que contiene la informacion de los libros del sistema
 *
 */
public class LibroBean {
	private int id_libro;
	private String Titulo;
	private String Autor;
	private String Materia;
	private String Editorial;
	private int Paginas;
	private int Encuadernamiento;
	private int reservado;
	
	/**
	 * Observador de Id_libro
	 * @return identificador del libro
	 */
	public int getId_libro() {
		return id_libro;
	}
	
	/**
	 * Modificador de Id_libro
	 * @param id_libro
	 */
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	
	/**
	 * Observador de Titulo
	 * @return titulo del libro 
	 */
	public String getTitulo() {
		return Titulo;
	}
	
	/**
	 * Modificador de Titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	/**
	 * Observador de Autor
	 * @return autor del libro
	 */
	public String getAutor() {
		return Autor;
	}
	
	/**
	 * Modificador de Autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	/**
	 * Observador de Matera
	 * @return materia del libro
	 */
	public String getMateria() {
		return Materia;
	}
	
	/**
	 * Modificador de Materia
	 * @param materia
	 */
	public void setMateria(String materia) {
		Materia = materia;
	}
	
	/**
	 * Observador de Editorial
	 * @return editorial del libro
	 */
	public String getEditorial() {
		return Editorial;
	}
	
	/**
	 * Modificador de Editorial
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	
	/**
	 * Observador de Paginas
	 * @return numero de paginas del libro
	 */
	public int getPaginas() {
		return Paginas;
	}
	
	/**
	 * Modificador de Paginas
	 * @param paginas
	 */
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	
	/**
	 * Observador de Encuadernamiento
	 * @return encuadernamiento del libro
	 */
	public int getEncuadernamiento() {
		return Encuadernamiento;
	}
	
	/**
	 * Modificador de Encuadernamiento
	 * @param encuadernamiento
	 */
	public void setEncuadernamiento(int encuadernamiento) {
		Encuadernamiento = encuadernamiento;
	}
	
	/**
	 * Observador de Reservado
	 * @return estado de reserva del libro
	 */
	public int getReservado() {
		return reservado;
	}
	
	/**
	 * Modificador de Reservado
	 * @param reservado
	 */
	public void setReservado(int reservado) {
		this.reservado = reservado;
	}
}
