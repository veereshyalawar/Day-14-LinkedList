/*
 * Steps
 * ===============================
 * 1.creating variables for linklist
 * 2.creating contstructor
 * 3.to strings to print the linklist
 * ================================
 */

public class LinkedList {
	/*
	 * 1.creating variables for linklist
	 */
	public int a;
	public int b;
	public int c;
	public LinkedList next;

	/*
	 * 2.creating contstructor
	 */
	public LinkedList(int a, int b, int c, LinkedList next) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.next = next;
	}

	/*
	 * 3.to strings to print the linkedlist
	 */
	public String toString() {
		return a + "->" + b + "->" + c;

	}
}