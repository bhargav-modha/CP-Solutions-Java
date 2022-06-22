//"01" "plus-minus" position, 
//"10" "minus-plus" position.
 
import java.util.Scanner;
 
public class A_Magnets
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
 
        int magnets[] = new int[n];
 
        for(int i=0;i<n;i++)
        {
            magnets[i] = sc.nextInt();
        }
 
        for(int i=1;i<n;i++)
        {
            if((magnets[i-1] == 10 && magnets[i] != 10) || (magnets[i-1] == 01 && magnets[i] != 01))
                count++;
        }
 
        System.out.print(count+1);
    }
}