package hackerrank;

public class BreakingTheRecord {
	public static void main(String args[])
	{
		int arr[]= {10, 5, 20, 20, 4 ,5, 2, 25 ,1};
		int greater=arr[0];
		int smaller=arr[0];
		int greatercount=0;
		int smallercount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>greater)
			{
				greater=arr[i];
				greatercount++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smaller)
			{
				smaller=arr[i];
				smallercount++;
			}
		}
		System.out.println("greater : "+greatercount);
		System.out.println("smaller : "+smallercount);
	}
}
