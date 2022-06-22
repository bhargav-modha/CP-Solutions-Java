import java.util.Scanner;
 
public class A_Candies_and_Two_Sisters
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for(int i=0;i<t;i++)
        {
            double candies = sc.nextDouble();
            if(candies%2 == 0)
                candies--;
            System.out.println(candies<3?0:(int)candies/2);
        }
    }
}