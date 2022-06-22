import java.util.Scanner;
 
public class A_Yet_Another_Two_Integers_Problem
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
 
            if(a == b)
                System.out.println("0");
            else
                System.out.println((int)Math.ceil(Math.abs(a-b)/10));
        }
    }
}