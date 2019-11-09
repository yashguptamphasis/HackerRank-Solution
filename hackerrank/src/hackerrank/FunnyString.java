package hackerrank;

public class FunnyString {
	public static void main(String args[])
	{
		String str1="acxz";
		String str2="";
		for(int j=str1.length()-1; j>=0;j--)
		{
			str2=str2+str1.charAt(j);
		}
		int len=str1.length();
		int arr[] = new int[len];
		int arr2[] = new int[len];
		for(int i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
			arr2[i]=str2.charAt(i);
		}	
		int res1[]=new int[len-1];
		int res2[]=new int[len-1];
		for(int k=0;k<arr.length-1;k++)
		{
			res1[k]=Math.abs(arr[k+1]-arr[k]);
			res2[k]=Math.abs(arr2[k+1]-arr2[k]);
		}
		int count=0;
		for(int k=0;k<arr.length-1;k++)
		{
			System.out.println(res1[k]);
			System.out.println(res2[k]);
			if(res1[k]==res2[k])
			{
				count++;
			}
		}
		
		System.out.println("the count : "+count);
		
		
	}
}
