//Given an array "arr" consisting of integers.Return the first
//value that is repeating in this array.If no value is being
//repeated, return -1
// OUTPUT
// Enter the number of arrays:
// 7
// Enter the elements:
// 1 5 3 4 6 3 4
// The first repeating value is: 3
import java.util.Scanner;
public class Question14 {
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static int firstRepeatingNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of arrays: ");
        int length =sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        System.out.println("The first repeating value is: "+firstRepeatingNumber(arr));
        sc.close();
    }
}
