package he;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeWidth {

	public int getMaxWidth(TreeNode root){
		if(root==null){
			return 0;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		int maxWidth=1;
		queue.offer(root);
		while(true){
			int len=queue.size();
			if(len==0){
				break;
			}
			while(len>0){
				TreeNode t=queue.poll();
				len--;
				if(t.left!=null){
					queue.offer(t.left);
				}
				if(t.right!=null){
					queue.offer(t.right);
				}
			}
			
			maxWidth=Math.max(maxWidth, len);
			
		}
		
		return maxWidth;
	}
}
