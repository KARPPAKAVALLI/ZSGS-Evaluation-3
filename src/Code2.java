import java.util.Scanner;

public class Code2 {
    //2.
    //Add two numbers in the given base without converting into base. Sample Input-1
    //123 13 4
    //Sample Output-1 202
    //Sample Input-2 1010 11001 2
    //Sample Output-2 100011

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1 & num2");
        int num1= sc.nextInt(),num2= sc.nextInt();
        System.out.println("base");
        int base= sc.nextInt();
        int carry=0;
        String ans="";
        while (num1>0 && num2>0){
            int x=num1%10+num2%10;
            ans=(x+carry)%base+ans;
            if(x+carry>=base){
                carry=1;
            }
            else{
                carry=0;
            }
            num1/=10;
            num2/=10;
        }
        while (num1>0){
            int x=num1%10;
            ans=(x+carry)%base+ans;
            if(x+carry>=base){
                carry=1;
            }
            else{
                carry=0;
            }
            num1/=10;
        }
        while (num2>0){
            int x=num2%10;
            ans=(x+carry)%base+ans;
            if(x+carry>=base){
                carry=1;
            }
            else{
                carry=0;
            }
            num2/=10;
        }
        if(carry==1){
            ans="1"+ans;
        }
        System.out.println(ans);
    }
}
