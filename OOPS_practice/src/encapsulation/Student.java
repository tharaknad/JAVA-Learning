package encapsulation;

public class Student {

	private int id = 11;
	private String name = "Thor";
	private String dept = "CSE";

	public int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	void setDept(String dept) {
		this.dept = dept;
	}

}
