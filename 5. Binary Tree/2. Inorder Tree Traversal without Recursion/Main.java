import java.io.*;
import java.util.*;

public class Main extends BT{

	public static void main(String[] args){

		BT b = new BT();
		b.root = new Node(1);
		b.root.left = new Node(2);
		b.root.right = new Node(3);
		b.root.left.left = new Node(4);
		b.root.left.right = new Node(5);
		b.root.right.right = new Node(6);
		b.root.left.right.left = new Node(7);
		b.root.left.right.right = new Node(8);

		System.out.print("\nInorder traversal: ");
		printInorder(b.root);
		// Backspace does not delete the content, it just shifts the cursor to the left and then the content can be cleared by adding spaces
		System.out.print("\b\b" + "  ");

		System.out.print("\n\nWithout recursion: ");
		Stack<Node> s = new Stack<>();
		Node curr = b.root;

		while(curr != null || !s.isEmpty()){

			// Traverses and fills the stack with left children
			while(curr != null){
				s.push(curr);
				curr = curr.left;
			}

			// Pops and prints the elements
			curr = s.pop();
			System.out.print(curr.key + " > ");
			curr = curr.right;
		}

		System.out.println("\b\b ");
	}
}


/* OUTPUT

Inorder traversal: 4 > 2 > 7 > 5 > 8 > 1 > 3 > 6

Without recursion: 4 > 2 > 7 > 5 > 8 > 1 > 3 > 6

*/