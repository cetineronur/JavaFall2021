package tag27_Constructor_ConstructorCall;

public class HesapMakinesi {
	
	private int a;
	private int b;

	HesapMakinesi(int a, int b){
		
		this.a=a;
		this.b=b;
	}

	public int toplama (int a, int b) {
		return this.a+this.b;
		
	}
	public int cikarma (int a, int b) {
		return this.a-this.b;
		
	}
	public int carpma (int a, int b) {
		return this.a*this.b;
		
	}
	public int bolme (int a, int b) {
		return this.a/this.b;
		
	}
	public void toString(int a, int b) {
	
		System.out.println("Toplam : "+toplama(a, b)+"\nCikarma: "+cikarma(a, b)+"\nCArpma : "+carpma(a, b)+"\nBolme  : "+bolme(a, b));

	}
}
