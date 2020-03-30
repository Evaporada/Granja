package granja;

public class Fecha {
	protected int dia;
	protected int mes;
	protected int año;

	public Fecha() {
		dia = (int) ((Math.random() * 30) + 1);
		mes = (int) ((Math.random() * 12) + 1);
		año = (int) ((Math.random() * 31) + 1990);
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	public String convertidorFormato() {
		return String.format("%02d/%02d/%02d", dia, mes, año);
	}
}
