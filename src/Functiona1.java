@FunctionalInterface
interface a {
	void show(int i,int j);

}

public class Functiona1 {
	public static void main(String[] args) {
		a A=(i,j)->System.out.println("done "+ i+j);
		A.show(10, 15);;
	}
}


interface sim {
	void call();
	void sms();
	default void videocall() {
		System.out.println("default method implemented");
	}
}

class Idea implements sim{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class bsnl implements sim{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		sim s= new bsnl();
		s.videocall();
		
		
		
	}
	
}









