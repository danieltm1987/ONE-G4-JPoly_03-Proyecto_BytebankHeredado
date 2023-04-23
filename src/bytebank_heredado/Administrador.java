package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	public Administrador(String Doc, double sueldo) {
		super(Doc, sueldo);
		// TODO Auto-generated constructor stub
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public void setClave(String new_clave) {
		this.util.setClave(new_clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave_ingresada) {
		return this.util.iniciarSesion(clave_ingresada);
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario() ;
	}

}
