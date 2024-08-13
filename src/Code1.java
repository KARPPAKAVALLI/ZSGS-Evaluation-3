import java.util.Arrays;
import java.util.Scanner;

public class Code1 {
    //1.
    //Given an array and an integer K, find the maximum for each and every contiguous subarray of size K.
    //Example-1 :
    //Input: arr[] = {1 2 3 1 4 5 2 3 6}, K = 3
    //Output: 3 3 4 5 5 5 6
    //8 5 10 7 9 4 15 12 90 13

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int n= sc.nextInt();
        System.out.println("Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("K");
        int k=sc.nextInt();


        int ans[]=new int[n-k+1];
        int l=0;
        for(int i=0;i<=n-k;i++){
            int max=0;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max)
                    max=arr[j];
            }
            ans[l++]=max;
        }
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
