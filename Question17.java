//Given 2 integers a & b.Swap the 2 given values using temporary variables
// OUTPUT
// Enter the 1 element:
// 5
// Enter the 2 element:
// 6
// Values before Swap:
// a: 5 b: 6
// Values after Swap:
// a: 6 b: 5
import java.util.Scanner;
public class Question17{
    static Scanner sc=new Scanner(System.in);
    static void swap(int a,int b){
        System.out.println("Values before Swap: ");
        System.out.println("a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Values after Swap: ");
        System.out.println("a: "+a+" b: "+b);
    }
    public static void main(String[] args) {
        System.out.println("Enter the 1 element: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2 element: ");
        int b=sc.nextInt();
        swap(a, b);
        sc.close();
    }
}