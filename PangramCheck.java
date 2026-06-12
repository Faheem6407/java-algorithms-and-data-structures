import java.util.Scanner;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        boolean[] a=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
                a[c-'a']=true;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(!a[i]){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}
