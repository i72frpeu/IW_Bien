package trabajo.IW;

public class LibroBean {
	private int id_libro;
	private String Titulo;
	private String Autor;
	private String Materia;
	private String Editorial;
	private int Paginas;
	private int Encuadernamiento;
	
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getMateria() {
		return Materia;
	}
	public void setMateria(String materia) {
		Materia = materia;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	public int getEncuadernamiento() {
		return Encuadernamiento;
	}
	public void setEncuadernamiento(int encuadernamiento) {
		Encuadernamiento = encuadernamiento;
	}
}
