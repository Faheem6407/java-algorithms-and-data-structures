import java.util.Scanner;
public class CRUDOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Data");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int p=sc.nextInt();
        int v=sc.nextInt();
        a[p]=v;
        System.out.println("After Update");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        p=sc.nextInt();
        for(int i=p;i<n-1;i++)
            a[i]=a[i+1];
        n--;
        System.out.println("After Delete");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
