import java.util.Scanner;
 
public class A_Helpful_Maths
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
 
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i] == '+' || ch[j] == '+')
                    continue;
                else if(ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }   
        }
        System.out.print(String.valueOf(ch));
    }
}