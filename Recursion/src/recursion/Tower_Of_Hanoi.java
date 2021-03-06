package recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		towerOfHanoi(20, "A", "B", "C");
	}
	
	public static void towerOfHanoi(int n, String start, String aux, String end)
	{
		if(n==1)
		{
			System.out.println(start+"--->"+end);
		}
		else
		{
			towerOfHanoi(n-1, start, end, aux);
			System.out.println(start+"--->"+end);
			towerOfHanoi(n-1, aux, start, end);
		}
		
	}

}
