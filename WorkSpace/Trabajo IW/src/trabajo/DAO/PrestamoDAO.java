package trabajo.DAO;


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PrestamoDAO {
	
	private int id_prestamo;
	private int id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;
	
	public PrestamoDAO() {
		this.id_prestamo = -1;
		this.id_libro = -1;
	    this.titulo = null;
	    this.autor = null;
	    this.usuario = null;
	    this.fecha_inicio_prestamo = -1;
	    this.fecha_final_prestamo = -1;
	}

	public PrestamoDAO(int id_prestamo, int id_libro, String titulo, String autor, String usuario, int fecha_inicio_prestamo) {
		this.id_prestamo = id_prestamo;
		this.id_libro = id_libro;
	    this.titulo = titulo;
	    this.autor = autor;
	    this.usuario = usuario;
	    this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	    this.fecha_final_prestamo = this.fecha_inicio_prestamo + 30;
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getFecha_inicio_prestamo() {
		return fecha_inicio_prestamo;
	}

	public void setFecha_inicio_prestamo(int fecha_inicio_prestamo) {
		this.fecha_inicio_prestamo = fecha_inicio_prestamo;
	}

	public int getFecha_final_prestamo() {
		return fecha_final_prestamo;
	}

	public void setFecha_final_prestamo(int fecha_inicio_prestamo) {
		this.fecha_final_prestamo = fecha_inicio_prestamo+30;
	}
	
	public static boolean comprobarId(int id) throws FileNotFoundException {
		File f1 = new File("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv");
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
	
	public static void anadirPrestamos(int id_prestamo, int id_libro, String titulo, String autor, String usuario, int fecha_inicio_prestamo) throws FileNotFoundException {
		try{
			if(comprobarId(id_prestamo)) {
                System.out.println("El prestamo que se intenta introducir desde el fichero ya existe");
            }else {
                new PrestamoDAO(id_prestamo, id_libro, titulo, autor, usuario, fecha_inicio_prestamo);
                Writer output = new BufferedWriter(new FileWriter("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv",true));
                output.append("\n" + String.valueOf(id_prestamo) + "," + String.valueOf(id_libro) + "," + titulo + "," + autor + "," + usuario + "," + String.valueOf(fecha_inicio_prestamo) + "," + String.valueOf(fecha_inicio_prestamo+30));
                            
                output.close();
                System.out.println("Prestamo anadido correctamente");
			}
        }catch(Exception e){System.out.println("Error: " + e);}
	}
    
    public static void eliminarPrestamo(int id) throws FileNotFoundException {
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
	    		fr = new FileReader("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv");
	            br = new BufferedReader(fr);
	            while(br.ready()){
	                linea = br.readLine();
	                String[] lineaComas = linea.split(",");
	                if(id!=Integer.parseInt(lineaComas[0]))
	                	lineasAcopiar.add(linea);
	            }
	            br.close();
	            //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO
	            fw = new FileWriter("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv");
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
    
    public boolean load_prestamo_aleatorio(int random) {

		File f1 = new File("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv");
		System.out.println(random);
		if(f1.exists()) {
			  Scanner fich = null;

			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;
				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  int x = Integer.parseInt(linea[0]);
					  if(x == random) {
						  this.setId_prestamo(Integer.parseInt(linea[0]));
						  this.setId_libro(Integer.parseInt(linea[1]));
						  this.setTitulo(linea[2]);
						  this.setAutor(linea[3]);
						  this.setUsuario(linea[4]);
						  this.setFecha_inicio_prestamo(Integer.parseInt(linea[5]));
						  this.setFecha_final_prestamo(Integer.parseInt(linea[6]));
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
    
    public boolean load_prestamo(int prestamo) {
		File f1 = new File("D:\\\\unaif\\\\Documents\\\\Universidad\\\\3.2\\\\IW\\\\Trabajo\\\\Trabajo\\\\IW_Bien\\\\WorkSpace\\\\Trabajo IW\\\\WebContent\\\\Ficheros\\\\Prestamos.csv");
		if(f1.exists()) {
		  Scanner fich = null;
		  try {
			  fich = new Scanner(f1);
			  String[] linea = null;

			  while(fich.hasNext()) {
				  linea = fich.nextLine().split(",");
				  if(prestamo == Integer.parseInt(linea[0])) {
					  this.setId_prestamo(Integer.parseInt(linea[0]));
					  this.setId_libro(Integer.parseInt(linea[1]));
					  this.setTitulo(linea[2]);
					  this.setAutor(linea[3]);
					  this.setUsuario(linea[4]);
					  this.setFecha_inicio_prestamo(Integer.parseInt(linea[5]));
					  this.setFecha_final_prestamo(Integer.parseInt(linea[6]));
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
}