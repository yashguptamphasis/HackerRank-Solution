package hackerrank;

public class DiagnonalDiff {
	int len= arr.size();
	int sum=0;
	for(int i=0,j=0;i<len && j<len ;i++,j++)
	{
	    //for(int j=0;j<len;j++)
	    
	        if(i==j)
	        {
	            sum=sum+arr.get(i).get(j);
	        }
	    
	}
	int sum1=0;
	for(int i=0,j=len-1;i<len && j>=0 ;i++,j--)
	{
	    //for(int j=0;j<len;j++)
	    
	        
	        
	            sum1=sum1+arr.get(i).get(j);
	        
	    
	}


	return Math.abs(sum-sum1);
}
