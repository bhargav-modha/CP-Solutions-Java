import java.util.Scanner;
 
public class A_HQ9_
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        String str = sc.next();
        boolean flag = false;
 
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9')
            {
                flag = true;
                break;
            }
        }
 
        System.out.print(flag?"YES":"NO");
    }
}