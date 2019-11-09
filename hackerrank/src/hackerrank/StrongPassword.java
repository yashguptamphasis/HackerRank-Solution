package hackerrank;

public class StrongPassword {
	public static void main(String args[])
	{
		boolean special=false;
		boolean lower=false;
		boolean upper=false;
		boolean digit=false;
		int count=0;
		String s="aBl";
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i] == 'a' || arr[i]== 'b' || arr[i]=='c'|| arr[i]=='d' || arr[i]=='e'||arr[i]=='f'||arr[i]=='g'||arr[i]=='h'||arr[i]=='i'||arr[i]=='j'||arr[i]=='k'||arr[i]=='l'||arr[i]=='m'||arr[i]=='n'||arr[i]=='o'||arr[i]=='p'||arr[i]=='q'||arr[i]=='r'||arr[i]=='s'||arr[i]=='t'||arr[i]=='u'||arr[i]=='v'||arr[i]=='w'||arr[i]=='x'||arr[i]=='y'||arr[i]=='z' )
			{
				lower=true;
			}	

			else if(arr[i] == 'A' || arr[i]== 'B' || arr[i]=='C'|| arr[i]=='D' || arr[i]=='E'||arr[i]=='F'||arr[i]=='G'||arr[i]=='H'||arr[i]=='I'||arr[i]=='J'||arr[i]=='k'||arr[i]=='L'||arr[i]=='M'||arr[i]=='N'||arr[i]=='O'||arr[i]=='P'||arr[i]=='Q'||arr[i]=='R'||arr[i]=='S'||arr[i]=='T'||arr[i]=='U'||arr[i]=='V'||arr[i]=='W'||arr[i]=='X'||arr[i]=='Y'||arr[i]=='Z' )
			{
				upper=true;
			}	
			else if( arr[i]== '1' || arr[i]=='2'|| arr[i]=='3' || arr[i]=='4'||arr[i]=='5'||arr[i]=='6'||arr[i]=='7'||arr[i]=='8'||arr[i]=='9'||arr[i]=='0')
			{
				digit=true;
			}	
			else if( arr[i]== '!' || arr[i]=='@'|| arr[i]=='#' || arr[i]=='$'||arr[i]=='%'||arr[i]=='^'||arr[i]=='&'||arr[i]=='*'||arr[i]=='('||arr[i]==')')
			{
				special=true;
			}	
			else {
			
				}
			
			
			
		}
		
		
		if(lower==false)
		{
			count++;
		}
		
		if( upper ==false )
		{
			count++;
		}
		
		 if( special == false)
		{
			count++;
		}
		 
		 
		if(digit==false)
		{
			count++;
		}
		System.out.println("lower : "+lower);
		System.out.println("lower : "+upper);
		System.out.println("special : "+special);
		System.out.println("digit : "+digit);
		System.out.println("count is "+count);
	}
}
