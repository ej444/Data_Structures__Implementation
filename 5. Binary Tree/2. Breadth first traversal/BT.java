import java.util.*;

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

	
	public static void BFS(Node n)
	{
		Queue<Node> q = new LinkedList<Node>();

		q.add(n);

		while(!q.isEmpty())
		{

			Node temp = q.poll();
			System.out.printf(" %d > ", temp.key);

			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}	
	}
}

/* OUTPUT

Breath first traversals:  1 >  2 >  3 >  4 >  5

*/