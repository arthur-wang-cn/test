package SSD;

public class Father {
private String name;

public Father() {
	System.out.println("这是父亲的构造器");
}

public Father(String name) {
	super();
	this.name = name;
	System.out.println("这是父亲的有参构造器name");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Father [name=" + name + "]";
}

}
class Son extends Father{
	private int age;

	public Son(int age) {
		super();
		this.age = age;
		System.out.println("这是儿子的构造器age");
	}

	@Override
	public String toString() {
		return "Son [age=" + age + "]";
	}
	
}