
public class Noticias {
	String titular;
	String fecha;
	String cuerpo;
	String escritor;

	public Noticias(String titular,String fecha, String cuerpo, String escritor) {
		this.titular = titular;
		this.fecha=fecha;
		this.cuerpo = cuerpo;
		this.escritor = escritor;
	}

	public Noticias() {
		this.titular = "titular";
		this.fecha="fecha";
		this.cuerpo = "cuerpo";
		this.escritor = "escritor";
	}

	public void Imprimir() {
		System.out.println(">>>>" + titular + "<<<<");
		System.out.println(fecha);
		System.out.println("-" + cuerpo + "-");
		System.out.println("-" + escritor + "-");

	}

}
