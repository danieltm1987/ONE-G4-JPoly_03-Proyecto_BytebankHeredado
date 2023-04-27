package bytebank_heredado;

public class SaldoInsuficienteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4594595074745595772L;

	public SaldoInsuficienteException(String mensage) {
		super(mensage);		
	}
	
	public SaldoInsuficienteException() {
		super();
	}

}
