import java.util.Scanner;
 
public class A_Chat_room
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
 
        String str = sc.next();
        String hello = "hello";
        int k=0;
 
        for(int i=0;i<str.length();i++)
        {
            if(k > 4)
                break;
            else if(str.charAt(i) == hello.charAt(k))
                k++;
        }
        System.out.print(k >= hello.length()?"YES":"NO");
    }
}