import java.util.*;
public class NumberPattern {
	public static void main(String args[])
	{
		int i,j,k;
		Scanner sc1=new Scanner(System.in);
				int n=sc1.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
		    {System.out.print(" ");}
			for(k=0;k<n-i;k++)
			{System.out.print(k+1);}
			System.out.println("");
		}		
		for(i=0;i<n;i++)
		{
			for(j=n-1;j>i;j--)
			{System.out.print(" ");}
			for(k=0;k<=i;k++)
			{System.out.print(k+1);}
			System.out.println("");
		}sc1.close();
	}
}
