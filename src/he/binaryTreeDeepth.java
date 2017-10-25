package he;

public class binaryTreeDeepth {

	public  int getMaxDeepth(TreeNode root){
		
		if(root==null){
			return 0;
		}else{
			int left=getMaxDeepth(root.left);
			int right=getMaxDeepth(root.right);
			return Math.max(left, right)+1;
		}
	}
	

}
