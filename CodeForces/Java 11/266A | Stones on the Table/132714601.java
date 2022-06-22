import java.util.Scanner;
 
public class A_Stones_on_the_Table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count=0;
        int n = sc.nextInt();
        String str = sc.next();
 
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                count++;
        }
 
        System.out.print(count);
    }
}