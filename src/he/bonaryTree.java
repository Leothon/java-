package he;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bonaryTree {

	public String serialize(TreeNode root) {
        // write your code here
        String result = "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode == null) {
                result = result + ",#";
            } else {
                result = result + "," + currNode.val;
                queue.offer(currNode.left);
                queue.offer(currNode.right);
            }
        }
        return result.substring(1);
    }
    public static TreeNode deserialize(String data) {
        // write your code here
        if (data.equals("#")) {
            return null;
        }
        String[] tree = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for (String node : tree) {
            queue.offer(node);
        }
        int rootval = Integer.parseInt(queue.poll());//返回根节点
        TreeNode root = new TreeNode(rootval);
        Queue<TreeNode> resultQueue = new LinkedList<>();
        resultQueue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = resultQueue.poll();
            String left = queue.poll();
            if (!left.equals("#")) {
                currNode.left = new TreeNode(Integer.parseInt(left));
                resultQueue.offer(currNode.left);
            }
            String right = queue.poll();
            if (!right.equals("#")) {
                currNode.right = new TreeNode(Integer.parseInt(right));
                resultQueue.offer(currNode.right);
            }
        }
        return root;
    }

	public static void main(String[] args) {
		String data=new String("3,9,20,#,#,15,7");
		
		System.out.println(deserialize(data));

	}

}
