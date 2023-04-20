package bytebank_heredado;

//					Extiende de Funcionario
public class Gerente extends Funcionario  {
	
	private String clave;
	
	public void setClave(String new_clave) {
		this.clave = new_clave;
	}
	
	public boolean iniciarSesion(String clave_ingresada) {
		return this.clave == clave_ingresada;
	}	
	
	public double getBonificacion() {
		return super.getSalario();
	}

}
