public class BST
{
	static Node root;
	public BST()
	{
		root = null;
	}

	public static class Node
	{
		int key;
		Node left, right;

		public Node(int d)
		{
			left = right = null;
			key = d;
		}
	}

	public static void insert(int d)
	{
		root = addNode(root, d);
	}

	public static Node addNode(Node curr, int d)
	{
		// If the tree is empty, create a new node and assign it the value d
		if(curr == null)
		{
			curr = new Node(d);
			return curr;
		}

		// If the value to be insertes is less than the current node value
		if(d < curr.key)
		{
			curr.left = addNode(curr.left, d);
		}

		// If the value to be insertes is more than the current node value
		if(d > curr.key)
		{
			curr.right = addNode(curr.right, d);
		}

		// Other cases
		return curr;
	}

	public static void inOrderPrintBST(Node curr)
	{
		if(curr != null)
		{
			inOrderPrintBST(curr.left);
			System.out.println(curr.key);
			inOrderPrintBST(curr.right);
		}
	}
}