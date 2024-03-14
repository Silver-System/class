package csw2;
class course{
	void study() {
		System.out.println("Studying base");
	}
	void publish() {
		System.out.println("Publish base");
	}
}
class javacourse extends course{
	void study() {
		System.out.println("Studying java");
	}
}
class pythoncourse extends course{
	void publish() {
		System.out.println("Publish python");
	}
}

public class Overridingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javacourse o1=new javacourse();
		pythoncourse o2=new pythoncourse();
		course o3=new course();
		o3.study();
		o3.publish();
		o1.study();
		o2.publish();
		

	}

}
