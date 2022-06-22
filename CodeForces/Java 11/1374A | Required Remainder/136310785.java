import java.util.Scanner;
 
public class A_Required_Remainder
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double n = sc.nextInt();
            
            if(n%x == y)
                System.out.println((int)n);
            else
            {
                if(n%x>y)
                    n -= (n%x)-y;
                else
                    n -= x-(y-(n%x));
                System.out.println((int)n);
            }
        }
    }
}