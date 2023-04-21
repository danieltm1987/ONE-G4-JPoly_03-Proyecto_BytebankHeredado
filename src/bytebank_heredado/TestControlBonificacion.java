package bytebank_heredado;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario daniel = new Funcionario();
		daniel.setSalario(2000);
		
		Gerente adriana = new Gerente();
		adriana.setSalario(10000);
		
		Contador delfy = new Contador();
		delfy.setSalario(5000);
		
		ControlBonificacion controlB = new ControlBonificacion();
		
		controlB.registrarSalario(daniel);
		controlB.registrarSalario(adriana);
		controlB.registrarSalario(delfy);
		
		 

	}

}
