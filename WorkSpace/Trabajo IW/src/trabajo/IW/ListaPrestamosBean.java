package trabajo.IW;
import java.util.ArrayList;
import java.util.List;
import trabajo.DAO.*;

/**
 * Clase de listas de Prestamos de Libros

 */
public class ListaPrestamosBean {
	private List<PrestamoDAO> listaPrestamos;
	
	/**
	 * Constructor de la clase Listas de Prestamos
	 */
	public ListaPrestamosBean() {
		this.listaPrestamos = new ArrayList<PrestamoDAO>();
	}
	/**
	 * Observador de ListaPrestamos
	 * @return Lista de los prestamos
	 */
	public List<PrestamoDAO> getListaPrestamos() {
		return listaPrestamos;
	}
	/**
	 * Modificador de ListaPrestamos
	 * @param listaPrestamos
	 */
	public void setListaLibros(List<PrestamoDAO> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}
	/**
	 * Carga los prestamos en el sistema
	 */
	public void loadPrestamos() {
		for(int i = 0; i < 8; i++) {
			PrestamoDAO aux = new PrestamoDAO();
			aux.load_prestamo_aleatorio(i+1);
			if(aux.getTitulo() != null) {
				listaPrestamos.add(aux);
			}
			
		}
	}
	/**
	 * Observador de PrestamoDAO
	 * @param i
	 * @return Prestamos de la lista con identificador "i"
	 */
	public PrestamoDAO getPrestamo(int i) {
		return this.listaPrestamos.get(i);
	}
	/**
	 * Observador de size
	 * @return Tamazo de la lista de Prestamos
	 */
	public int getsize() {
		return this.listaPrestamos.size();
	}
	/**
	 * Añade un prestamos al sistema
	 * @param aux
	 */
	public void addPresatmo(PrestamoDAO aux) {
		listaPrestamos.add(aux);
	}
	/**
	 * Carga de los prestamos de un usuario
	 * @param User
	 */
	public void loadPrestamo(String User) {
		if(listaPrestamos.size() != 0) {

		}else {
			for(int i = 0; i < 8; i++) {
				PrestamoDAO aux = new PrestamoDAO();
				aux.load_Prestamo(User, i+1);
				if(aux.getTitulo() != null) {
					listaPrestamos.add(aux);
				}
			}
		}
	}
	
	public void removePrestamo(int id) {
		for(int i = 0; i < listaPrestamos.size(); i++) {
			if(listaPrestamos.get(i).getId_prestamo() == id) {
				listaPrestamos.remove(i);
			}
		}
	}


}
