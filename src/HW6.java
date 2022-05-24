import java.util.Scanner;
public class HW6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n=keyboard.nextInt();
		int [][] result = new int[n][n];
		int i=0,j=0,num=1;
		
		for(int circle = 1;circle <= n/2;circle++,j++,i++) {
			for(;j<n-circle;j++,num++) {result[i][j]=num;}
			for(;i<n-circle;i++,num++) {result[i][j]=num;}
			for(;j>circle-1;j--,num++) {result[i][j]=num;}
			for(;i>circle-1;i--,num++) {result[i][j]=num;}
			
		}
		if(n%2==1) {
			result[(n/2)][(n/2)] = num;
		}
		
		System.out.print("[");
		for(int a=0;a<n;a++) {
			System.out.print("[");
			for(int b=0;b<n;b++) {
				System.out.print(result[a][b]);
				if(b!=n-1)
					System.out.print(",");
			}
			System.out.print("]");
			if(a!=n-1)
				System.out.print(",");
		}
		System.out.print("]");

	}

}
