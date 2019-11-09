 class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s1) {
        /*
         * Write your code here.
         */
         String final1;
       if( s1.endsWith("PM"))
       {
           String str=s1.substring(0,2);
            int hr=Integer.parseInt(str);
            if(hr==12)
            {
                final1=s1.substring(0,8);

            }
            else{
            hr=hr+12;
            final1=Integer.toString(hr)+s1.substring(2,8);}
       }
       else
       {
           int hr=Integer.parseInt(s1.substring(0,2));

           if(hr==12)
           {
               final1="00"+s1.substring(2,8);
           }
           else
           {
           final1=s1.substring(0,8);
           }
       }
        return final1;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
package hackerrank;

public class TimeConversion {

}
