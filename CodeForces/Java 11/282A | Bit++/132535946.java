import java.util.Scanner;
 
public class A_Bit_
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int x=0;
 
        for(int i=0;i<n;i++)
        {
            String stmt = sc.next();
            for(int j=0;j<stmt.length();j++)
            {
                if(stmt.charAt(j) == '+')
                {
                    x++;
                    j++;
                }
                else if(stmt.charAt(j) == '-')
                {
                    x--;
                    j++;
                }
                else if(stmt.charAt(j) == 'x' || stmt.charAt(j) == 'X')
                {
                    continue;
                }
            }
        }
        System.out.print(x);
    }
}