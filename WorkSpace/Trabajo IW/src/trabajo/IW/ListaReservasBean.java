package trabajo.IW;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import trabajo.DAO.*;

public class ListaReservasBean {
	private List<ReservaDAO> listaReservas;

	public ListaReservasBean() {
		this.listaReservas = new ArrayList<ReservaDAO>();
	}

	public List<ReservaDAO> getListaLibros() {
		return listaReservas;
	}

	public void setListaReservas(List<ReservaDAO> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public void loadReserva() {
		if(listaReservas.size() != 0) {

		}else {
			for(int i = 0; i < 8; i++) {
				ReservaDAO aux = new ReservaDAO();
				aux.loadReserva(i+1);
				if(aux.getTitulo() != null) {
					listaReservas.add(aux);
				}
			}
		}
	}

	public void addReserva(ReservaDAO aux) {
		listaReservas.add(aux);
	}

	public ReservaDAO getReserva(int i) {
		return this.listaReservas.get(i);
	}

	public int getsize() {
		return listaReservas.size();
	}

}
