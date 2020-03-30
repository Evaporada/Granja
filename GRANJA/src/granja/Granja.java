package granja;

import java.util.Arrays;
import java.util.Scanner;

public class Granja {
	protected Animales[] animales;

	public Granja() {

		animales = new Animales[12];
		for (int i = 2; i < animales.length; i++) {
			if (i < animales.length / 2 + 2) {
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
		this.animales = animales;
	}

	public Animales[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animales[] animales) {
		this.animales = animales;
	}

	public void listarAnimales() {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] != null) {
				System.out.println(animales[i]);
			}
		}
	}

	public Animales crearAnimalPers() {
		Animales animal = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Vaca o Gallina?");
		String anim = sc.nextLine();
		if (anim.equalsIgnoreCase("VACA") || anim.equalsIgnoreCase("GALLINA")) {
			System.out.println("Introduce Nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduce ID");
			String id = sc.nextLine();
			System.out.println("Introduce fecha de nacimineto: dia, mes y año.");
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			int año = sc.nextInt();
			if (anim.equalsIgnoreCase("VACA")) {
				System.out.println("¿Cuantos kg pesa?");
				float peso = sc.nextFloat();
				System.out.println("¿Cuantos litros de leche produce al mes?");
				int litros = sc.nextInt();
				animal = new Vacas(nombre, id, new Fecha(dia, mes, año), peso, litros);
			} else {
				System.out.println("Cuantos huevos ha puesto la gallina a lo largo del mes?");
				int huevos[] = new int[30];
				for (int i = 0; i < huevos.length; i++) {
					System.out.println("Introduce huevos del dia: "+ i+1);
					huevos[i]=sc.nextInt();
					
				}
				animal = new Gallinas(nombre, id, new Fecha(dia, mes, año), huevos);
			}

		}
		return animal;
	}

	public void añadirAnimal(Animales animal) {
		boolean añadido = false;
		for (int i = 0; i < animales.length && añadido == false; i++) {
			if (animales[i] == null) {
				animales[i] = animal;
				añadido = true;
			}
		}
		if (añadido) {
			System.out.println("El animal ha sido añadido en la base de datos. Revisalo:");
			
		} else {
			System.out.println("No hay sitio en la granja");
		}
	}

	public void consultarAnimales(Fecha añicos) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < animales.length; i++) {
		//	if (animales[i] != null && animales[i].fecha.año.equals(añicos)) {
				System.out.println(animales[i]);
			}
		}
	

	@Override
	public String toString() {
		return "Granja [animales=" + Arrays.toString(animales) + "]";
	}

}