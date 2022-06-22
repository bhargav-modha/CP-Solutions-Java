import java.util.Scanner;
import java.util.Arrays;
 
public class A_Boy_or_Girl
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
 
        char[] ch = str.toCharArray();
        int count = 1;
 
        Arrays.sort(ch);
 
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i-1]!=ch[i])
                count++;
        }
        System.out.print((count%2 == 0)?"CHAT WITH HER!":"IGNORE HIM!");
    }
}