import java.util.Scanner;
 
public class A_Way_Too_Long_Words
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int len = sc.nextInt();
 
        for(int i=0;i<=len;i++)
        {
            String word = sc.nextLine();
            if(word.length() > 10)
            {
                String new_word = word.charAt(0) + String.valueOf(word.length()-2) + word.charAt(word.length()-1);
                System.out.println(new_word);
            }
            else
                System.out.println(word);
        }
    }
}