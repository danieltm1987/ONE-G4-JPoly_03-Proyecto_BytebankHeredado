package bytebank_heredado;

public class Funcionario {
	
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario( String Doc, double sueldo) {
		this.documento = Doc;
		this.salario = sueldo;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getBonificacion() {
		//Si tipo es igual a 1 --> es gerente
		//Si tipo es igual a 0 --> es funcionario
		if (tipo ==0) {
			return this.salario * 0.1;			
		} else if (tipo == 1) {
			return this.salario;
		}else {
			return 0;
		}
		
	}

}
