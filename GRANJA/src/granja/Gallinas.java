package granja;

import java.util.Arrays;

public class Gallinas extends Animales {
	protected int huevos;
	protected int mes[];

	public Gallinas() {
		
	}

	public Gallinas(int[] mes) {
		this.huevos = (int) (Math.random() * 5 + 7);
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Gallinas [huevos=" + huevos + ", mes=" + Arrays.toString(mes) + "]";
	}

}
