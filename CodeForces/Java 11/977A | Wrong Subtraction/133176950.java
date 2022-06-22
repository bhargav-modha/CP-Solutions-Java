import java.util.Scanner;
 
public class A_Wrong_Subtraction
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        int subs = sc.nextInt();
 
        for(int i=0;i<subs;i++)
        {
            num = (num%10 == 0)?num/10:num-1;                
        }
 
        System.out.print(num);
    }
}