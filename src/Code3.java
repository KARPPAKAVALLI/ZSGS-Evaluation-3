import java.util.Scanner;

public class Code3 {
    //3.
    //Given an array and a threshold value find the o/p Sample Input-1
    //{5 8 10 13 6 2}
    //threshold = 3 Sample Output-1 count = 17 Explanation:
    //Number parts      counts
    //5     {3,2}       2
    //8     {3,3,2}     3
    //10    {3,3,3,1}   4
    //13    {3,3,3,3,1} 5
    //6     {3,3}       2
    //2     {2}         1

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("elements");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("threshold:");
        int threshold = sc.nextInt();
        int parts=0;
        for (int i=0;i<n;i++){
            parts+=arr[i]/threshold;
            if(arr[i]%threshold!=0)
                parts++;
        }
        System.out.println(parts);
    }


}
