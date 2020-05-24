package trabajo.IW;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReservaBean{

  private int idReserva;
  private String titulo;
  private String usuario;
  private String carnet_universidad;
  private int fecha_inicio_Reserva;
  private int fecha_final_Reserva;

  public ReservaBean(int idReserva, String titulo, String usuario, String carnet_universidad, int fecha_inicio_Reserva){
    this.idReserva = idReserva;
    this.titulo = titulo;
    this.usuario = usuario;
    this.carnet_universidad = carnet_universidad;
    this.fecha_inicio_Reserva = fecha_inicio_Reserva;
    this.fecha_final_Reserva = this.fecha_inicio_Reserva + 30;
	}

  public int getIdReserva(){
		return idReserva;
	}
  public void setIdReserva(int idReserva){
    this.idReserva = idReserva;
  }

  public String getTitulo(){
		return titulo;
	}
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

	public String getUsuario(){
		return usuario;
	}
  public void setUsuario(String usuario){
    this.usuario = usuario;
  }

  public String getCarnet_universidad(){
    return carnet_universidad;
  }
  public void setCarnet_universidad(String carnet_universidad){
    this.carnet_universidad = carnet_universidad;
  }

  public int getFecha_inicio_Reserva(){
		return fecha_inicio_Reserva;
	}
  public void setfecha_inicio_Reserva(int fecha_inicio_Reserva){
    this.fecha_inicio_Reserva = fecha_inicio_Reserva;
  }

  public int getFecha_final_Reserva(){
    return fecha_final_Reserva;
  }
  public void setfecha_final_Reserva(int fecha_inicio_Reserva){
    this.fecha_final_Reserva = fecha_inicio_Reserva+30;
  }
}