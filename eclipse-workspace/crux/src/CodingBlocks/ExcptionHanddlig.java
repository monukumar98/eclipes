package CodingBlocks;

public class ExcptionHanddlig {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		if (age < 0) {
			throw new Exception("Invalid age.");
		}

		this.age = age;

	}

	
}
