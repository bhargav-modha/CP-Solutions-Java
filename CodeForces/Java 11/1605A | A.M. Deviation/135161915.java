import java.util.Scanner;
 
public class A_A_M_Deviation
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        
        for(int j=0;j<t;j++)
        {
            double sum = sc.nextDouble()-2*sc.nextDouble()+sc.nextDouble();
            System.out.println(sum%3==0?"0":"1");
        }
    }
}