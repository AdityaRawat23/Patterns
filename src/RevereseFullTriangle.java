import java.util.Scanner;

public class RevereseFullTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(n-i)*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}sc1.close();
	}
}
