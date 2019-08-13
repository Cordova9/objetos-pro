
public class Enemigo {
	int puntosdevida = 3;
	public boolean esta_muerto = false;

	void RecibirDanio(int danio) {
		if (!esta_muerto) {
			puntosdevida -= danio;
			if (puntosdevida <= 0) {
				Morir();
			}else {
				System.out.println("Me diste :" + puntosdevida);
			}
		}else {
			System.out.println("YA ESTOY MUERTO");
		}
	}
	void RecibirDanio(int danio,int tipo_danio) {
		RecibirDanio(danio);
	}

	void Morir() {
		puntosdevida = 0;
		System.out.println("Hay me muero");
		esta_muerto = true;
	}
}
