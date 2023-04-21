package bytebank_heredado;

public abstract class Funcionario {
	
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
	
	public void setDocumento (String nuevodoc) {
		this.documento = nuevodoc;
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
	
	//	Sobre-escritura de metodos
	// metodo abstracto
	public abstract double getBonificacion();

}
