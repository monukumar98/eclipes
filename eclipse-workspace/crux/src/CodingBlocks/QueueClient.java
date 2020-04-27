package CodingBlocks;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();

//		try {
//			queue.enqueue(10);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			queue.enqueue(20);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("hiiii ");
	}

}
