package hackerrank;

import java.util.Arrays;

public class IceCreamParlor {
	public static void main(String args[])
	{
		int m=4;
		int arr[]= {1,4,5,3,2};
		int res[]= new int[2];
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==m)
				{
					res[0]=arr[i];
					res[1]=arr[j];
					break;
				}
			}	
		}

		Arrays.sort(res);
		System.out.println("the res array is : "+res[0]+" "+res[1]);
		
	}
}
