package bytebank_heredado;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario daniel = new Funcionario("1047218293", 6000000.0);
		daniel.setNombre("Daniel Alfonso Torres Martinez");
		
		System.out.println("Nombre :"+daniel.getNombre());
		System.out.println("Cedula :"+daniel.getDocumento());
		System.out.println("Salario :"+daniel.getSalario());
		
		System.out.println("Bonificacion :"+daniel.getBonificacion());
		
		
		

	}

}