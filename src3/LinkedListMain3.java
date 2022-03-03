public class LinkedListMain3 {

		
	    /*
	     * PROCEDURE
	     * ====================
	     * 1.Creating an object
	     * 2.Printing the Object
	     * 3.creating an head to object
	     * 4.creating new data to push 
	     * 5.printing a Linked List
	     * =====================
	     */

		public static void main(String[] args) {

			/*
			 * 1.Creating an Object
			 */
			LinkedList3 app = new LinkedList3(56, null);

			/*
			 * 2.Printing a object
			 */
			System.out.println(app);

			/*
			 * 3.creating an head to object
			 */
			LinkedList3 head = app;

			/*
			 * 4.creating new data to push
			 */
			app.push(30);
			app.push(70);

			/*
			 * 5.printing a Linked List
			 */
			app.printList();

		}
	}
