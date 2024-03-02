
public class Javacomp{
	private int id;
	private String name;
	private int age;

	public Javacomp(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.age = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Java8 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
