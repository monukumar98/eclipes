package CodingBlocks;

public class Pclient {

	public static void main(String[] args) {

		System.out.println("hi");

		Person p = new Person();

		try {
			System.out.println("hi try");
			p.setAge(-10);
			System.out.println("bye try");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("in catch");
			return;
		} finally {
			System.out.println("in finally");
		}

		System.out.println("bye");
	}

}
