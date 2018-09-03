public class Main extends BST
{
	public static void main(String[] args)
	{
		BST bst = new BST();
		bst.root = new Node(20);
    bst.root.left = new Node(8);
    bst.root.right = new Node(22);
    bst.root.left.left = new Node(4);
    bst.root.left.right = new Node(12);
    bst.root.left.right.left = new Node(10);
    bst.root.left.right.right = new Node(14);

    findLCA(bst.root, 11, 22);
	}
}