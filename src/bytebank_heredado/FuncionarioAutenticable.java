package bytebank_heredado;

public class FuncionarioAutenticable {
	
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

}