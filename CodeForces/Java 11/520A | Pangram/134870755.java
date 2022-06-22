import java.util.*;
 
public class A_Pangram
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
 
        if(n<26)
            System.out.print("NO");
        else
        {
            String str = sc.next();
            str = str.toLowerCase();
 
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
 
            int count=0;
            for(int i=0;i<ch.length-1;i++)
                if(ch[i] != ch[i+1])
                    count++;
 
            System.out.print((count+1)<26?"NO":"YES");
        }
    }
}