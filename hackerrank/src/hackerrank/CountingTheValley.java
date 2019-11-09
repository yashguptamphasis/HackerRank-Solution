package hackerrank;

public class CountingTheValley {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count1=0;
        int alpha=0;
        int supcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            {
                count1++;
            }    
            else if(s.charAt(i)=='D')
            {
                count1--;
            }
            //System.out.print(count1+" ");
            

            if(count1==-1)
            {
                alpha=1;
            }


            if(count1==0 && alpha==1)
            {
                alpha=0;
                supcount++;
            }
        }
        System.out.println(supcount);
    }
}
