public class Main extends BT{

	public static int[] maxNode = new int[10000];
	public static int maxLevel = -1;

	public static void main(String[] args){
		BT tree = new BT();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        dfs(tree.root, 0);
        int max = -1;
        for(int i=0; i <= maxLevel; i++){
        	if(max < maxNode[i]) {max = maxNode[i];}
        }
        System.out.println("The maximum width is "+ max);
	}


	public static void dfs(Node n, int level){
		if(n == null){return;}
		// Calculates the maximum level which will serve as our last index in the maxNode array
		if(maxLevel < level) {maxLevel = level;}
		++maxNode[level];
		dfs(n.left, level+1);
		dfs(n.right, level+1);
	}
}