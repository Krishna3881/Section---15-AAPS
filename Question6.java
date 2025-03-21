//Count the number of elements strictly greater than value x
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 12 15 18 20 25
// Enter the no you want to check:
// 18
// The element 18 is greater than 2 elements
import java.util.Scanner;
public class Question6 {
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void greaterThan(int n,int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                count++;
            }
        }
        System.out.println("The element "+n+" is greater than "+count+" elements");
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        System.out.println("Enter the no you want to check: ");
        int n=sc.nextInt();
        greaterThan(n, arr);
        sc.close();
    }
}
