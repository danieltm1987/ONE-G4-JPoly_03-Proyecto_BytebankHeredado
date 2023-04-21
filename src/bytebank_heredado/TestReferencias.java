package bytebank_heredado;

public class TestReferencias {

	public static void main(String[] args) {
		//Polimorfismo
		//Va desde el elemento mas generico en este caso Funcionario
		//hasta el mas especifico osea gerente
		//Por que un gerente es un funcionario
		//Pero No todo Funcionario es un Gerente
		
		Funcionario funcionario = new Gerente(); // pero la referencia del objeto seguira siendo Funcionario
		
		//Funcionario funcionario = new Funcionario();
		funcionario.setNombre("DAniel Torres");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Adriana");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);

	}

}
