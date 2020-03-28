package granja;

public abstract class Animales {
	protected String nombre;
	protected String ID;
	protected static int contID;
	protected Fecha fecha;
	
	public Animales() {
		Animales.contID++;
		this.ID = Animales.contID+String.valueOf((char) ((int) (Math.random()*26)+65));
		this.nombre = "Animal";
		this.fecha = new Fecha();
	}

	public Animales(String nombre, String iD, Fecha fecha) {
		this.nombre = nombre;
		ID = iD;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", ID=" + ID + ", fecha=" + fecha + "]";
	}
	
}
