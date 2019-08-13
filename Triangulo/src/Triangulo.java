
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imprimir();
	}

	public static void Imprimir() {

		int numFilas = 5;

		System.out.println();
		for (int altura = 1; altura <= numFilas; altura++) {
			// Espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (altura ) ; asteriscos++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
