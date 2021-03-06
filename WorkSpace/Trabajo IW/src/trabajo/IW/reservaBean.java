package trabajo.IW;

import trabajo.DAO.LibroDAO;

/**
 * 
 * Clase Reserva que contiene la informacion de las reservas del sistema
 *
 */
public class ReservaBean{

  private int idReserva;
  private String titulo;
  private String usuario;
  private String carnet_universidad;
  private int fecha_inicio_Reserva;
  private int fecha_final_Reserva;
  
  /**
   * Constructor de la clase Reserva sin parametrizar
   */
  public ReservaBean() {
	  this.idReserva = -1;
	  this.titulo = null;
	  this.usuario = null;
	  this.carnet_universidad = null;
	  this.fecha_inicio_Reserva = -1;
	  this.fecha_inicio_Reserva = -1;
  }

  /**
   * Constructor de la clase Reserva con parametros
   * @param idReserva
   * @param titulo
   * @param usuario
   * @param carnet_universidad
   * @param fecha_inicio_Reserva
   */
  public ReservaBean(int idReserva, String titulo, String usuario, String carnet_universidad, int fecha_inicio_Reserva){
    this.idReserva = idReserva;
    this.titulo = titulo;
    this.usuario = usuario;
    this.carnet_universidad = carnet_universidad;
    this.fecha_inicio_Reserva = fecha_inicio_Reserva;
    this.fecha_final_Reserva = this.fecha_inicio_Reserva + 30;
	}

  /**
   * Observador de IDLibroReserva
   * @return Identificador del libro
   */
  public int getIDLibroReserva() {
	  LibroDAO aux = new LibroDAO();
	  aux.load_libro(this.titulo);
	  return aux.getId_libro();
  }
  
  /**
   * Observador de AutorLibroReserva
   * @return Autor
   */
  public String getAutorLibroReserva() {
	  LibroDAO aux = new LibroDAO();
	  aux.load_libro(this.titulo);
	  return aux.getAutor();
  }
  
  /**
   * Observador de IdReserva
   * @return Id de la reserva
   */
  public int getIdReserva(){
		return idReserva;
	}
  
  /**
   * Modificador de IdReserva
   * @param idReserva
   */
  public void setIdReserva(int idReserva){
    this.idReserva = idReserva;
  }

  /**
   * Observador de Titulo
   * @return titulo de la reserva
   */
  public String getTitulo(){
		return titulo;
	}
  
  /**
   * Modificador de Titulo
   * @param titulo
   */
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  /**
   * Observador de Usuario
   * @return usuario de la reserva
   */
  public String getUsuario(){
	return usuario;
  }
	
	/**
	 * Modificador de Usuario
	 * @param usuario
	 */
  public void setUsuario(String usuario){
    this.usuario = usuario;
  }

  /**
   * Observador de Carnet_universidad
   * @return carnet_universidad de la reserva
   */
  public String getCarnet_universidad(){
    return carnet_universidad;
  }
  
  /**
   * Modificador de Carnet_universidad
   * @param carnet_universidad
   */
  public void setCarnet_universidad(String carnet_universidad){
    this.carnet_universidad = carnet_universidad;
  }

  /**
   * Observador de fecha_inicio_Reserva
   * @return fecha de inicio de la reserva
   */
  public int getFecha_inicio_Reserva(){
		return fecha_inicio_Reserva;
	}
  
  /**
   * Modificador de fecha_inicio_Reserva
   * @param fecha_inicio_Reserva
   */
  public void setfecha_inicio_Reserva(int fecha_inicio_Reserva){
    this.fecha_inicio_Reserva = fecha_inicio_Reserva;
  }

  /**
   * Observador de fecha_final_Reserva
   * @return fecha final de la reserva
   */
  public int getFecha_final_Reserva(){
    return fecha_final_Reserva;
  }
  
  /**
   * Modificador de fech_final_Reserva
   * @param fecha_final_Reserva
   */
  public void setfecha_final_Reserva(int fecha_final_Reserva){
    this.fecha_final_Reserva = fecha_final_Reserva;
  }
}