package trabajo.IW;


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrestamoBean {
	
	private int id_prestamo;
	private int id_libro;
	private String titulo;
	private String autor;
	private String usuario;
	private int fecha_inicio_prestamo;
	private int fecha_final_prestamo;

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
	
}

