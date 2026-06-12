import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] a=s1.toLowerCase().toCharArray();
        char[] b=s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
