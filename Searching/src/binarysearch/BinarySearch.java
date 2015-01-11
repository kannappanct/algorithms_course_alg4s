package binarysearch;

import java.util.Scanner;

public class BinarySearch {
	
public static int binarysearch(int a[],int key)
	{
		int low=0,high=a.length-1;
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(key<a[mid])
			{
				high=mid-1;
				
				
			}else if(key>a[mid])
			{
				low=mid+1;
				
			}else
			{
			
				return a[mid];
			}
			
			
		}
		
		return -1;
	}
	
	
	
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter the Key value");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		int value=binarysearch(a,key);
		if(value != -1)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

}
