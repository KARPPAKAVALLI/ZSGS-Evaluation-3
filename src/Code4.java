import java.util.Scanner;

public class Code4 {
    //4.
    //Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
    //Sample Input-1 thistest123string123 123
    //Sample Output-1 8

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String 1 and 2");
        String s1= sc.nextLine(),s2= sc.nextLine();

        int i=0,j=0,index=-1;
        while (i<s1.length()){
            int k=i;
            j=0;
            while (j<s2.length() && k<s1.length() && s1.charAt(k)==s2.charAt(j)){
                k++;
                j++;
            }
            if(j==s2.length()){
                index=i;
                break;
            }
            i++;
        }
        System.out.println("Index: "+index);
    }
}
