import java.util.Scanner;
 
public class A_Short_Substrings
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            String b = sc.next();
            
            if(b.length() == 2)
                System.out.println(b);
            else
            {
                char ch[] = b.toCharArray();
                String a= "";
 
                for(int i=0;i<ch.length-1;i++)
                {
                    if(i==0)
                    {
                        a += ch[i];
                        i++;
                    }
                    else if(ch[i] == ch[i-1])
                    {   
                        a += ch[i];
                        i++;
                    }
                }
                a += ch[ch.length-1];
                System.out.println(a);
            }
        }
    }
}