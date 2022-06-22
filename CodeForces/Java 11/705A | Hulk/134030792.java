import java.util.Scanner;
 
public class A_Hulk
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
 
        System.out.print("I ");
        for(int i=1;i<=n;i++)
        {
            if(i<n)
            {
                if(i%2 == 0)
                    System.out.print("love that I ");
                else if(i%2 != 0)
                    System.out.print("hate that I ");
            }
            else if(i==n)
            {
                if(n%2 == 0)
                    System.out.print("love it");
                else 
                    System.out.print("hate it");
            }   
        }
    }
}