import java.util.*;
 
public class A_Amusing_Joke
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 += sc.nextLine();
        String str2 = sc.nextLine();
 
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
 
        Arrays.sort(ch1);
        Arrays.sort(ch2);
 
        System.out.print(String.valueOf(ch1).equals(String.valueOf(ch2))?"YES":"NO");
    }
}