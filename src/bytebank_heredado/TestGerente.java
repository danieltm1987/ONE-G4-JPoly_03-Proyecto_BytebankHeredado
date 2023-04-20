package bytebank_heredado;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(61000);
		gerente.setTipo(1);
		
		System.out.println("Bonificacion del Gerente:"+gerente.getBonificacion());
		
		Gerente cheo = new Gerente();
		cheo.setNombre("Cheo");
		
		System.out.println("El nombre es :"+cheo.getNombre());
		
		gerente.setClave("AluraCursosOnline");
		System.out.println("Iniciar sesion :"+gerente.iniciarSesion("Yo me llamo"));
		System.out.println("Iniciar sesion :"+gerente.iniciarSesion("AluraCursosOnline"));
		
		

	}

}
