package permutations;

import java.util.Scanner;

public class Permutation_recursion {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char a[]=str.toCharArray();
		permutate(a,0,str.length()-1);
		
		
	}
	
	public static void permutate(char a[],int i,int n)
	{
		char temp;
		if(i==n)
		{
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]);
			}
			System.out.println();
		}
		else
		{
			for(int j=i;j<=n;j++)
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			permutate(a,i+1,n);
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
			}
			
		}
		
		
		
	}
	
	
}
