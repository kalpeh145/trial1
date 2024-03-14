package singel;

public class pattern {
	public static void main(String[] args) {
		Integer a=5,count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("No");
		}
	}
}