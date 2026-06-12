import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int key=sc.nextInt();
        int l=0;
        int r=n-1;
        int pos=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==key){
                pos=m;
                break;
            }
            else if(a[m]<key)
                l=m+1;
            else
                r=m-1;
        }
        if(pos!=-1)
            System.out.println("Found at index "+pos);
        else
            System.out.println("Not Found");
    }
}
