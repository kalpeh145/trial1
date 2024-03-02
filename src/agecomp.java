import java.util.Comparator;

public class agecomp implements Comparator<Javacomp>{

	@Override
	public int compare(Javacomp o1, Javacomp o2) {
		
		return (o1.getAge()-o2.getAge());
	}

}
