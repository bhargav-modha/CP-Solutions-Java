import java.util.Scanner;
 
public class A_Fox_And_Snake
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc .nextInt();
        boolean right = false;
 
        for(int i=0;i<n;i++)
        {
            if(i%2 != 0)
                right = !right;
            for(int j=0;j<m;j++)
            {
                if((i%2==0 || (right && j==m-1)) || ((i%2==0 || (!right && j==0))))
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}