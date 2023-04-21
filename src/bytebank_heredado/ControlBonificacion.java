package bytebank_heredado;

public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion()+this.suma;
		System.out.println("Suma :"+this.suma);
		
		return this.suma;
	}
	
	//Polimorfismo con Funcionario ya que Gerente y contador son clases hijas de Funcionario.
	//Los metodos seguiran funcionando ya que Gerente es un Funcionario y Contador es un Funcionario.
	/*
	public double registrarSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion()+this.suma;
		System.out.println("Suma :"+this.suma);
		
		return this.suma;
	}
	
	public double registrarSalario(Contador contador) {
		this.suma = contador.getBonificacion()+this.suma;
		System.out.println("Suma :"+this.suma);
		
		return this.suma;
	}
	*/
}
