import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo{
	public static void main(String[] args) {
		
		List<Javacomp> list=new ArrayList<Javacomp>();
		list.add(new Javacomp(5,"kk",100));
		list.add(new Javacomp(8,"mm",69));
		Collections.sort(list, new agecomp());
		System.out.println(list);
		
	}
}
