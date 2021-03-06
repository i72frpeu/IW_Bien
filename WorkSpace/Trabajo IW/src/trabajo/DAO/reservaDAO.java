package trabajo.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Clase que permite modificar y establecer las reservas en la base de datos
 *
 */
public class ReservaDAO{

	  private int idReserva;
	  private String titulo;
	  private String usuario;
	  private String carnet_universidad;
	  private int fecha_inicio_Reserva;
	  private int fecha_final_Reserva;

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
	   * Modificador de fecha_final_Reserva
	   * @param fecha_final_Reserva
	   */
	  public void setfecha_final_Reserva(int fecha_fin_Reserva){
	    this.fecha_final_Reserva = fecha_fin_Reserva;
	  }

	  /**
	   * Carga en la web una reserva para su visualizacion
	   * @param id
	   * @return True si puede cargar la reserva, False si no se puede
	   */
		public boolean load_reserva(int id) {
			File f1 = new File("Reservas.csv");
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  int x = Integer.parseInt(linea[0]);
					  if(id == x && linea.length == 6) {
						  this.setIdReserva(Integer.parseInt(linea[0]));
						  this.setTitulo(linea[1]);
						  this.setUsuario(linea[2]);
						  this.setCarnet_universidad(linea[3]);
						  this.setfecha_inicio_Reserva(Integer.parseInt(linea[4]));
						  this.setfecha_final_Reserva(Integer.parseInt(linea[5]));
						  return true;
					  }
					 }
			  }catch(IOException e) {
					System.out.println(e);
			  }finally{
					fich.close();
			}
		  }
		  return false;
		}
		
		/**
		 * Carga en la web una reserva para su visualizacion
		 * @param usuario
		 * @param id
		 * @return True si puede cargar la reserva, False si no se puede
		 */
		public boolean load_reserva(String usuario, int id) {
			File f1 = new File("Reservas.csv");
			int cont = id;
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
						  String user = linea[2];
						  if(user.equals(usuario)) {
							  cont--;
							  if(cont == 0 && linea.length == 6) {
							  this.setIdReserva(Integer.parseInt(linea[0]));
							  this.setTitulo(linea[1]);
							  this.setUsuario(linea[2]);
							  this.setCarnet_universidad(linea[3]);
							  this.setfecha_inicio_Reserva(Integer.parseInt(linea[4]));
							  this.setfecha_final_Reserva(Integer.parseInt(linea[5]));
							  return true;
					  }
					  }
					 }
			  }catch(IOException e) {
					System.out.println(e);
			  }finally{
					fich.close();
			}
		  }
		  return false;
		}
		

		/**
		 * Carga en la web una reserva para su visualizacion
		 * @param usuario
		 * @param Titulo
		 * @return True si puede cargar la reserva, False si no se puede
		 */
		public boolean load_reserva(String usuario, String Titulo) {
			File f1 = new File("Reservas.csv");
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  String user = linea[2];
					  String titulo = linea[1];
					  if(user.equals(usuario) && titulo.equals(Titulo) && linea.length == 6) {
						  this.setIdReserva(Integer.parseInt(linea[0]));
						  this.setTitulo(linea[1]);
						  this.setUsuario(linea[2]);
						  this.setCarnet_universidad(linea[3]);
						  this.setfecha_inicio_Reserva(Integer.parseInt(linea[4]));
						  this.setfecha_final_Reserva(Integer.parseInt(linea[5]));
						  return true;
					  }
					 }
			  }catch(IOException e) {
					System.out.println(e);
			  }finally{
					fich.close();
			}
		  }
		  return false;
		}
		
		/**
		 * Guarda una reserva en la base de datos
		 * @param idReserva
		 * @param titulo
		 * @param usuario
		 * @param carnet_universidad
		 * @param fecha_inicio_Reserva
		 * @return True si se ha podido guardar el libro, False si no se puede
		 * @throws FileNotFoundException
		 */
		public boolean guardarReserva(int idReserva, String titulo, String usuario, String carnet_universidad, int fecha_inicio_Reserva) throws FileNotFoundException{
		    try{
		                Writer output = new BufferedWriter(new FileWriter("Reservas.csv", true));
		                output.append(idReserva + "," + titulo + "," + usuario + "," + carnet_universidad + "," + fecha_inicio_Reserva + "," + (fecha_inicio_Reserva+30) + "\n");
		                            
		                output.close();
		                System.out.println("Reserva realizada correctamente");
		                return true;
		        }catch(Exception e){System.out.println("Error: " + e);}
		    return false;
		  }
		
		/**
		 * Compara la Id de la reserva
		 * @param id
		 * @return True si la Id comparada es correcta, False si no se puede
		 * @throws FileNotFoundException
		 */
		public boolean comprobarId(int id) throws FileNotFoundException{
			File f1 = new File("Prestamos.csv");
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


		/**
		 * Cancela una reserva que se haya realizado con anterioridad
		 * @param id
		 * @throws FileNotFoundException
		 */
		public void cancelarReserva(int id) throws FileNotFoundException{
            if(!comprobarId(id)) {
              System.out.println("La Reserva con id " + id + " no se encuentra");
            }else {
                String linea="";
              FileReader fr = null;
              BufferedReader br = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                ArrayList<String> lineasAcopiar = new ArrayList<>();
              try{
                fr = new FileReader("Reservas.csv");
                    br = new BufferedReader(fr);
                    while(br.ready()){
                        linea = br.readLine();
                        String[] lineaComas = linea.split(",");
                        if(id!=Integer.parseInt(lineaComas[0])){
                          lineasAcopiar.add(linea);
                                          }else if(id==Integer.parseInt(lineaComas[0])){
                                              lineasAcopiar.add(linea + ",1");

                                          }
                    }
                    br.close();
                    //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO
                    fw = new FileWriter("Reservas.csv");
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
          }
		
		/**
		 * Devuelve el numero de reservas existente para generar el id de la reserva
		 * @return cont+1 (numero de reservas +1), -1 (si no se a podido realizar)
		 */
		public int numeroReservas() {
			  File f1 = new File("Reservas.csv");
			  if(f1.exists()) {
				  Scanner fich = null;
				  int cont = 0;
				  try {
					  fich = new Scanner(f1);
					  while(fich.hasNext()) {
						  	fich.nextLine();
						  	cont++;
					  }
				  }catch(IOException e) {
						System.out.println(e);
				  }finally{
						fich.close();
				  }
				 return cont+1; 
		  }
			return -1;
		}
}
