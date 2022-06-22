import java.util.Scanner;
 
public class A_Add_Odd_or_Subtract_Even
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            if(a == b)
                System.out.println("0");
            else if(a<b)
            {   
                if(Math.abs(a-b)%2 == 0)    System.out.println("2");
                else    System.out.println("1");
            }
            else
            {
                if(Math.abs(a-b)%2 != 0)    System.out.println("2");
                else    System.out.println("1");
            }
        }
    }
}