import java.util.Arrays;
import java.util.Scanner;


public class max_sub_array {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        long ans=0,sum=0;
        
        Scanner s=new Scanner(System.in);
        int _t=s.nextInt();
        int arr[][]=new int[_t][];
          //getting i/p
        for(int i=0;i<_t;i++)
            {
            arr[i]=new int[s.nextInt()];
            for(int j=0;j<arr[i].length;j++)
                {
                arr[i][j]=s.nextInt();
            }
            
        }
        
        
      
       long nans=0;
        long count=0;
        for(int k=0;k<arr.length;k++)
            {
            sum=0;
            nans=0;
            ans=0;
            count=0;
        
        for(int i=0;i<arr[k].length;i++)
            {
            if(sum+arr[k][i]>0)
                {
                sum=sum+arr[k][i];
                //System.out.println("nans+a[i]"+nans+" "+arr[k][i]);
                if(arr[k][i]>0)
                    {
                nans=nans+arr[k][i];
                }
               // System.out.println("nans "+nans);
                
            }else
                {
            	count++;
                sum=0;
                
            }
            if(count==arr[k].length)
            {
            	Arrays.sort(arr[k]);
            	ans=arr[k][arr[k].length-1];
            	//System.out.println("answer"+ans);
            	nans=ans;
            	break;
            	
            }
            ans=Math.max(ans,sum);
            //nans=Math.max(nans,sum);
            
            
        }
        
            System.out.println(ans+" "+nans);
        }
        
    }

}
