package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double saldo)throws SaldoInsuficienteException {
		double comision =0.2;	
		super.retirar(saldo + comision);
	}
	
	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;		
	}

}
