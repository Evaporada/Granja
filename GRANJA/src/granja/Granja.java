package granja;

public class Granja {
	protected Animales[] animales;

	public Granja() {
		
		animales = new Animales[12];
		for (int i = 2; i < animales.length; i++) {
			if (i < animales.length / 2 +2) {
				animales[i] = new Vacas();
			} else {
				animales[i] = new Gallinas();
			}
		}
	}

	public Granja(int tamaño) {
		animales = new Animales[tamaño];
		for (int i = 2; i < animales.length; i++) {
			
			if (i < animales.length / 2 + 2) {
				animales[i] = new Vacas();
			} else {
				animales[i] = new Gallinas();
				
			}
		}
	}
	
	public Granja(Animales[] animales) {
		this.animales=animales;
	}
	
	public Animales[] getAnimales() {
		return animales;
	}
	
	public void setAnimales(Animales[] animales) {
		this.animales=animales;
	}
	
	public void listarAnimales() {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] != null) {
				System.out.println(animales[i]);
			}
		}
	}
	
	
	
	
	
}
