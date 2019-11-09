package hackerrank;


import java.util.*;

public class MigaratoryBird {
	public static void main(String arg[])
	{
		//ArrayList arr1=new ArrayList();
		//List arr= new ArrayList();
	//	arr.addAll(Arrays.asList(1 ,2 ,3 ,4 ,5 ,4, 3, 2, 1, 3 ,4));
	//	System.out.println(arr.size());
		
		int arr[]= {1 ,4 ,4 ,4 ,5 ,3};
        int counter[] = new int[6];
        int result = 1; int max = 0;
        
        for(int i=0;i<arr.length;i++)
        {
        	counter[arr[i]]++;
        }
        
        int maxz=0;
        int res=0;
        
        for(int i=0;i<counter.length;i++)
        {
        	if(counter[i]>maxz)
        	{
        		res=i;
        		maxz=counter[i];
        	}
        }
        System.out.println("max index is  "+res);
        
	}
}
