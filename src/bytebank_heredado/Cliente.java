package bytebank_heredado;

public class Cliente implements Autenticable {
	private String documento;
	private String telefono;
	private String nombre;
	private String profesion;
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	@Override
	public void setClave(String new_clave) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean iniciarSesion(String clave_ingresada) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean iniciarSesion(String login, String clave_ingresada) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
