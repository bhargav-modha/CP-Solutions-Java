import java.util.Scanner;
 
public class A_Translation
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
 
        String r = "";
 
        for(int i=s.length()-1;i>=0;i--)
        {
            r += s.charAt(i);
        }
        
        System.out.print(t.equals(r)?"YES":"NO");
    }
}