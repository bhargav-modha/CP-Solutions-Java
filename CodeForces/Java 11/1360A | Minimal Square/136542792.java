import java.util.Scanner;
 
public class A_Minimal_Square
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            System.out.println((int)Math.pow((double)(Math.min(Math.max(2*b,a),Math.max(2*a,b))),2));
        }
    }
}