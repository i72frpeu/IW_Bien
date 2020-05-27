package trabajo.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Clase que permite modificar y establecer conexion con los libros en la base de datos
 */
public class LibroDAO {
	private int id_libro;
	private String Titulo;
	private String Autor;
	private String Materia;
	private String Editorial;
	private int Paginas;
	private int Encuadernamiento;
	private int Reservado;
	
	/**
	 * Observador de id_libro
	 * @return Identificador de Libro
	 */
	public int getId_libro() {
		return id_libro;
	}
	/**
	 * Modificador de id_Libro
	 * @param id_libro
	 */
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	/**
	 * Observador de Titulo
	 * @return Titulo del libro
	 */
	public String getTitulo() {
		return Titulo;
	}
	/**
	 * Modificador de Titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	/**
	 * Observador de Autor
	 * @return Autor de Libro
	 */
	public String getAutor() {
		return Autor;
	}
	/**
	 * Modificador de Autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		Autor = autor;
	}
	/**
	 * Observador de  Editorial
	 * @return Editorial de Libro
	 */
	public String getEditorial() {
		return Editorial;
	}
	/**
	 * Modificador de Editorial
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	/**
	 * Observador de Materia
	 * @return Materia de Libro
	 */
	public String getMateria() {
		return Materia;
	}
	/**
	 * Modificador de Materia
	 * @param materia
	 */
	public void setMateria(String materia) {
		Materia = materia;
	}
	/**
	 * Observador de Paginas
	 * @return Paginas de Libro
	 */
	public int getPaginas() {
		return Paginas;
	}
	/**
	 * Modificador de Paginas
	 * @param paginas
	 */
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	/**
	 * Observador de Encuadernamiento
	 * @return Encuadernamiento de Libro
	 */
	public int getEncuadernamiento() {
		return Encuadernamiento;
	}
	/**
	 * Modificador de Encuadernamiento	
	 * @param encuadernamiento
	 */
	public void setEncuadernamiento(int encuadernamiento) {
		Encuadernamiento = encuadernamiento;
	}
	
	/**
	 * Carga en la web un libro aleatorio para su visualizacion
	 * @param random
	 * @return True si se puede cargar el libro, False si no se puede
	 */
	public boolean load_libro_aleatorio(int random) {

		File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Libros.csv");
		if(f1.exists()) {
			  Scanner fich = null;
			  try {
				  fich = new Scanner(f1);
				  String[] linea = null;
				  while(fich.hasNext()) {
					  linea = fich.nextLine().split(",");
					  int x = Integer.parseInt(linea[0]);
					  if(x == random) {
						  this.setId_libro(Integer.parseInt(linea[0]));
						  this.setTitulo(linea[1]);
						  this.setAutor(linea[2]);
						  this.setMateria(linea[3]);
						  this.setEditorial(linea[4]);
						  this.setPaginas(Integer.parseInt(linea[5]));
						  this.setEncuadernamiento(Integer.parseInt(linea[6]));

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
	 * Carga en la web un libro para su visualizacion
	 * @param Nombre
	 * @return True si se puede cargar el libro, False si no se puede
	 */
	public boolean load_libro(String Nombre) {
		File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Libros.csv");
		if(f1.exists()) {
		  Scanner fich = null;
		  try {
			  fich = new Scanner(f1);
			  String[] linea = null;

			  while(fich.hasNext()) {
				  linea = fich.nextLine().split(",");
				  String nombre = linea[1];
				  if(nombre.equals(Nombre)) {
					  this.setId_libro(Integer.parseInt(linea[0]));
					  this.setTitulo(linea[1]);
					  this.setAutor(linea[2]);
					  this.setMateria(linea[3]);
					  this.setEditorial(linea[4]);
					  this.setPaginas(Integer.parseInt(linea[5]));
					  this.setEncuadernamiento(Integer.parseInt(linea[6]));
					  this.setReservado(Integer.parseInt(linea[7]));
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
	 * Guarda un libro en nuestra base de datos
	 * @param id
	 * @param titulo
	 * @param autor
	 * @param materia
	 * @param editorial
	 * @param paginas
	 * @param encuadernamiento
	 * @param reservado
	 * @return True si se ha podido el libro, False si no se puede
	 * @throws IOException
	 */
	public boolean guardarLibro(int id, String titulo, String autor, String materia, String editorial, int paginas, int encuadernamiento, int reservado) throws IOException{

  	  String data = id + "," + titulo + "," + autor + "," + materia + "," + editorial + "," + paginas + "," + encuadernamiento + "," + reservado;
  	  Writer output = new BufferedWriter(new FileWriter("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Libros.csv",true));
  	  
  	  try{
		  output.append(data + "\n");
		  output.close();
		  return true;
	    }catch(IOException e) {
		  System.out.println(e);
	    }finally{
		  output.close();
	    }
  	return false;
 	}

	/**
	 * Calcula el numero de libros en nuestra base de datos
	 * @return Numero de libros
	 */
	public int numeroLibros() {
		  File f1 = new File("D:\\unaif\\Documents\\Universidad\\3.2\\IW\\Trabajo\\Trabajo\\IW_Bien\\WorkSpace\\Trabajo IW\\WebContent\\Ficheros\\Libros.csv");
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
	/**
	 * Observador de Reservado
	 * @return Reservador de Libro
	 */
	public int getReservado() {
		return Reservado;
	}
	/**
	 * Modificador de Reservado
	 * @param reservado
	 */
	public void setReservado(int reservado) {
		Reservado = reservado;
	}
}
