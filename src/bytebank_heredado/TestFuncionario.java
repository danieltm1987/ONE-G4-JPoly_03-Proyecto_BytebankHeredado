package bytebank_heredado;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario daniel = new Contador();
		daniel.setDocumento("1047218293");
		daniel.setSalario(6000000.0);		 
		daniel.setNombre("Daniel Alfonso Torres Martinez");
		daniel.setTipo(0);
		
		System.out.println("Nombre :"+daniel.getNombre());
		System.out.println("Cedula :"+daniel.getDocumento());
		System.out.println("Tipó de funcionario :"+daniel.getTipo());
		System.out.println("Salario :"+daniel.getSalario());
		
		System.out.println("Bonificacion :"+daniel.getBonificacion());
		
		
		

	}

}
