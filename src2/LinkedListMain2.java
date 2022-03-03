
public class LinkedListMain2 {

	public static void main(String[] args) {
		
        /*
		 * PROCEDURE 
		 * ================================== 
		 * 1.creating an object 
		 * 2.adding values to the first place as 56->30->70
		 * 3.Printing the updated linkedList
		 * ==================================
		 */
		
		/*
		 * 1.creating an object
		 */
		LinkedList2 list = new LinkedList2();

		/*
		 * 2.adding values to the first place as 56->30->70
		 */
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);

		/*
		 * 3. Printing the updated linkedList
		 */
		list.printList();
	}

}