package granja;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Granja granja = new Granja(12);
		int opcion;
		do {
			System.out.println("Elija una opcion del menu,pulsa 0 para salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				granja.listarAnimales();
				break;
			case 2:
				granja.añadirAnimal(granja.crearAnimalPers());
				break;
			case 3:
				granja.consultarAnimales(new Fecha());
				break;
			default:
				System.out.println("Saliste del menú.");
				break;
			}
		} while (opcion != 0);
	}
}