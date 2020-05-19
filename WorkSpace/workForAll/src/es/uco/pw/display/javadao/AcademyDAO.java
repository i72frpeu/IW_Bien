package es.uco.pw.display.javadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcademyDAO {
	
	public AcademyDAO() {}
	
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
	
	public int saveAcademy(int userID, String Study,String University, int day, int month, int year, int day2, int month2, int year2) {
		
		int status = 0;
		String inicio = "" + day + "\\" + month + "\\" + year;
		String fin = "" + day2 + "\\" + month2 + "\\" + year2;
		
		try {
			Connection con=getConnection();
			String consulta = "INSERT INTO `userAcademy` VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(consulta);
			
			ps.setInt(1,userID);
			ps.setString(2,Study);
			ps.setString(3, University);
			ps.setString(4,inicio);
			ps.setString(5, fin);
			
			status = ps.executeUpdate();
			
			con.close();
			
		} catch(Exception e) {System.out.println(e);}
		
		return status;
	}
	
	public boolean checkIDAcademy(int userID) {
		ResultSet status;
		int cont = 0;
		
		try {
			Connection con = getConnection();
			String consulta = "SELECT * from `userAcademy` WHERE userID = ?";
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
		PreparedStatement ps=con.prepareStatement("delete from `userAcademy` where userID = ?");
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
			String consulta = "select " + buscar + " from `userAcademy` where userID = ?";
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
	

	
}

