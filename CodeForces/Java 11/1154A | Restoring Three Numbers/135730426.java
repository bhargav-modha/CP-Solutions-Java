import java.util.Scanner;
 
public class A_Restoring_Three_Numbers
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        double num[] = new double[4];
        double max = Integer.MIN_VALUE;
 
        for(int i=0;i<4;i++)
        {
            num[i] = sc.nextDouble();
            max = Math.max(max,num[i]);
        }
 
        for(double x:num)
            if(max-x != 0)
                System.out.print((int)(max-x)+" ");
    }
}