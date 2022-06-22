import java.util.Scanner;
 
public class A_George_and_Accommodation
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int count = 0;
 
        for(int i=0;i<l;i++)
        {
            int temp = sc.nextInt();
            if(sc.nextInt()-temp >= 2)
                count++;
        }
 
        System.out.print(count);
    }
}