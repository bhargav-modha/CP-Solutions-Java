import java.util.Scanner;
 
public class A_Anton_and_Danik
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String str = sc.next();
        int a = 0;
 
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == 'A')
                a++;
        }
 
        if(a == n-a)
            System.out.print("Friendship");
        else if(a > n-a)
            System.out.print("Anton");
        else
            System.out.print("Danik");
    }
}