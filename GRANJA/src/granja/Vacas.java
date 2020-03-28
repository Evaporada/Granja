package granja;

public class Vacas extends Animales {
	protected int litros;
	protected float kg;

	public Vacas() {
		this.litros = (int) ((Math.random() * 20) + 30);
		this.kg = (int) ((Math.random() * 80) + 50);
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
	public boolean esRentable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Vacas [litros=" + litros + ", kg=" + kg + "]";
	}

}
