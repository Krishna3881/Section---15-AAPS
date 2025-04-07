// Given an integer array "arr" return the prefix sum/running sum
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
public class Question28 {
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
    static int[] makePrefixSumArray(int arr[]){
        int prefixSum[]= new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
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
        int ans[]=makePrefixSumArray(arr);
        System.out.println("Prefix Sum Array: ");
        printArray(ans);
        sc.close();
    }
}
