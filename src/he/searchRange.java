package he;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class searchRange {
	
	private ArrayList<Integer> list=new ArrayList<>();
	public void sortBinary(TreeNode root,int k1,int k2){
		if(root==null){
			return;
		}
		if(root.val>k2){
			sortBinary(root.left,k1,k2);
		}else if(root.val<k1){
			sortBinary(root.right,k1,k2);
		}else{
			sortBinary(root.left,k1,k2);
			list.add(root.val);
			sortBinary(root.right,k1,k2);
		}
	}
}
