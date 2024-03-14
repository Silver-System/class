package csw2;
abstract class shape{
	private double s1,s2;
	public shape(double a,double b) {
		s1=a;
		s2=b;
	}
	abstract public double area();
	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}
	
	
}
class rectangle extends shape{

    public rectangle(double a,double b) {
    	super(a,b);
    }
    public double area(){
    	return getS1()*getS2();
    }	
}
class triangle extends shape{
	public triangle (double a,double b) {
		super(a,b);
	}
	public double area() {
		return 0.5*getS1()*getS2();
	}

}

public class Abstratclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape rec=new rectangle(10,20);
		System.out.println("Area of rect= "+rec.area());
		rec=new triangle(8,10);
		System.out.println("Area of triangle: "+rec.area());

	}
	
}
