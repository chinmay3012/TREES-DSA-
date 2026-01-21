import java.util.*;
public class TreeBFS {
    class TreeNode<E> {
        E data;
        TreeNode left;
        TreeNode right;

        public TreeNode(E data){
            this.data = data;
            this.left = null;
            this.right = null;

        }

        public ArrayList<ArrayList<Integer>> BFS (TreeNode<Integer> root) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if(root == null){
                return res;
            }

            Queue<TreeNode> queue = new LinkedList<>();

            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();

                ArrayList<Integer> currLevel = new ArrayList<>(levelSize);
                for(int i=0;i<levelSize;i++){
                    TreeNode currNode = queue.poll();

                    currLevel.add((Integer) currNode.data);

                    if(currNode.left != null){
                        queue.offer(currNode.left);
                    }
                    if(currNode.right != null) {
                        queue.offer(currNode.right);
                    }
                }
                res.add(currLevel);
            }

            return res;
        }


        public TreeNode findSuccessor(TreeNode root , int key ){
            if(root==null){
                return null;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }

                if((Integer) node.data == key){
                    break;
                }
            }
            return queue.peek();
        }
    }
}
