import java.util.Scanner;
 
public class A_Presents
{
    public static void main(String Args[])
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int present[] = new int[n+1];
 
        for(int i=1;i<=n;i++)
        {
            temp = sc.nextInt();
            present[temp] = i;
        }
 
         for(int i=1;i<=n;i++)
        {
            System.out.print(present[i]+" ");
        }   
    }
}