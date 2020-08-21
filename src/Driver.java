/* August 20 Rachel Papiernik
 * This program pushews elements into two stacks and pops off each element and displays the result.
 */

public class Driver {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);

		stack.push(1);
		stack.push(7);
		stack.push(3);
		stack.push(4);
		stack.push(9);
		stack.push(2);

		LinkedStack stack1 = new LinkedStack();
		stack1.push(1);
		stack1.push(7);
		stack1.push(3);
		stack1.push(4);
		stack1.push(9);
		stack1.push(2);

		// pop off from ArrayStack and display after removed
		while (stack.size() != 0) {
			System.out.println(stack.pop());
		}
		System.out.println();

		// pop off from LinkedStack and display after removed 
		while (stack1.size() != 0) {
			System.out.println(stack1.pop());
		}
		System.out.println();

	}
}
