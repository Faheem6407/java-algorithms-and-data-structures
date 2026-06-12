import java.util.Scanner;
public class Anagrams {
    static void generate(char[] a,int s){
        if(s==a.length-1){
            System.out.println(String.valueOf(a));
            return;
        }
        for(int i=s;i<a.length;i++){
            char t=a[s];
            a[s]=a[i];
            a[i]=t;
            generate(a,s+1);
            t=a[s];
            a[s]=a[i];
            a[i]=t;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        generate(str.toCharArray(),0);
    }
}
