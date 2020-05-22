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

  public static Boolean comprobarId(int id) throws FileNotFoundException{
    File f1 = new File("C:/User/reservas.csv");
    boolean comprueba = false;
    if(f1.exists()) {
                Scanner fich;
        fich = new Scanner(f1);
        
                while(fich.hasNextLine()) {
                        String[] linea = fich.nextLine().split(",");
                        if(id == Integer.parseInt(linea[0])){
                          comprueba = true;
                        }
                    }
                fich.close();
                }
    return comprueba;
  }

public static void guardarReserva(int idReserva, String titulo, String usuario, String carnet_universidad, int fecha_inicio_Reserva) throws FileNotFoundException{
    try{
      if(comprobarId(idReserva)) {
                System.out.println("El libro a reservar no esta disponible en este momento");
            }else {
                Writer output = new BufferedWriter(new FileWriter("C:/User/reservas.csv",true));
                output.append(idReserva + "," + titulo + "," + usuario + "," + carnet_universidad + "," + fecha_inicio_Reserva + "," + (fecha_inicio_Reserva+30) + "\n");
                            
                output.close();
                System.out.println("Reserva realizada correctamente");
      }
        }catch(Exception e){System.out.println("Error: " + e);}
  }


  /*public static void cancelarReserva(int id) throws FileNotFoundException{
      if(!comprobarId(id)) {
        System.out.println("La Reserva con id " + id + " no se encuentra");
      }else {
          String linea="";
        FileReader fr = null;
        BufferedReader br = null;
          FileWriter fw = null;
          BufferedWriter bw = null;
          List lineasAcopiar = new ArrayList<>();
        try{
          fr = new FileReader("C:/User/reservas.csv");
              br = new BufferedReader(fr);
              while(br.ready()){
                  linea = br.readLine();
                  String[] lineaComas = linea.split(",");
                  if(id!=Integer.parseInt(lineaComas[0]))
                    lineasAcopiar.add(linea);
              }
              br.close();
              //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO
              fw = new FileWriter("C:/User/reservas.csv");
              bw = new BufferedWriter(fw);
              for(int l=0;l<lineasAcopiar.size();l++){
                  linea = (String)lineasAcopiar.get(l);
                  bw.write(linea);
                  bw.newLine();
              }
              bw.close();
              System.out.println("La linea con id " + id + " ha sido borrada");
  
          }catch(Exception e){System.out.println("Error: " + e);}
      }
    }    */
}


