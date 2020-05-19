package es.uco.pw.display.javadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ComentariosDAO {
	
	public ComentariosDAO() {}
	
	public Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://oraclepr.uco.es:3306/i72cugrj","i72cugrj","workForAll");
		}
		catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public int saveComentario(String texto, int userid, int commentid)
	{	
		int status = 0;
		
		try
		{
			Connection con = getConnection();
			String consulta = "INSERT INTO `coment` VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setString(1, texto);
			ps.setInt(2, userid);
			ps.setInt(3, commentid);
			
			status = ps.executeUpdate();
			
			con.close();
			
		} catch(Exception e) {System.out.println(e);}
		
		return status;
	}
	
	public boolean checkIDComment(int commentID)
	{
		ResultSet status;
		int cont = 0;
		
		try {
			Connection con = getConnection();
			String consulta = "SELECT * from `coment` WHERE commentID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1, commentID);
			
			status = ps.executeQuery();
			
			while(status.next()) {
				cont++;
			}
			
			if(cont == 0) {
				con.close();
				return false;
			}
			
			con.close();
			return true;
			
		}catch(Exception e) {System.out.println(e);}
		
		return false;
	}
	
	// Devuelvo el numero de comentarios que hay en la base de datos
	public int commentIDAssigned()
	{
		Statement stmt = null;
		int cont = 0;
		try
		{	
			Connection con = getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from `coment`");
		
			while(rs.next())
				cont++;
			
			
			if (stmt != null)
				stmt.close(); 
		} catch (Exception e) {System.out.println(e);}
		
		return cont;
	}
	
	// Funcion que calcula el numero de comentarios que ha hecho un usuario
	public int numOfCommentByUser(int id_user)
	{
		int i = 0;
		ResultSet status;
		
		try
		{
			Connection con = getConnection();
			String consulta = "Select * from `coment` where userID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,id_user);
			
			status = ps.executeQuery();
			
			while(status.next())
				i++;
			
			con.close();
			return i;
			
		} catch(Exception e) {System.out.println(e);}
		return i;
	}
	
	public String get(int commentid, String buscar)
	{
		String fila = "";
		try
		{
			Connection con = getConnection();
			String consulta = "select " + buscar + " from `coment` where commentID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1, commentid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				for(int x = 1; x <= rs.getMetaData().getColumnCount(); x++) {
					fila = rs.getString(x);
				}
			}
			
			con.close();
			return fila;
		}catch(Exception e) {System.out.println(e);}
		return fila;
	}
	

	
}

