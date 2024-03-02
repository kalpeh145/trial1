import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class hellos {
	public static void main(String[] args) {
		
/*		String s="hello";
		for(int i=s.length()-1;i>=0;i--){
		System.out.println(s.charAt(i));
		}
	}
	*/
	
/*	String s1= "hello moto";
	String [] a=s1.split("");
	for(int i=a.length-1;i>=0;i--){
	System.out.println(a[i]+"");
	}
*/
		
/*		String s="kkop",reverse="";
		for(int i=s.length()-1;i>=0;i--){
		reverse=reverse+s.charAt(i);
		}

		if(s.equalsIgnoreCase(reverse)){
		System.out.println("yes");
		}
		else{
			System.out.println("no");
		
		}		

*/
		
/*	int a=0,b=0,c=1;
	for(int i=0;i<=5;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(a+"");
		}
		
		*/
		
	/*	int a=11,count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			
		}
		*/
		
		
	/*	int a[]= {1,5,8};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);		
	*/
	/*	int u=123,rev=0;
		while(u>0) {
			int rem=u%10;
			rev=rev*10+rem;
			u=u/10;
		}
		System.out.println(rev);
		*/
		
/*		int u=121,rev=0,original=u;
		while(u>0) {
			int rem=u%10;
			rev=rev*10+rem;
			u=u/10;
		}
		if(original==rev) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		*/
		
/*		int a=5;
		for(int i=1;i<=5;i++){
		System.out.println(a*i);
		}
		*/
		
/*		int a[]= {1,5,3,7,3};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}
		*/
		
/*		String str="India is my country";
		Map<String,Integer> map=new HashMap();
		String [] word=str.split(" ");
		for(String words:word) {
			if(map.containsKey(words)) 
				map.put(words, map.get(words)+1);
				else 
					map.put(words, 1);
			}
		     System.out.println(map);

			
		}
		
*/			
		List<Integer> list = Arrays.asList(5, 5, 9, 10,25,12);
/*		Integer l=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(l);
		
		list.stream().filter(a->a%2==0).forEach(System.out::println);

		
*///     list.stream().map(n-> n+"").filter(n->n.startsWith("1")).forEach(System.out::println);
	  
/*		Set set=new HashSet();
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
*/	
/*		Integer n=list.stream().max(Integer::compare).get();
		System.out.println(n);
*/
//		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//		list.stream().sorted((a1,a2)-> a2.compareTo(a1)).forEach(System.out::println);
		
/*		List<String> list1 = new ArrayList<String>();
		list1.add("pune");
		list1.add("pune");
		Map<String, Long> map=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
 */     
/*		String s= "kaielkai";
        Map map=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(map);
  */
		
	}			
}
