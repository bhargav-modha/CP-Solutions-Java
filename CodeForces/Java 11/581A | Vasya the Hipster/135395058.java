import java.util.Scanner;
 
public class A_Vasya_the_Hipster
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
 
        System.out.print(Math.min(red,blue)+" ");
 
        if(red>=blue)
        {
            red -= blue;
            System.out.print(red/2);
        }
        else
        {
            blue -= red;
            System.out.print(blue/2);
        }
    }
}