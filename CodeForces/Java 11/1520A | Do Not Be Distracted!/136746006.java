import java.util.Scanner;
 
public class A_Do_Not_Be_Distracted_
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int len = sc.nextInt();
            String str = sc.next(), temp = "";
            boolean suspicious = false;
 
            temp += str.charAt(0);
            for(int i=1;i<len;i++)
               if(str.charAt(i) != str.charAt(i-1)) temp += str.charAt(i);
 
            outer:for(int i=0;i<temp.length();i++)
            {            
                for(int j=i+1;j<temp.length();j++)
                {
                    if(temp.charAt(i) == temp.charAt(j))
                    {   
                        suspicious = true;
                        break outer;
                    }
                    else                     
                        suspicious &= false;
                }
            }
            System.out.println(suspicious?"NO":"YES");
        }
    }
}