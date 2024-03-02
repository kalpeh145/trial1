
public class JJ {
	
	private JJ() {
		
		}
	private static final JJ instances=new JJ();
	public static JJ getInstance() {
		return instances;
		
	}
	public void print() {
		System.out.println("singelton class print method");
	}
	
	

}
