import java.util.Scanner;
 
public class B_Team_Composition_Programmers_and_Mathematicians
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long p = sc.nextLong();
            long m = sc.nextLong();
 
            System.out.println(Math.min(((m+p)/4),Math.min(m,p)));
        }
    }
}