public class Main extends BT{

        // Target not found yet => false
        public static boolean flag = false;

	public static void main(String[] args){
		BT tree = new BT();
                tree.root = new Node(1);
                tree.root.left = new Node(2);
                tree.root.right = new Node(3);
                tree.root.left.left = new Node(4);
                tree.root.left.right = new Node(5);
                tree.root.left.right.left = new Node(7);

                int target = 7;
                dfs(tree.root, target);
        }

        public static void dfs(Node n, int target){
                if(flag || n == null) {return;}
                if(n.key == target){
                        flag = true;
                        return;
                }
                
                dfs(n.left, target);
                dfs(n.right, target);
                if(flag){ System.out.println(n.key);}
        }
}

/*OUTPUT

                  1
                /   \
               2     3
              /  \
             4    5
                 /
                7

5
2
1


*/