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

	public static Node formBalancedBST(int[] arr, int start, int end)
	{
		if(start > end)
		{
			return null;
		}

		int mid = (start + end)/2;
		Node node = new Node(arr[mid]);
		node.left = formBalancedBST(arr, start, mid-1);
		node.right = formBalancedBST(arr, mid+1, end);

		return node;
	}
}