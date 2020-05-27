package trabajo.IW;

import java.util.ArrayList;
import java.util.List;

import trabajo.DAO.LibroDAO;
/**
 * Clase de lista de Libros
 */
public class ListalibrosBean {
	private List<LibroDAO> listaLibros;
	
	/**
	 * Constructor de la lista de Libros
	 */
	public ListalibrosBean() {
		this.listaLibros = new ArrayList<LibroDAO>();
	}
	/**
	 * Observador de listaLibros
	 * @return Lista de libros
	 */
	public List<LibroDAO> getListaLibros() {
		return listaLibros;
	}
	/**
	 * Modificador de listaLibros
	 * @param listaLibros
	 */
	public void setListaLibros(List<LibroDAO> listaLibros) {
		this.listaLibros = listaLibros;
	}
	/**
	 * Carga los libros en el sistema
	 */
	public void loadLibros() {
		if(listaLibros.size() != 0) {
			
		}else {
			for(int i = 0; i < 8; i++) {
				LibroDAO aux = new LibroDAO();
				aux.load_libro_aleatorio(i+1);
				if(aux.getAutor() != null) {
					listaLibros.add(aux);
				}
			}
		}
	}
	/**
	 * Añade un libro a la lista
	 * @param aux
	 */
	public void addlibro(LibroDAO aux) {
		listaLibros.add(aux);
	}
	/**
	 * Observador de libro
	 * @param i
	 * @return Libro de la lista con identificador "i"
	 */
	public LibroDAO getLibro(int i) {
		return this.listaLibros.get(i);
	}
	/**
	 * Calcula los libros que hay en la lista
	 * @return Numero de libros en la lista
	 */
	public int getsize() {
		return listaLibros.size();
	}

}
