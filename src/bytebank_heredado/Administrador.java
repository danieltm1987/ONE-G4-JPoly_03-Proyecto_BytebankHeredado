package bytebank_heredado;

public class Administrador extends FuncionarioAutenticable {

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String Doc, double sueldo) {
		//super(Doc, sueldo);
		// TODO Auto-generated constructor stub
	}

	private String clave="admin123";
	
	public void setClave(String new_clave) {
		this.clave = new_clave;
	}
	
	public boolean iniciarSesion(String clave_ingresada) {
		return this.clave == "12345";
	}
	
	public boolean iniciarSesion(String login, String clave_ingresada) {
		return this.clave == clave_ingresada;
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
