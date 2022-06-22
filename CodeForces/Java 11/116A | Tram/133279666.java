import java.util.Scanner;
 
public class A_Tram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int stops = sc.nextInt();
        int count = 0, max = 0;
 
        for(int i=0;i<stops;i++)
        {
            count -= sc.nextInt();
            count += sc.nextInt();
 
            if(count > max)
                max = count;
        }
        System.out.print(max);
    }
}