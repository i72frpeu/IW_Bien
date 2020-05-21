package trabajo.IW;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import trabajo.DAO.*;

public class ListalibrosBean {
	private List<LibroDAO> listaLibros;
	
	public ListalibrosBean() {
		this.listaLibros = new ArrayList<LibroDAO>();
	}

	public List<LibroDAO> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<LibroDAO> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public void loadLibros() {
		if(listaLibros.size() != 0) {
			
		}else {
			for(int i = 0; i < 2; i++) {
				LibroDAO aux = new LibroDAO();
				aux.load_libro_aleatorio(i+1);
				listaLibros.add(aux);
			}
		}
	}
	
	public void addlibro(LibroDAO aux) {
		listaLibros.add(aux);
	}
	
	public LibroDAO getLibro(int i) {
		return this.listaLibros.get(i);
	}
	
	public int getsize() {
		return listaLibros.size();
	}

}