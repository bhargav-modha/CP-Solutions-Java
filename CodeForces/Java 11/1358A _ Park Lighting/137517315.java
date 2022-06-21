import java.util.Scanner;
 
public class A_Park_Lighting
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            //sides = (2*(m+n))+(n*(m-1))+(m*(n-1));
            System.out.println(((n*m)+1)/2);
        }
    }
}