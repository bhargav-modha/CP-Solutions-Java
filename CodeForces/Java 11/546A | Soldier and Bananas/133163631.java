import java.util.Scanner;
 
public class A_Soldier_and_Bananas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int cost_of_first = sc.nextInt();
        int dollars = sc.nextInt();
        int no_bananas = sc.nextInt();
 
        int total_cost = 0;
 
        for(int i=1;i<=no_bananas;i++)
        {
            total_cost += ((cost_of_first)*i);
        }
 
        System.out.print((total_cost > dollars)?total_cost-dollars:0);
    }
}