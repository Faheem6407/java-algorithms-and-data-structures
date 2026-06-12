import java.util.Scanner;
public class CRUDOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        System.out.println("Enter values:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Values: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.print("Enter position to update: ");
        int p=sc.nextInt();
        System.out.print("Enter new value: ");
        int v=sc.nextInt();
        a[p]=v;
        System.out.print("After update: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.print("Enter position to delete: ");
        p=sc.nextInt();
        for(int i=p;i<n-1;i++)
            a[i]=a[i+1];
        n--;
        System.out.print("After delete: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
