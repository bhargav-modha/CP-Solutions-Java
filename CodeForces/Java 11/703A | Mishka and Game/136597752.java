import java.util.Scanner;
 
public class A_Mishka_and_Game
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        int m_count = 0, c_count = 0;
 
        while(rounds-- >0)
        {
            int m = sc.nextInt();
            int c = sc.nextInt();
            
            if(m == c) continue;
            else if(m>c) m_count++;
            else c_count++;
        }
        
        if(m_count>c_count) System.out.println("Mishka");
        else if(m_count == c_count) System.out.println("Friendship is magic!^^");
        else System.out.println("Chris");
    }
}