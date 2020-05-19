package es.uco.pw.display.javadao;

import java.sql.*;

public class IdiomDAO {
	
	public IdiomDAO() {}
	
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
	
	public int saveIdiom(int userID, String Idiom,int levelread, int levelspeak, int levelwrite, int levelEurope) {
		
		int status = 0;
		
		try {
			Connection con=getConnection();
			String consulta = "INSERT INTO `userIdioms` VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,userID);
			ps.setString(2,Idiom);
			ps.setInt(3, levelread);
			ps.setInt(4, levelspeak);
			ps.setInt(5, levelwrite);
			ps.setInt(6, levelEurope);
			
			status = ps.executeUpdate();
			
			con.close();
				
		} catch(Exception e) {System.out.println(e);}
		
		return status;
	}
	
	public boolean checkIDIdiom(int userID) {
		ResultSet status;
		int cont = 0;
		
		try {
			Connection con = getConnection();
			String consulta = "SELECT * from `userIdioms` WHERE userID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1, userID);
			
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
	
	public int delete(int userid){
		int status=0;
		try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from `userIdioms` where userID = ?");
		ps.setInt(1,userid);
		status=ps.executeUpdate();
		con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
		}
	
	public String get(int userid, String buscar) {
		String fila = "";
		try {
			Connection con=getConnection();
			String consulta = "select " + buscar + " from `userIdioms` where userID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			ps.setInt(1, userid);
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
	
	public String getInt(int userid, String buscar) {
		int fila = 0;
		String ret ="";
		try {
			Connection con=getConnection();
			String consulta = "select " + buscar + " from `userIdioms` where userID = ?";
			PreparedStatement ps = con.prepareStatement(consulta);
			ps.setInt(1, userid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				for(int x = 1; x <= rs.getMetaData().getColumnCount(); x++) {
					fila = rs.getInt(x);
					if(buscar.contentEquals("levelEurope") == false) {
						switch (fila) {
						case 1:
							ret = "Nativo";
						break;
						case 2:
							ret = "Muy Alto";
						break;
						case 3:
							ret = "Alto";
						break;
						case 4:
							ret = "Medio";
						break;
						case 5:
							ret = "Aceptable";
						break;
						case 6:
							ret = "Bajo";
						break;
						case 7:
							ret = "Muy Bajo";
						break;
						}
					}else {
						switch (fila) {
						case 1:
							ret = "C1";
						break;
						case 2:
							ret = "C2";
						break;
						case 3:
							ret = "B1";
						break;
						case 4:
							ret = "B2";
						break;
						case 5:
							ret = "A1";
						break;
						case 6:
							ret = "A2";
						break;
						}
					}
				}
			}
			con.close();
			return ret;
		}catch(Exception e) {System.out.println(e);}
		return ret;
	}
	
}
