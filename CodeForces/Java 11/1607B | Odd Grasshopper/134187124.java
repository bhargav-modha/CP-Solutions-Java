import java.util.Scanner;
 
public class B_Odd_Grasshopper
 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
       while(sc.hasNext())
       {
            long init = sc.nextLong();
            long jumps = sc.nextLong();
 
            long ans = jumps%4;
            long j = (jumps-ans)+1;
 
            while(ans!=0)
            {
                if(init%2 == 0) 
                {
                    init -= j;
                    j++;
                    ans--;
                }
                else
                {
                    init += j;
                    j++;
                    ans--;
                }
            }
            System.out.println(init);
        }
    }
}