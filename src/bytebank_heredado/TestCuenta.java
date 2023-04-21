package bytebank_heredado;

public class TestCuenta {

	public TestCuenta() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CuentaAhorro cuentaAhorro = new CuentaAhorro(0, 0);
		CuentaCorriente cuentaCorriente = new CuentaCorriente(0, 0);
		
		cuentaCorriente.depositar(2000);
		System.out.println("\nCta. Corriente: "+cuentaCorriente.getSaldo());
		cuentaCorriente.transferir(1000, cuentaAhorro);
		
		System.out.println("\nCta. Corriente: "+cuentaCorriente.getSaldo());
		System.out.println("\nCta. Ahorros: "+cuentaAhorro.getSaldo());

	}

}
