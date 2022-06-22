import java.util.Scanner;
 
public class A_Word
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String str = sc.next();
        int count=0;
 
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
                count++;
        }
        System.out.print((count >= str.length()-count)?str.toLowerCase():str.toUpperCase());
    }
}