package bytebank_heredado;

public class Administrador extends Funcionario {

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String Doc, double sueldo) {
		super(Doc, sueldo);
		// TODO Auto-generated constructor stub
	}

	private String clave;
	
	public void setClave(String new_clave) {
		this.clave = new_clave;
	}
	
	public boolean iniciarSesion(String clave_ingresada) {
		return this.clave == clave_ingresada;
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
