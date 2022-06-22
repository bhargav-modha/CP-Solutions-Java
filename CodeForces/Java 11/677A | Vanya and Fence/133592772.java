import java.util.Scanner;
 
public class A_Vanya_and_Fence
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();
        int w=0;
 
        for(int i=0;i<n;i++)
        {
            if(sc.nextInt() <= height)
                w++;
            else
                w += 2;
        }
 
        System.out.print(w);
    }
}