package CodingBlocks;

public class ExcptoinClient {
	public static void main(String[] args) throws Exception {
		ExcptionHanddlig E = new ExcptionHanddlig();
		// E.setAge(-10);

		try {

			E.setAge(-10);
			System.out.println("in try block");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("in catch block");

		}
		System.out.println(E.getAge());
		System.out.println("monu");

	}

}
