
public class Main {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Zero", 0);
		queue.add("One", 12);
		queue.add("Three", 35);
		queue.add("Two", 23);
		System.out.println(queue.mystery(2));
	}

}
