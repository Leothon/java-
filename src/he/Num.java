package he;

public class Num {

	public static void main(String args[]){
	int n=41;
    int[] ugly = new int[n];
    ugly[0] = 1;
    int p2 = 0;
    int p3 = 0;
    int p5 = 0;
    for (int i = 1; i < n; i++) {
        int lastNumber = ugly[i - 1];
        while (ugly[p2] * 2 <= lastNumber) {
            p2++;
        }
        while (ugly[p3] * 3 <= lastNumber) {
            p3++;
        }
        while (ugly[p5] * 5 <= lastNumber) {
            p5++;
        }
        ugly[i] = Math.min(Math.min(ugly[p2] * 2, ugly[p3] *3), ugly[p5] * 5);
        System.out.print(ugly[i]+" ");
    }
    
    System.out.println(ugly[n-1]);
}
}
