package list.circularylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularlyLinkedList<String> list = new CircularlyLinkedList<>();

		list.addFirst("A");
		list.addFirst("B");
		list.addFirst("C");
		list.addFirst("D");
//		list.addLast("E");
		
		/*
		 * 
		 * 
		 * 
		 * */
		
		System.out.println(list.first());
		System.out.println(list.last());
		
		list.rotate(); // moves head to the tail
		System.out.println(list.first()); // now A is the head
		System.out.println(list.last());  // now B is the tail
	}

}
