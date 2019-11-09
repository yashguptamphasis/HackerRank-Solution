package hackerrank;

public class MarsExploration {
	public static void main(String args[])
	{
		String in="SOSSOTSLS";
		
		int times=in.length();
		times=times/3;
		
		int count=0;
		
		char temp[]= {'S','O','S'};
		char arr[]=in.toCharArray();
		int j=0;
		System.out.println("length of array is : "+arr.length);
		for(int i=0;i<times;i++)
		{
			
			for( int k=0; j<=arr.length && k<3;k++)
			{
				System.out.println("the value of j is :" +j);
				System.out.println("the value of k is :" +k);
				if(arr[j]==temp[k])
				{

				}
				else {
					count++;
				}
				j++;
			}
			System.out.println();
		}
		System.out.println(count);
	}
}
