// Given an array of integers of size n.Answer q queries where you need to
// print the sum of values in a given range of indices from l to r(both included).
// Note:The values of l & r in queries follow 1 based indexing.
// OUTPUT
// Enter the length of the Array:
// 6
// Enter the elements:
// 2 4 1 3 6 5
// Enter the no of queries:
// 3
// Enter range:
// 1 5
// Sum: 16
// Enter range:
// 2 2
// Sum: 4
// Enter range:
// 2 5
// Sum: 14
import java.util.Scanner;
public class Question30 {
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        for(int i =1;i<arr.length;i++){
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
        int arr[]=new int[n+1];
        System.out.println("Enter the elements: ");
        inputArray(arr);
        System.out.println("Enter the no of queries: ");
        int queries=sc.nextInt();
        makePrefixSumArray(arr);
        while(queries>0){
            System.out.println("Enter range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=arr[r]-arr[l-1];
            System.out.println("Sum: "+ans);
            queries--;
        }
        sc.close();
    }
}
