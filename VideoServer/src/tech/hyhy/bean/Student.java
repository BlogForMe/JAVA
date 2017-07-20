package tech.hyhy.bean;

public class Student {
	private int id;
	private String name;
	private int birth;
	private String img;

	public Student(int id, String name, int birth, String img) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + ", img=" + img + "]";
	}

}
