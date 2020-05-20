package trabajo.IW;


import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class PrestamoBean {
	
	private int id_prestamo;
	private String id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;

	public PrestamoBean(int id_prestamo, String id_libro, String titulo, String autor, String usuario, int fecha_inicio_prestamo) {
		super();
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

	public String getId_libro() {
		return id_libro;
	}

	public void setId_libro(String id_libro) {
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
		File f1 = new File("C:/Users/javy2/Desktop/prestamos.csv");
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
	
	public static void anadirPrestamos(int id_prestamo, String id_libro, String titulo, String autor, String usuario, int fecha_inicio_prestamo) throws FileNotFoundException {
		try{
			if(comprobarId(id_prestamo)) {
                System.out.println("El prestamo que se intenta introducir desde el fichero ya existe");
            }else {
                PrestamoBean aux = new PrestamoBean(id_prestamo, id_libro, titulo, autor, usuario, fecha_inicio_prestamo);
                Writer output = new BufferedWriter(new FileWriter("C:/Users/javy2/Desktop/prestamos.csv",true));
                output.append("\n" + String.valueOf(id_prestamo) + "," + id_libro + "," + titulo + "," + autor + "," + usuario + "," + String.valueOf(fecha_inicio_prestamo) + "," + String.valueOf(fecha_inicio_prestamo+30));
                            
                output.close();
                System.out.println("Prestamo añadido correctamente");
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
	    	Vector lineasAcopiar = new Vector();
	    	try{
	    		fr = new FileReader("C:/Users/javy2/Desktop/prestamos.csv");
	            br = new BufferedReader(fr);
	            while(br.ready()){
	                linea = br.readLine();
	                String[] lineaComas = linea.split(",");
	                if(id!=Integer.parseInt(lineaComas[0]))
	                	lineasAcopiar.add(linea);
	            }
	            br.close();
	            //RECORREMOS EL VECTOR Y GUARDAMOS LA LINEAS EN EL FICHERO
	            fw = new FileWriter("C:/Users/javy2/Desktop/prestamos.csv");
	            bw = new BufferedWriter(fw);
	            for(int l=0;l<lineasAcopiar.size();l++){
	                linea = (String)lineasAcopiar.elementAt(l);
	                bw.write(linea);
	                bw.newLine();
	            }
	            bw.close();
	            System.out.println("La linea con id " + id + " ha sido borrada");
	
	        }catch(Exception e){System.out.println("Error: " + e);}
    	}
    }    
}

