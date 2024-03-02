package Java8;

public class Singelton {

	private Singelton() {
		
	}
	
	//## Get eager initialization  ##

	/*private static final Singelton instances = new Singelton();

	public static Singelton getInstance() {
		return instances;
		

	}
    */
	
	
	// ## Get lazy initialization ##
	
	private static Singelton instance;
	
	public static Singelton getInstance() {
		if(instance==null) {
			synchronized (Singelton.class) {
			if(instance==null) {
				instance=new Singelton();
			}
			}
		}
		return instance;
		
	}
	
	public void print() {
		System.out.println("singelton class print method");
		System.out.println("changes done");
		System.out.println("please see the changes1");
	}

}
