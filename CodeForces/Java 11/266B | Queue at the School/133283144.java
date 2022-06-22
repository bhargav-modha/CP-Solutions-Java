import java.util.Scanner;
 
public class B_Queue_at_the_School
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int tot_std = sc.nextInt();
        int sec = sc.nextInt();
 
        char ch[] = new char[tot_std];
        String temp = sc.next();
        ch = temp.toCharArray();
 
        for(int j=0;j<sec;j++)
        {
            for(int i=0;i<ch.length-1;i++)
            {
                if(ch[i] == 'B' && ch[i+1] == 'G')
                {
                    ch[i] = 'G';
                    ch[i+1] = 'B';
                    i++;
                }
            }
        }
 
        for(char x:ch)
        {
            System.out.print(x);
        }
    }
}