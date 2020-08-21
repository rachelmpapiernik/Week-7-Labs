/* August 20 Rachel Papiernik
 * This program is designed to remove the bottom half of the elements in the stack
 */

import java.io.*;

class LinkedNode {

	public static void main(String[] args) {

	public int x;
	public LinkedNode next;

	public LinkedNode(int a) {
		x = a;
	}
}

class LinkedStack {
	LinkedNode front;
	int count;

	LinkedStack() {
		front = null;
		count = 0;
	}

	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	int peek() {
		return front.x;
	}

	boolean isEmpty() {
		return front == null;
	}

	int size() {
		return count;
	}

	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	void removeBottomHlf() {

		LinkedNode cur = front;
		int size = count;

		while (size > (count / 2 + 1)) {
			cur = cur.next;
			size--;
		}
		cur.next = null;

	}
}


