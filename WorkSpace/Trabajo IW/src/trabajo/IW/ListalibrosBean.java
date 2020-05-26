package trabajo.IW;

import java.util.ArrayList;
import java.util.List;

import trabajo.DAO.LibroDAO;

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
			for(int i = 0; i < 8; i++) {
				LibroDAO aux = new LibroDAO();
				aux.load_libro_aleatorio(i+1);
				if(aux.getAutor() != null) {
					listaLibros.add(aux);
				}
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