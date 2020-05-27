package trabajo.DAO;


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * Clase Prestamo que contiene la informacion de los prestamos del sistema 
 *
 */

public class PrestamoDAO {
	
	private int id_prestamo;
	private int id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private String carnet;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;
	
	  /**
	   * Constructor de la clase Prestamo sin parametrizar
	   */
	
	public PrestamoDAO() {
		this.id_prestamo = -1;
		this.id_libro = -1;
	    this.titulo = null;
	    this.autor = null;
	    this.usuario = null;
	    this.carnet = null;
	    this.fecha_inicio_prestamo = -1;
	    this.fecha_final_prestamo = -1;
	}
	
	/**
	 * Constructor de la clase Prestamo con parametros
	 * @param id_prestamo
	 * @param id_libro
	 * @param titulo
	 * @param autor
	 * @param usuario
	 * @param carnet
	 * @param fecha_inicio_prestamo
	 */

	public PrestamoDAO(int id_prestamo, int id_libro, String titulo, String autor, String usuario, String carnet, int fecha_inicio_prestamo) {
		this.id_prestamo = id_prestamo;
		this.id_libro = id_libro;
	    this.titulo = titulo;
	    this.autor = autor;
	    this.usuario = usuario;
	    this.carnet = carnet;
	    this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	    this.fecha_final_prestamo = this.fecha_inicio_prestamo + 30;
	}
	
	  /**
	   * Observador de id_prestamo
	   * @return Identificador del Prestamo
	   */
	
	public int getId_prestamo() {
		return id_prestamo;
	}
	
	/**
	   * Modificador de id_prestamo
	   * @param id_prestamo
	   */

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	
	/**
	   * Observador de id_libro
	   * @return Identificador del libro
	   */

	public int getId_libro() {
		return id_libro;
	}
	
	/**
	   * Modificador de id_libro
	   * @param id_libro
	   */

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	
	/**
	   * Observador del titulo
	   * @return titulo
	   */

	public String getTitulo() {
		return titulo;
	}
	
	/**
	   * Modificador del titulo
	   * @param titulo
	   */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	   * Observador del autor
	   * @return autor
	   */

	public String getAutor() {
		return autor;
	}
	
	/**
	   * Modificador del autor
	   * @param autor
	   */

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	   * Observador del usuario
	   * @return usuario
	   */

	public String getUsuario() {
		return usuario;
	}
	
	/**
	   * Modificador del usuario
	   * @param usuario
	   */

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	   * Observador del carnet universitario
	   * @return carnet
	   */

	public String getCarnet() {
		return carnet;
	}
	
	/**
	   * Modificador del carnet universitario
	   * @param carnet
	   */

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	/**
	   * Observador de la fecha de inicio del prestamo
	   * @return fecha de inicio del prestamo
	   */

	public int getFecha_inicio_prestamo() {
		return fecha_inicio_prestamo;
	}
	
	/**
	   * Modificador de la fecha de inicio del prestamo
	   * @param fecha_inicio_prestamo
	   */

	public void setFecha_inicio_prestamo(int fecha_inicio_prestamo) {
		this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	}
	
	/**
	   * Observador de la fecha final del prestamo
	   * @return fecha final del prestamo
	   */

	public int getFecha_final_prestamo() {
		return fecha_final_prestamo;
	}
	
	/**
	   * Modificador de la fecha final del prestamo
	   * @param fecha_inicio_prestamo
	   */

	public void setFecha_final_prestamo(int fecha_inicio_prestamo) {
		this.fecha_final_prestamo = fecha_inicio_prestamo+30;
	}
	
	/**
	 * Comprueba si el identificador del prestamo pasado como parametro se encuentra en el fichero de prestamos
	 * @param id
	 * @return comprueba
	 * @throws FileNotFoundException
	 */
	
	public boolean comprobarId(int id) throws FileNotFoundException {
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
	 * Genera el identificador del prestamo siguiente a introducir
	 * @return linea
	 * @throws FileNotFoundException
	 */
	
	public int GenerarId() throws FileNotFoundException {
		File f1 = new File("Prestamos.csv");
		int linea=0;
		if(f1.exists()) {
                Scanner fich;
				fich = new Scanner(f1);
				
                while(fich.hasNextLine()) {
                	fich.nextLine();
                    linea += 1;
                }
                fich.close();
        }
		return linea+1;
	}
	
	/**
	 * Guarda el prestamo introducido mediante parametro en el fichero
	 * @param id_libro
	 * @param titulo
	 * @param autor
	 * @param usuario
	 * @param carnet
	 * @param fecha_inicio_prestamo
	 * @throws FileNotFoundException
	 */
	
	public void anadirPrestamos(int id_libro, String titulo, String autor, String usuario, String carnet, int fecha_inicio_prestamo) throws FileNotFoundException {
		try{
			int id_prestamo=GenerarId();
            new PrestamoDAO(id_prestamo, id_libro, titulo, autor, usuario, carnet, fecha_inicio_prestamo);
            Writer output = new BufferedWriter(new FileWriter("Prestamos.csv",true));
            output.append("\n" + String.valueOf(id_prestamo) + "," + String.valueOf(id_libro) + "," + titulo + "," + autor + "," + usuario + "," + carnet + "," + String.valueOf(fecha_inicio_prestamo) + "," + String.valueOf(fecha_inicio_prestamo+30));
                        
            output.close();
            System.out.println("Prestamo anadido correctamente");
			
        }catch(Exception e){System.out.println("Error: " + e);}
	}
	
	/**
	 * Elimina o marca como borrado al prestamo con id igual al identificador del prestamos pasado como parametro
	 * @param id
	 * @throws FileNotFoundException
	 */
    
    public void eliminarPrestamo(int id) throws FileNotFoundException {
    	if(!comprobarId(id)) {
    		System.out.println("El prestamo con id " + id + " no se encuentra");
    	}else {
	        String linea="";
	    	FileReader fr = null;
	    	BufferedReader br = null;
	        FileWriter fw = null;
	        BufferedWriter bw = null;
	    	ArrayList<String> lineasAcopiar = new ArrayList<String>();
	    	try{
	    		fr = new FileReader("Prestamos.csv");
	            br = new BufferedReader(fr);
	            while(br.ready()){
	                linea = br.readLine();
	                String[] lineaComas = linea.split(",");
	                if(id!=Integer.parseInt(lineaComas[0])) {
	                	lineasAcopiar.add(linea);
		        }else if(id==Integer.parseInt(lineaComas[0])){
	                    lineasAcopiar.add(linea + ",1");
	                }
	            }
	            br.close();
	            //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO
	            fw = new FileWriter("Prestamos.csv");
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
     * Carga el prestamo con id random introducido por parametro
     * @param random
     * @return boolean
     */
    
    public boolean load_prestamo_aleatorio(int random) {

		File f1 = new File("Prestamos.csv");
		System.out.println(random);
		if(f1.exists()) {
			  Scanner fich = null;

			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;
				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  int x = Integer.parseInt(linea[0]);
					  if(x == random && linea.length == 8) {
						  this.setId_prestamo(Integer.parseInt(linea[0]));
						  this.setId_libro(Integer.parseInt(linea[1]));
						  this.setTitulo(linea[2]);
						  this.setAutor(linea[3]);
						  this.setUsuario(linea[4]);
						  this.setCarnet(linea[5]);
						  this.setFecha_inicio_prestamo(Integer.parseInt(linea[6]));
						  this.setFecha_final_prestamo(Integer.parseInt(linea[7]));
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
     * Carga el prestamo en funcion del identificador del prestamo pasado como parametro, en este caso de tipo string
     * @param prestamo
     * @return boolean
     */
    
    public boolean load_prestamo(String titulo, String usuario) {
		File f1 = new File("Prestamos.csv");
		if(f1.exists()) {
		  Scanner fich = null;
		  try {
			  fich = new Scanner(f1);
			  String[] linea = null;

			  while(fich.hasNext()) {
				  linea = fich.nextLine().split(",");
				  if(titulo.equals(linea[2]) && usuario.equals(linea[4]) && linea.length == 8) {
					  this.setId_prestamo(Integer.parseInt(linea[0]));
					  this.setId_libro(Integer.parseInt(linea[1]));
					  this.setTitulo(linea[2]);
					  this.setAutor(linea[3]);
					  this.setUsuario(linea[4]);
					  this.setCarnet(linea[5]);
					  this.setFecha_inicio_prestamo(Integer.parseInt(linea[6]));
					  this.setFecha_final_prestamo(Integer.parseInt(linea[7]));
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
    
    public boolean load_Prestamo(String usuario, int id) {
		File f1 = new File("Prestamos.csv");
		int cont = id;
		if(f1.exists()) {
		  Scanner fich = null;
		  try {
			  fich = new Scanner(f1);
			  String[] linea = null;

			  while(fich.hasNext()) {
				  linea = fich.nextLine().split(",");
				  if(usuario.equals(linea[4])) {
					  cont--;
					  if(cont == 0 && linea.length == 8) {
						  this.setId_prestamo(Integer.parseInt(linea[0]));
						  this.setId_libro(Integer.parseInt(linea[1]));
						  this.setTitulo(linea[2]);
						  this.setAutor(linea[3]);
						  this.setUsuario(linea[4]);
						  this.setCarnet(linea[5]);
						  this.setFecha_inicio_prestamo(Integer.parseInt(linea[6]));
						  this.setFecha_final_prestamo(Integer.parseInt(linea[7]));
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
}
