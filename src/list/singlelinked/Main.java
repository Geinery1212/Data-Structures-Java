package list.singlelinked;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		size( ): Returns the number of elements in the list.
//		isEmpty( ): Returns true if the list is empty, and false otherwise.
//		first( ): Returns (but does not remove) the first element in the list.
//		last( ): Returns (but does not remove) the last element in the list.
//		addFirst(e): Adds a new element to the front of the list.
//		addLast(e): Adds a new element to the end of the list.
//		removeFirst( ): Removes and returns the first element of the list.

		SinglyLinkedList<String> list = new SinglyLinkedList<>();

		list.addFirst("Hi");
		list.addFirst("Hello");
		list.addFirst("How are you");

		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
	}

}
