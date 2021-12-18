package tag42_AbstractClasse;

public class Ustabasi extends Isci{
	
	public void statu () {
		System.out.println("Bu classdaki tum personel ustabasidir. imza ustabasi");
	}
	
	public void mass() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. imza ustabasi");
	}
	
	public void mesai () {
		System.out.println("Ustabasi ariza basinda ariza cozulunceye kadar calisir. imza: ustabasi");
	}

	public static void main(String[] args) {
		Ustabasi ust = new Ustabasi();
		ust.statu();
		ust.mass();
		ust.mesai();

	}

}
