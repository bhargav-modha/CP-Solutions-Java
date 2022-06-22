import java.util.Scanner;
 
public class A_Expression
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int max = a+b+c;
 
  max  = max>a*b*c?max:a*b*c;
        max  = max>(a+b)*c?max:(a+b)*c;
        max  = max>a+(b*c)?max:a+(b*c);
        max  = max>a*(b+c)?max:a*(b+c);
        max  = max>(a*b)+c?max:(a*b)+c;
        
        System.out.print(max);
    }
}