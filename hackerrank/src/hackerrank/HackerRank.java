package hackerrank;

public class HackerRank {
	public static void main(String args[])
	{
		String str="hacnnnkerrankk";
		
		char ori[]=str.toCharArray();
		String result="no";
		int j=0;
		char dumy[]= {'h','a','c','k','e','r','r','a','n','k'};
		
		for(int i=0;i<ori.length;i++)
		{
			System.out.println("outside "+i);
			if(j<dumy.length && ori[i]==dumy[j])
			{
				j++;
				System.out.println("inside "+j);
			}
		}
		
		System.out.println(j);
	}
}
