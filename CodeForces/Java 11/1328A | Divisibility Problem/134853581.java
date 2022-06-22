import java.util.Scanner;
 
public class A_Divisibility_Problem
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
 
        for(double i=0;i<t;i++)
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
 
            if(a%b == 0)
                System.out.println(0);
            else
                System.out.println((int)((Math.ceil(a/b)*b)-a));
        }
    }
}