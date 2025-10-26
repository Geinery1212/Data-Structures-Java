package list.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.addFirst("Jose");
		list.addFirst("Raul");
		list.addLast("Vere");
		list.addFirst("Mario");

		System.out.println("First: " + list.first());
		System.out.println("Last: " + list.last());
	}

}
