import java.io.*;

public class Main extends BT
{
	public static void main(String[] args)
	{
		BT b = new BT();
		b.root = new Node(1);
		b.root.left = new Node(2);
		b.root.right = new Node(3);
		b.root.left.left = new Node(4);
		b.root.left.right = new Node(5);

		System.out.print("\nInorder traversal: ");
		printInorder(b.root);
		// Backspace does not delete the content, it just shifts the cursor to the left and then the content can be cleared by adding spaces
		System.out.print("\b\b" + "  ");

		System.out.print("\nPreorder traversal: ");
		printPreorder(b.root);
  		System.out.print("\b\b" + "  ");

		System.out.print("\nPostorder traversal: ");
		printPostorder(b.root);
		System.out.print("\b\b" + "  ");
	}
}
