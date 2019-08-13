
public class Main {

	public static void main(String[] args) {
		
		Noticias n1 = new Noticias("10 muertos","15/08/2019","Sobredosis","Santiago") ;
		Periodico p1 = new Periodico() ;
		p1.AgragarNoticias(n1);
		
		p1.AgragarNoticias(n1);
		p1.AgragarNoticias(n1);
		p1.AgragarNoticias(n1);
		p1.ImprimirPeriodico();

	}

}
