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

	public static Node addNode(Node root, int d)
	{
		// If the tree is empty, create a new node and assign it the value d
		if(root == null)
		{
			root = new Node(d);
			return root;
		}

		// If the value to be insertes is less than the rootent node value
		if(d < root.key)
		{
			root.left = addNode(root.left, d);
		}

		// If the value to be insertes is more than the rootent node value
		else if(d > root.key)
		{
			root.right = addNode(root.right, d);
		}

		// Other cases
		return root;
	}


	public static void print(Node root)
	{
		inOrderPrintBST(root);
	}

	public static void inOrderPrintBST(Node root)
	{
		if(root != null)
		{
			inOrderPrintBST(root.left);
			System.out.println(root.key);
			inOrderPrintBST(root.right);
		}
	}

	public static void delete(int d)
	{
		root = deleteNode(root, d);
	}

	public static Node deleteNode(Node root, int d)
	{
		if(root == null)
		{
			return root;
		}

		if(root.key < d)
		{
			root.right = deleteNode(root.right, d);
		}
		else if(root.key > d)
		{
			root.left = deleteNode(root.left, d);
		}

		// Node to be deleted found
		else
		{
			// If the node to be deleted has one/no children
			// Left node is present
			if(root.left == null)
			{
				return root.right;
			}

			// Right node is present
			else if(root.right == null)
			{
				return root.left;
			}

			// If the node to be deleted has 2 children, find the value of inorder successor and assign it to
			// rootent node value.
			root.key = findMinValue(root.right);

			// Deleting the inorder successor
			root.right = deleteNode(root.right, root.key);
		}
		return root;
	}

	// Returns the inorder successor (next big value than the rootent node value)
	public static int findMinValue(Node root)
	{
		int minValue = root.key;
		while(root != null)
		{
			minValue = root.key;
			root = root.left;
		}

		return minValue;
	}


	public static void isBST(Node root)
	{
		if(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
		{
			System.out.println("It is a BST.");
			return;
		}

		System.out.println("It is not a BST.");
		return;
	}


	public static boolean checkBST(Node root, int min, int max)
	{
		// An empty tree is a BST
		if(root == null)
		{
			return true;
		}

		if(root.key < min || root.key > max)
		{
			return false;
		}

		// For left subtree, it tightens the upper limit and for right subtree it tightens the lower limit
		return checkBST(root.left, min, root.key - 1) && checkBST(root.right, root.key + 1, max);
	}
}











