
package trabajo.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class LibroDAO {
	private int id_libro;
	private String Titulo;
	private String Autor;
	private String Materia;
	private String Editorial;
	private int Paginas;
	private int Encuadernamiento;
	private int Reservado;
	
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	public String getMateria() {
		return Materia;
	}
	public void setMateria(String materia) {
		Materia = materia;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	public int getEncuadernamiento() {
		return Encuadernamiento;
	}
	public void setEncuadernamiento(int encuadernamiento) {
		Encuadernamiento = encuadernamiento;
	}

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
	public int getReservado() {
		return Reservado;
	}
	public void setReservado(int reservado) {
		Reservado = reservado;
	}
}