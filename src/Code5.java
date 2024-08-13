import java.util.Scanner;

public class Code5 {
    //5.
    //You are given an integer array nums consisting of 2 * n integers.
    //You need to divide nums into n pairs such that:
    //Each element belongs to exactly one pair. The elements present in a pair are equal.
    //Return true if nums can be divided into n pairs, otherwise return false. Example 1:
    //Input: nums = [3,2,3,2,2,2] Output: true

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n*2];
        int freq[]=new int[500];
        for (int i=0;i<n;i++){
            nums[i]= sc.nextInt();
            freq[nums[i]-1]++;
        }
        boolean f=true;
        for (int i=0;i<n;i++){
            if(freq[i]!=0 && freq[i]%2!=0){
                f=false;
                break;
            }
        }
        System.out.println(f);
    }
}
