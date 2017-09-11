import java.util.Scanner;

public class EmptyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int k=x;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)+1;j++)
			{
				if(i==x-1||j==0||j==(i*2))
				System.out.print("*");
				else
				System.out.print(" ");	
			}System.out.println("");
		}
		
		sc1.close();
	}

}
