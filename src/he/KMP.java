package he;

public class KMP {

    public int strStr(String source, String target) {
        // write your code here
 
        if(source == null || target == null)
            return -1;
 
        if(source.equals(target))
            return 0;
 
        if(source.length() < target.length())
            return -1;
 
        for(int i = 0; i <= source.length() - target.length(); i++){
            int j = 0;
            for(; j < target.length(); j++){
                if(target.charAt(j) != source.charAt(i + j))
                    break;
            }
 
            if(j == target.length())
                return i;
        }
 
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
