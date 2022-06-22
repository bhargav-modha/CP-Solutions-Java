import java.util.Scanner;
 
public class A_Watermelon
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        if(n<=2 || n%2 !=0)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
}