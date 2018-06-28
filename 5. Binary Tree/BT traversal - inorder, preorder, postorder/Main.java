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

		printInorder(b.root);
		printPreorder(b.root);
		printPostorder(b.root);
	}
}
