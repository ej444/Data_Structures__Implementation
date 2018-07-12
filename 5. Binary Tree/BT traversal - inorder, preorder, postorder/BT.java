public class BT
{
	Node root;

	public BT()
	{
		root = null;
	}

	public static class Node
	{
		int key;
		Node left, right;

		public Node(int d)
		{
			key = d;
			left = right = null;
		}
	}

	// Function to print the nodes during In order traversal
	public static void printInorder(Node current)
	{
		if(current == null)
		{
			return;
		}

		printInorder(current.left);
		System.out.printf("%d > ", current.key);
		printInorder(current.right);

	}


	// Function to print the nodes during Pre order traversal
	public static void printPreorder(Node current)
	{
		if(current == null)
		{
			return;
		}

		System.out.printf("%d > ", current.key);

        printPreorder(current.left);
		printPreorder(current.right);

	}

	// Function to print the nodes during Post order traversal
	public static void printPostorder(Node current)
	{
		if(current == null)
		{
			return;
		}

		printPostorder(current.left);
		printPostorder(current.right);
		System.out.printf("%d > ", current.key);

	}
}
