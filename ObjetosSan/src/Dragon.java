
public class Dragon extends Enemigo{

	public void RecibirDanio(int danio,int tipo_danio ) {
		if(tipo_danio==1) {
			System.out.println("JAJA lol");
		}else {
		super.RecibirDanio(danio);
		}
		
	}
}
