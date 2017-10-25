
public class test1 {
	
    public static void main(String args[]){
    	String cachesize=new String("20496");
    	Double cacheM=Double.parseDouble(cachesize);
        Double m=cacheM/1024;
        String size=m.toString();
    	System.out.println(String.format("%.2f",m));
    }
}
