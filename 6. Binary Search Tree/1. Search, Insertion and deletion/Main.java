public class Main extends BST
{
	public static void main(String[] args)
	{
		BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the given tree");
		print(bst.root);

		System.out.println("\nDelete 20");
        bst.delete(20);
        System.out.println("Inorder traversal of the modified tree");
		print(bst.root);
 
        System.out.println("\nDelete 30");
        bst.delete(30);
        System.out.println("Inorder traversal of the modified tree");
		print(bst.root); 

        System.out.println("\nDelete 50");
        bst.delete(50);
        System.out.println("Inorder traversal of the modified tree");
		print(bst.root);
	}
}