//Given an integer "arr" sorted in non decreasing order,return an array
//of given an integer array "arr" return the prefix sum/running sum in the
//same array without creating a new array.
// OUTPUT
// Enter the length of the Array:
// 5
// Enter the elements:
// 2 1 3 4 5
// Original Array:
// 2 1 3 4 5
// Prefix Sum Array:
// 2 3 6 10 15
import java.util.Scanner;
public class Question29 {
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void makePrefixSumArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        inputArray(arr);
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Prefix Sum Array: ");
        printArray(arr);
        sc.close();
    }
}