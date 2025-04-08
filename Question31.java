// Check if we can partition the array into two sub arrays with equal
// sum.More formally, check that the prefix sum of a part of the array
// is equal to the suffix sum of rest of the array
// OUTPUT
// Enter the length of the Array:
// 6
// Enter the elements:
// 1 1 1 1 1 1
// Equal partition possible: true
import java.util.Scanner;
public class Question31 {
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
    static int totalSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equalSumPartition(int arr[]){
        int sum=totalSum(arr);
        int prefixSum=0;
        for(int i=0;i<arr.length-1;i++){
            prefixSum+=arr[i];
            int suffixSum=sum-prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        inputArray(arr);
        System.out.println("Equal partition possible: "+equalSumPartition(arr));
        sc.close();
    }
}
