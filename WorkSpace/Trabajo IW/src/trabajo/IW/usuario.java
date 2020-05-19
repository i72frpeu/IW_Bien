package trabajo.IW;

public class Usuario {

}
 java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;

public class Usuario {


  public static final String SEPARATOR=",";
  public static final String QUOTE="\"";

  private int id;
  private int tipo; //0 = Admin, 1 = Alumno, 2 = Profesor
  private String nombre;
  private String apellido1;
  private String apellido2;
	private String usuario;
  private String password;
	private String email;
  private String carnet_universidad;

	public Usuario(){
		this.id = -1;
    this.tipo = -1;
    this.nombre = null;
    this.apellido1 = null;
    this.apellido2 = null;
    this.usuario = null;
    this.password = null;
    this.email = null;
    this.carnet_universidad = null;
	}

  public Usuario(int id, int tipo, String nombre, String apellido1, String apellido2, String usuario, String password, String email, String carnet_universidad){
		this.id = id;
    this.tipo = tipo;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.usuario = usuario;
    this.password = password;
    this.email = email;
    this.carnet_universidad = carnet_universidad;
	}

  public int getID(){
		return id;
	}

  public int getTipo(){
		return tipo;
	}

	public String getNombre(){
		return nombre;
	}

  public String getApellido1(){
    return apellido1;
  }

  public String getApellido2(){
		return apellido2;
	}

  public String getUsuario(){
		return usuario;
	}

  public String getPassword(){
		return password;
	}

  public String getEmail(){
		return email;
	}

  public String getCarnet(){
		return carnet_universidad
	}

  public void setID(int id){
    this.id = id;
  }

  public void setTipo(int tipo){
    this.tipo = tipo;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setApellido1(String apellido1){
    this.apellido1 = apellido1;
  }

  public void setApellido2(String apellido2){
    this.apellido2 = apellido2;
  }

  public void setUsuario(String usuario){
    this.usuario = usuario;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setCarnet(String carnet_universidad){
    this.carnet_universidad = carnet_universidad;
  }

  public Boolean iniciarSesion(email, password){
    BufferedReader br = null;

    try {

      br = new BufferedReader(new FileReader("C:/Users/ricar/Desktop/demo.csv"));
	    String line = br.readLine();
      /*
      String user = email;
      String pass = password;
      */
	    while (null!=line) {
	       String [] fields = line.split(SEPARATOR);
         var x = fields[0].toString();
	       var y = fields[1].toString();

         if (email.equals(x) && password.equals(y)) {
            return true;
	       }

	       line = br.readLine();
	    }

	   }catch (Exception e) {

	      } finally {
	         if (null!=br) {
	            br.close();
	         }
	    }

    return false;
}
