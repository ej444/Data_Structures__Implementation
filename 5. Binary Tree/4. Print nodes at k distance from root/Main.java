public class Main extends BT{

	public static void main(String[] args){
		BT tree = new BT();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);

        findDistance(tree.root, 0, 2);
	}


	public static void findDistance(Node n, int d, int dist){
		if(n == null){return;}
		if(d == dist){
			System.out.println(n.key);
			return;
		}
		findDistance(n.left, d+1, dist);
		findDistance(n.right, d+1, dist);
	}
}