package granja;

public abstract class Animales {
	protected String nombre;
	protected String ID;
	protected static int contID;
	protected Fecha fecha;

	public Animales() {
		Animales.contID++;
		this.ID = Animales.contID + String.valueOf((char) ((int) (Math.random() * 26) + 65));
		this.nombre = getClass().getSimpleName();
		this.fecha = new Fecha();
	}

	public Animales(String nombre, String iD, Fecha fecha) {
		this.nombre = getClass().getSimpleName();
		ID = iD;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public static int getContID() {
		return contID;
	}

	public static void setContID(int contID) {
		Animales.contID = contID;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public abstract boolean esRentable();

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", ID=" + ID + ", fecha=" + fecha + "]";
	}

}