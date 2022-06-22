import java.util.Scanner;
 
public class A_Domino_piling
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        System.out.print((m*n%2 == 0)?(m*n/2):(m*n-1)/2);
    }
}