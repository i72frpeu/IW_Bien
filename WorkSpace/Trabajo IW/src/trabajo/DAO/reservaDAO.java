package trabajo.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ReservaDAO{

	  private int idReserva;
	  private String titulo;
	  private String usuario;
	  private String carnet_universidad;
	  private int fecha_inicio_Reserva;
	  private int fecha_final_Reserva;

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
	  public void setfecha_final_Reserva(int fecha_fin_Reserva){
	    this.fecha_final_Reserva = fecha_fin_Reserva;
	  }

		public boolean load_reserva(int id) {
			File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Reservas.csv");
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  int x = Integer.parseInt(linea[0]);
					  if(id == x) {
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
		
		public boolean load_reserva(String usuario) {
			File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Reservas.csv");
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  String user = linea[2];
					  if(user.equals(usuario)) {
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
		
		
		public boolean load_reserva(String usuario, String Titulo) {
			File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Reservas.csv");
			if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;

				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  String user = linea[2];
					  String titulo = linea[1];
					  if(user.equals(usuario) && titulo.equals(Titulo)) {
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
		
		public boolean guardarReserva(int idReserva, String titulo, String usuario, String carnet_universidad, int fecha_inicio_Reserva) throws FileNotFoundException{
		    try{
		                Writer output = new BufferedWriter(new FileWriter("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Reservas.csv", true));
		                output.append(idReserva + "," + titulo + "," + usuario + "," + carnet_universidad + "," + fecha_inicio_Reserva + "," + (fecha_inicio_Reserva+30) + "\n");
		                            
		                output.close();
		                System.out.println("Reserva realizada correctamente");
		                return true;
		        }catch(Exception e){System.out.println("Error: " + e);}
		    return false;
		  }
		
		public int comprobarId() throws FileNotFoundException{
		    File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Reservas.csv");
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