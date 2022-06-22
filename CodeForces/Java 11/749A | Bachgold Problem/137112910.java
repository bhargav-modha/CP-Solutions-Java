import java.util.Scanner;
 
public class A_Bachgold_Problem
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
 
        System.out.println(n/2);
        if(n%2 != 0)
        {
            n -= 3;
            System.out.print(3+" ");
        }
        
        while(n>0)
        {
            n -= 2;
            System.out.print(2+" ");
        }
    }
}