package info.linked.list;

import java.util.Scanner;

public class Solution {

	public static Node insert(Node head, int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node headNode = head;
			while (head.next != null) {
				head = head.next;
			}

			head.next = newNode;
			head = headNode;
		}

		return head;

	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}
