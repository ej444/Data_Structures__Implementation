public class Main extends BST
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		BST bst = new BST();
		bst.root = formBalancedBST(arr, 0, arr.length-1);
		print(root);
	}
}