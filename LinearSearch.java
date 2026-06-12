import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int key=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                pos=i;
                break;
            }
        }
        if(pos!=-1)
            System.out.println("Found at index "+pos);
        else
            System.out.println("Not Found");
    }
}
