public class BST
{
	Node root;
	static class Node
	{
		int key;
		Node left, right;

		Node(int d)
		{
			key = d;
			left = right = null;
		}
	}

  public static void findLCA(Node root, int n1, int n2)
  {
  	System.out.println("The LCA is " + LCA(root, Math.min(n1,n2), Math.max(n1,n2)));
  }

	public static int LCA(Node root, int n1, int n2)
	{
		if(root.key > n2 && root.left != null)
		{
			return LCA(root.left, n1, n2);
		}

		else if(root.key < n1 && root.right != null)
		{
			return LCA(root.right, n1, n2);
		}

		// If the value of root in within the range, it is the LCA
		return root.key;
	}
}