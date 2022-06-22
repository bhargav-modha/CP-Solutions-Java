import java.util.Scanner;
 
public class A_Make_Even
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            long n = sc.nextLong();
            if(n%2 == 0)
                System.out.println("0");
            else
            {
                char[] chars = (""+n).toCharArray();
                int i=0;
                boolean flag = false;
 
                if((int)(chars[0])%2 == 0)
                    System.out.println("1");
                else
                {
                    for(i=0;i<chars.length;i++)
                    {
                        if((int)(chars[i])%2 == 0)
                        {
                            flag = true;
                            System.out.println("2");
                            break;
                        }
                        
                    }
                    if(!flag) System.out.println("-1");
                }
            }
        }
    }
}