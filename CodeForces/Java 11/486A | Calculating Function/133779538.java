import java.util.Scanner;
import java.math.BigInteger;
 
public class A_Calculating_Function
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n%2==0?(n/2):(n/2)-n);
    }
}