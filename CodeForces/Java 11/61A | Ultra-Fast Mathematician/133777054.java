import java.util.Scanner;
 
public class A_Ultra_Fast_Mathematician
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String n1 = sc.next();
        String n2 = sc.next();
 
        String ans = "";
 
        for(int i=0;i<n1.length();i++)
        {
            ans += Math.abs(((int)n1.charAt(i)%10) - ((int)n2.charAt(i)%10));
        }
 
        System.out.print(ans);
    }
}