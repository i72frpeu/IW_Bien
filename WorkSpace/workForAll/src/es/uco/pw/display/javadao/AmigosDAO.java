package es.uco.pw.display.javadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AmigosDAO {
	
	public AmigosDAO() {}
	
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
	
	public int numberfriends(int id) {
		int i = 0;
		ResultSet status;
		
		try {
			Connection con=getConnection();
			String consulta = "Select * from `amigod` where IDuno = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,id);
			
			status = ps.executeQuery();
			
			while(status.next()) {
				i++;
			}
			
			con.close();
			return i;
			
		} catch(Exception e) {System.out.println(e);}
		
		return i;
	}
	
	public String getFriend(int id, int cont) {
		int i = 0;
		String dev = "";
		ResultSet status;
		
		try {
			Connection con=getConnection();
			String consulta = "Select IDdos from `amigod` where IDuno = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,id);
			
			status = ps.executeQuery();
			
			for(int j = 0; j < cont+1; j++) {
				status.next();
			}
		
			for(int x = 1; x <= status.getMetaData().getColumnCount(); x++) {
				i = status.getInt(x);
			}
		
			consulta = "select userNameR from `usuario` where userID = " + i;
			ps = con.prepareStatement(consulta);
			status = ps.executeQuery();
			while(status.next()) {
				for(int x = 1; x <= status.getMetaData().getColumnCount(); x++) {
					dev = dev + status.getString(x) + " ";
				}
			}
			
			con.close();
			return dev;
			
		} catch(Exception e) {System.out.println(e);}
		
		return dev;
	}
	
	public int getFriendID(int id, int cont) {
		int i = 0;
		ResultSet status;
		
		try {
			Connection con=getConnection();
			String consulta = "Select IDdos from `amigod` where IDuno = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,id);
			
			status = ps.executeQuery();
			
			for(int j = 0; j < cont+1; j++) {
				status.next();
			}
		
			for(int x = 1; x <= status.getMetaData().getColumnCount(); x++) {
				i = status.getInt(x);
			}
			
			con.close();
			return i;
			
		} catch(Exception e) {System.out.println(e);}
		
		return i;
	}
	
	
	
	public String getFriendApellido(int id, int cont) {
		int i = 0;
		String dev = "";
		ResultSet status;
		
		try {
			Connection con=getConnection();
			String consulta = "Select IDdos from `amigod` where IDuno = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,id);
			
			status = ps.executeQuery();
			
			for(int j = 0; j < cont+1; j++) {
				status.next();
			}
		
			for(int x = 1; x <= status.getMetaData().getColumnCount(); x++) {
				i = status.getInt(x);
			}
		
			consulta = "select userSurname from `usuario` where userID = " + i;
			ps = con.prepareStatement(consulta);
			status = ps.executeQuery();
			while(status.next()) {
				for(int x = 1; x <= status.getMetaData().getColumnCount(); x++) {
					dev = dev + status.getString(x) + " ";
				}
			}
			
			con.close();
			return dev;
			
		} catch(Exception e) {System.out.println(e);}
		
		return dev;
	}
	
	public int delete(int useriduno, int useriddos){
		int status=0;
		try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from `amigod` where IDuno = ? and IDdos = ?");
		ps.setInt(1,useriduno);
		ps.setInt(2, useriddos);
		status=ps.executeUpdate(); 
		con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
		}
	

public int save(int userID, int userID2) {
		
		int status = 0;
		
		try {
			Connection con=getConnection();
			String consulta = "INSERT INTO `amigod` VALUES (?, ?)";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,userID);
			ps.setInt(2,userID2);
			
			status = ps.executeUpdate();
			
			con.close();
				
		} catch(Exception e) {System.out.println(e);}
		
		return status;
	}
}
