import java.util.Scanner;
 
public class A_Magical_Sticks
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            System.out.println((sc.nextInt()+1)/2);
        }
    }
}