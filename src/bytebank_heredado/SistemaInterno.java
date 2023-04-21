package bytebank_heredado;

public class SistemaInterno {
	
	private String clave = "12345";

	public boolean autentica(Gerente gerente) {		
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);		
		
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso !!!");
			return true;
		} else {
			System.out.println("Error en Login");
			return false;
		}		
	}
	
	public boolean autentica(Administrador administrador) {		
		boolean puedeIniciarSesion = administrador.iniciarSesion(clave);		
		
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso !!!");
			return true;
		} else {
			System.out.println("Error en Login");
			return false;
		}		
	}

}
