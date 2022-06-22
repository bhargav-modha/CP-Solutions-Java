import java.util.Scanner;
 
public class A_Soft_Drinking
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n_friends = sc.nextInt();
        int k_bottles = sc.nextInt();
        int l_milliliters = sc.nextInt();
        int c_limes = sc.nextInt();
        int d_slices = sc.nextInt();
        int p_grams = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
 
        System.out.print((Math.min((p_grams/np),Math.min(((k_bottles*l_milliliters)/nl),c_limes*d_slices)))/n_friends);
 
    }
}