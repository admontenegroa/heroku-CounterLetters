package Models;


public class Usuario {
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean validatePassword() {
		return this.getClave().equals("MCICLeones");
	}

	public Usuario(String clave) {
		super();
		this.clave = clave;
	}
	
	

}
