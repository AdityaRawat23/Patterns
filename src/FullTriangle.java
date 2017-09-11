import java.util.Scanner;

public class FullTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}sc1.close();
	}

}
