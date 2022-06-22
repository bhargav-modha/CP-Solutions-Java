import java.util.Scanner;
 
public class A_cAPS_lOCK
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        boolean flag = true;
 
        for(int i=1;i<ch.length;i++)
            if(Character.isLowerCase(ch[i]))
                flag = false;
 
        if(flag == true)
            for(int i=0;i<ch.length;i++)
                if(Character.isLowerCase(ch[i]))
                    ch[i] = Character.toUpperCase(ch[i]);
                else
                    ch[i] = Character.toLowerCase(ch[i]);
 
        for(int i=0;i<ch.length;i++)
      System.out.print(ch[i]);
    }
}