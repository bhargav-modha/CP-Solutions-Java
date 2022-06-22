import java.util.Scanner;
 
public class A_Football
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String str = sc.next();
        if(str.contains("1111111") || str.contains("0000000"))
            System.out.print("YES");
        else
            System.out.print("NO");            
    }
}