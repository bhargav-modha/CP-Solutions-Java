import java.util.Scanner;
 
public class A_Domino_piling
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        int size = m*n;
 
        if(size%2 == 0)
            System.out.print(size/2);
        else
            System.out.print((size--)/2);
    }
}