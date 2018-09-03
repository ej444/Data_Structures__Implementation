public class Main extends BST
{
  public static void main(String[] args)
   {
        BST tree = new BST();
        tree.root = new Node(4);
        tree.root.left = new Node(10);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        isBST(tree.root);

   }
}