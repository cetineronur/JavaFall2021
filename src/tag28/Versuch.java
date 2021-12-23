package tag28;

public class Versuch {
	int x;
	static int y;
	
	Versuch(int i){
		x+=i;
		y+=i;
	}
	public static void main(String[] args) {
	
		new Versuch(2);
		
		Versuch dnm = new Versuch(3);
		System.out.println(dnm.x+","+dnm.y);

	}

}
