package granja;

import java.util.Arrays;

public class Gallinas extends Animales {
	protected int[] huevos;

	public Gallinas() {
		super();
		huevos = huevosAle();

	}

	public Gallinas(int[] huevos) {
		super();
		this.huevos = huevos;
	}
	
	public Gallinas(String nombre, String iD, Fecha fecha, int[] huevos2) {
		super(nombre, iD, fecha);
		this.huevos=huevos2;
	}

	public int[] huevosAle() {
		int[] huevos = new int[30];
		for (int i = 0; i < huevos.length; i++) {
			huevos[i] = (int) (Math.random() * 5 + 7);
		}
		return huevos;
	}

	public int[] getHuevos() {
		return huevos;
	}

	public void setHuevos(int[] huevos) {
		this.huevos = huevos;
	}

	

	@Override
	public String toString() {
		return "Gallinas [huevos diarios=" + Arrays.toString(huevos) + ", nombre=" + nombre + ", ID=" + ID + ", fecha="
				+ fecha + "]";
	}

	@Override
	public boolean esRentable() {
		boolean rentable = false;
		for (int i = 0; i < huevos.length - 1; i++) {
			int total = huevos[i] + huevos[i + 1];
			if ((total / 30) >= 3) {
				rentable = true;
			}
		}
		return rentable;
	}

}