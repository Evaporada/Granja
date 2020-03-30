package granja;

public class Vacas extends Animales {
	protected int litros;
	protected float kg;

	public Vacas() {
		this.litros = (int) ((Math.random() * 600) + 100);
		this.kg = (int) ((Math.random() * 100) + 50);

	}

	public Vacas(String nombre, String iD, Fecha fecha, float peso, int litros2) {
		super(nombre, iD, fecha);
		this.litros=litros2;
		this.kg=peso;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public float getKg() {
		return kg;
	}

	public void setKg(float kg) {
		this.kg = kg;
	}

	@Override
	public String toString() {
		return "Vacas [litros=" + litros + ", kg=" + kg + ", nombre=" + nombre + ", ID=" + ID + ", fecha=" + fecha
				+ "]";
	}

	@Override
	public boolean esRentable() {
		boolean rentable = true;
		if (litros >= 500) {
			rentable = true;
		}
		return rentable;
	}

}