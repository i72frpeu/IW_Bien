package es.uco.pw.display.javabean;

import java.io.Serializable;

public class AmigosBean implements Serializable{
	private int amigos = 0;
	private String[] arrayamigos = new String[100];
	private int id = -1;

	public int getAmigos() {
		return amigos;
	}

	public void setAmigos(int amigos) {
		this.amigos = amigos;
	}

	public String[] getArrayamigos() {
		return arrayamigos;
	}

	public void setArrayamigos(String[] arrayamigos) {
		this.arrayamigos = arrayamigos;
	}
	
	public void setAmigoArray(String nombre, int i) {
		arrayamigos[i] = nombre;
	}
	
	public String getAmigosArray( int i) {
		return arrayamigos[i];
	}
	
	public int getID(String nombre) {
		for(int i = 0; i < amigos; i++) {
			if(nombre.contentEquals(arrayamigos[i])) {
				return i;
			}
		}
		return -1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
