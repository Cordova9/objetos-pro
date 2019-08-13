import java.util.ArrayList;
import java.util.List;

public class Periodico {

	String nombre = "El Correo";
	String fecha = "12/06/2019";
	List<Noticias> noticias;

	public Periodico() {

		noticias = new ArrayList<Noticias>();
	}

	void ImprimirPeriodico() {
		System.out.println("Diario " + nombre);
		for (Noticias n : noticias) {
			n.Imprimir();
		}
	}

	void AgragarNoticias(Noticias n) {
		noticias.add(n);
	}
}
