package he;

public class eightQueen {

	static int [][] a=new int[8][8];
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check(0,0);
		System.out.println(count);
	}
	
	public static void sub(int x,int y){
		a[x][y]=0;  
        for(int i=0;i<8;i++){  
            if(i!=y)  
            a[x][i]=a[x][i]-1;  
        }  
        for(int i=0;i<8;i++){  
            if(i!=x)  
            a[i][y]=a[i][y]-1;  
        }  
        for(int i=-7;i<8;i++){
            if((i+x)>=0&&(i+x)<8&&i!=0&&(i+y)>=0&&(i+y)<8){  
                a[x+i][y+i]=a[x+i][y+i]-1;  
            }  
        }  
        for(int i=-7;i<8;i++){  
            if((x-i)>=0&&(x-i)<8&&i!=0&&(i+y)>=0&&(i+y)<8){  
                a[x-i][y+i]=a[x-i][y+i]-1;  
            }  
        }  
    }  

	public static void add(int x,int y){
		a[x][y]=-1;
		for(int i=0;i<8;i++){
			if(i!=y){
				a[x][y]=a[x][i]+1;
			}
		}
		for(int i=0;i<8;i++){
			if(i!=x){
				a[i][y]=a[i][y]+1;
			}
		}
		for(int i=-7;i<8;i++){
            if((i+x)>=0&&(i+x)<8&&i!=0&&(i+y)>=0&&(i+y)<8){  
                a[x+i][y+i]=a[x+i][y+i]+1;  
            }  
        }  
        for(int i=-7;i<8;i++){
            if((x-i)>=0&&(x-i)<8&&i!=0&&(i+y)>=0&&(i+y)<8){  
                a[x-i][y+i]=a[x-i][y+i]+1;  
            }  
        }
	}
	public static void check(int i,int j){
		if(i==8){
			count++;
			for(int k=0;k<8;k++){
				if(a[7][k]==-1){
					sub(7,k);
					return;
				}
			}
		}else{
			boolean flag=true;
			for(int l=0;l<8;l++){
				if(a[i][l]==0){
					flag=false;
					add(i,l);
					check(i+1,l);
				}
			}
			
			if(flag==false&&i>0){
				for(int q=0;q<8;q++){
					if(a[i-1][q]==-1){
						sub(i-1,q);
						return;
					}
				}
			}
			return;
		}
	}
	

}
