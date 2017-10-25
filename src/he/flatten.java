package he;

import java.util.ArrayList;
import java.util.List;

public class flatten {

	public void flated(NestedInteger n,List<Integer> List){
		
			if(n.isInteger()){
				List.add(n.getInteger());
			}else{
				for(NestedInteger a:n.getList()){
					flated(a,List);
				}
				
			
			}
	}
	public List<Integer> flat(List<NestedInteger> nestedList){
		List<Integer> list=new ArrayList<Integer>();
		for(NestedInteger n:nestedList){
			flated(n,list);
		}
		return list;
	}
	
}
