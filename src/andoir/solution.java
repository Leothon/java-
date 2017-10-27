package andoir;

import java.util.ArrayList;


public class solution {
	public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		TreeNode tree=null;
		tree=reConstruct(pre,0,pre.length-1,in,0,in.length-1);
		return tree;
	}
	public TreeNode reConstruct(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
		
		if(startPre>endPre||startIn>endIn){
			return null;
		}
		TreeNode tree=new TreeNode(pre[startPre]);
		for(int i=startIn;i<=endIn;i++){
			if(in[i]==pre[startPre]){
				tree.left=reConstruct(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
				tree.right=reConstruct(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
			}
		}
		
		return tree;
	}
	public static void main(String args[]){
		
		
	}
}
