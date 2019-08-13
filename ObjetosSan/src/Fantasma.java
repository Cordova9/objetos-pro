
public class Fantasma extends Enemigo {

	void RecibirDanio(int danio, int tipo_danio) {
		if (tipo_danio == 0) {
			System.out.println("JA lo esquive");
		} else {
			super.RecibirDanio(danio);
		}

	}
}
