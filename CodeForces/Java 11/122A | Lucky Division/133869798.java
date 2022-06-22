import java.util.Scanner;
 
public class A_Lucky_Division
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        boolean isLucky = false;
        int n = sc.nextInt();
 
        int lucky_nums[] = {4,7,47,74,44,444,447,474,477,777,774,744};
        
        for(int i=0;i<lucky_nums.length;i++)
        {
            if(n%lucky_nums[i] == 0)
                isLucky = true;
        }
 
        System.out.print(isLucky?"YES":"NO");
    }
}