package bytebank_heredado;

public abstract class Cuenta {
	
	protected double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private Cliente titular2 = new Cliente();
	
	private static int total=0;
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	public Cuenta(int agencia, int numero) {
		
		if (agencia <= 0) {
			System.out.println("No se permite cero");
			this.agencia = 1;
			this.numero = numero;
			
		} else {
			this.agencia = agencia;
			this.numero = numero;
		}
		
		total++;
		
		System.out.println("Aqui se crea una nueva Cuenta !!!"
							+ "\nAgencia :"+this.agencia
							+"\nContador Cuentas Creadas :"+total);		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo(){
		return this.saldo; 
	}
	
	public int getAgencia() {
		return agencia;
	}	
	
	//Se quite el setAgencia ya que se implementa en el constructor
	/*
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("El valor de la agencia debe ser mayor a cero");
		}
		
	}	*/
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular2() {
		return titular2;
	}
	
	public void setTitular2(Cliente titular2) {
		this.titular2 = titular2;
	}
	
	
	public abstract void depositar(double saldo);
	
	/*
	 * Se vuelve el metodo Abstracto
	 * 
	public void depositar(double saldo){
		this.saldo += saldo;	
	}
	 * 
	 */
	

	public boolean retirar(double saldo) {
		
		System.out.println("Retiro por "+saldo+" en proceso...");
		
		if(this.saldo >= saldo) {
			this.saldo -= saldo;
			System.out.println("valor retirado :"+saldo);
			return true;
		}else {
			System.out.println("Fondos Insuficientes");
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta destino) {
		System.out.println("Transferencia por "+valor+" en proceso...");
		if(this.saldo >= valor) {
			this.retirar(valor);
			destino.depositar(valor);
			
			return true;
		}		
		
		return false; 
	}
	
}