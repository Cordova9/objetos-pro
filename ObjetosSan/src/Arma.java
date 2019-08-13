
public class Arma {
	public int municiones = 10;
	public int danio = 2;
	public int tipo_danio = 0; // 0=da�o fisico; 1 = da�o magico
	String sonido_disparo = "Pum";

	public void Disparar() {
		System.out.println(sonido_disparo);
		municiones--;
	}

	public void Disparar(Enemigo e) {
		// e.puntosdevida-=danio;
		if (municiones > 0) {
			System.out.println(sonido_disparo);
			municiones--;
			System.out.println("Te quedan: "+municiones);
			e.RecibirDanio(danio, tipo_danio);
		} else {
			System.out.println("YA NO TIENES MUNICIONES");
		}
	}
}
