
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coco c =new Coco();
		Fantasma f = new Fantasma();
		Jugador j = new Jugador("SAntiago");
		
		j.Disparar(c);
		j.Disparar(c);
		j.Disparar(c);
		j.AdquirirArma(new ArmaProtones());
		j.Disparar(f);
		j.Disparar(f);
		j.Disparar(f);
		j.Disparar(f);
		//ArmaProtones a1 = new ArmaProtones();
		//Enemigo e1 = new Enemigo();
		//Dragon g1=new Dragon ();
		//Arma arm1 = new Arma ();
		//Alien alien1 = new Alien ();
//		arm1.Disparar(g1);
//		arm1.Disparar(g1);
//		arm1.Disparar(g1);
//		a1.Disparar(g1);
//		a1.Disparar(g1);
//		a1.Disparar(g1);
//		a1.Disparar(g1);
//		a1.Disparar(g1);
		
		
		
	}

}
