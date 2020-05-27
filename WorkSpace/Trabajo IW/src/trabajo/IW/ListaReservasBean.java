package trabajo.IW;

import java.util.ArrayList;
import java.util.List;

import trabajo.DAO.ReservaDAO;

/**
 * Clase de las Lista de Reservas
 */
public class ListaReservasBean {
	private List<ReservaDAO> listaReservas;
	/**
	 * Constructor de la clase ListaReservas
	 */
	public ListaReservasBean() {
		this.listaReservas = new ArrayList<ReservaDAO>();
	}
	/**
	 * Observador de listaReservas
	 * @return Lista con las reservas de libros
	 */
	public List<ReservaDAO> getListaLibros() {
		return listaReservas;
	}
	/**
	 * Modificador de listaReservas
	 * @param listaReservas
	 */
	public void setListaReservas(List<ReservaDAO> listaReservas) {
		this.listaReservas = listaReservas;
	}
	/**
	 * Carga las reservas en el sistema
	 */
	public void loadReserva() {
		if(listaReservas.size() != 0) {

		}else {
			for(int i = 0; i < 8; i++) {
				ReservaDAO aux = new ReservaDAO();
				aux.load_reserva(i+1);
				if(aux.getTitulo() != null) {
					listaReservas.add(aux);
				}
			}
		}
	}
	/**
	 * Carga las reservas a un usuario determinado
	 * @param User
	 */
	public void loadReserva(String User) {
		if(listaReservas.size() != 0) {

		}else {
			for(int i = 0; i < 8; i++) {
				ReservaDAO aux = new ReservaDAO();
				aux.load_reserva(User, i+1);
				if(aux.getTitulo() != null) {
					listaReservas.add(aux);
				}
			}
		}
	}
	/**
	 * Eliminar una reserva con identificador "id"
	 * @param id
	 */
	public void removeReserva(int id) {
		for(int i = 0; i < listaReservas.size(); i++) {
			if(listaReservas.get(i).getIdReserva() == id) {
				listaReservas.remove(i);
			}
		}
	}
	/**
	 * Añade una reserva
	 * @param aux
	 */
	public void addReserva(ReservaDAO aux) {
		listaReservas.add(aux);
	}
	/**
	 * Observador de reserva
	 * @param i
	 * @return Reserva de listaReservas con identificador "i"
	 */
	public ReservaDAO getReserva(int i) {
		return this.listaReservas.get(i);
	}
	/**
	 * Calcula las reservas que hay en el sistema
	 * @return Numero de reservas
	 */
	public int getsize() {
		return listaReservas.size();
	}

}
