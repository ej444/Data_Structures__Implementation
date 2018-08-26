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
}