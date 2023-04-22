package bytebank_heredado;

//					Extiende de Funcionario
public class Gerente extends FuncionarioAutenticable  {
	
	private String clave = "12345";
	
	public void setClave(String new_clave) {
		this.clave = new_clave;
	}
	
	public boolean iniciarSesion(String clave_ingresada) {
		return this.clave == clave_ingresada;
	}
	
	public boolean iniciarSesion(String login, String clave_ingresada) {
		return this.clave == clave_ingresada;
	}
	
	// Sobre-escritura de metodos
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde GERENTE");
		return 2000;
	}

}
