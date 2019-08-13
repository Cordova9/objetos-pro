
public class Alien extends Enemigo{
	public void RecibirDanio ( int danio,int tipo_danio) {
		if(tipo_danio==0) {
			System.out.println("JAJAJA intentalo de nuevo");
		}else {
			super.RecibirDanio(danio);
		}
		
	}

}
