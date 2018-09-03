import java.util.LinkedList;
import java.util.Queue;

public class BST
{
	static Queue<Integer> q = new LinkedList<>();
	static Node root;

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

	public static void findElement(Node root, int k)
	{
		inOrderTraversal(root);

		int temp = 0;
		for(int i : q)
		{
			++temp;
			if(temp == k)
			{
				System.out.println("The " + k + "th smallest element is " + i);
				break;
			}
		}
	}

	public static void inOrderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}

		inOrderTraversal(root.left);
		q.add(root.key);
		inOrderTraversal(root.right);
	}
}


