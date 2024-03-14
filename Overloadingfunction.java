package csw2;

public class Overloadingfunction {
	void show(int s) {
		System.out.println("int show"+s);
	}
	void show(double s) {
		System.out.println("Double show");
	}
	void show(String s) {
		System.out.println("String show");
		
	}
	void show(int x,long y) {
		System.out.println("Int float show");
	}
	void show(long y,int x) {
		System.out.println("long int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingfunction o=new Overloadingfunction();
		o.show(10);
       // o.show(10,30);
        o.show(3.45f);
        o.show('z');
	}

}
