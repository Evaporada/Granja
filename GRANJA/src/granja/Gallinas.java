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

	public int getHuevos() {
		return huevos;
	}

	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}

	public int[] getMes() {
		return mes;
	}

	public void setMes(int[] mes) {
		this.mes = mes;
	}

	@Override
	public boolean esRentable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Gallinas [huevos=" + huevos + ", mes=" + Arrays.toString(mes) + "]";
	}

}
