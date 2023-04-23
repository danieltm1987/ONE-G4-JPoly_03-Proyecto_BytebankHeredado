package bytebank_heredado;

public abstract interface Autenticable{
	
	public void setClave(String new_clave);
	
	public boolean iniciarSesion(String clave_ingresada);
	
	public boolean iniciarSesion(String login, String clave_ingresada);

}
