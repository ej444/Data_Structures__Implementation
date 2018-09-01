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

	public static void delete(int d)
	{
		root = deleteNode(root, d);
	}

	public static Node deleteNode(Node curr, int d)
	{
		if(curr == null)
		{
			return curr;
		}

		if(curr.key < d)
		{
			curr.right = deleteNode(curr.right, d);
		}
		else if(curr.key > d)
		{
			curr.left = deleteNode(curr.left, d);
		}

		// Node to be deleted found
		else
		{
			// If the node to be deleted has one/no children
			// Left node is present
			if(curr.left == null)
			{
				return curr.right;
			}

			// Right node is present
			else if(curr.right == null)
			{
				return curr.left;
			}

			// If the node to be deleted has 2 children, find the value of inorder successor and assign it to
			// current node value.
			curr.key = findInorderSuccessor(curr.right, curr.key);

			// Deleting the orignal next 
			curr = deleteNode(curr.right, curr.key);
		}
	}
}











