//Find the second smallest element in the given array
//IMPORTANT ans will always exist/work for negative integers also
//                ALGORITHM
//      1:-Find minimum
//      2:-Mark all minimum as +Infinte
//      3:-Find minimum -->Second minimum
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 15 46 85 34 82
// The Second smallest element is:
// 34
import java.util.Scanner;
public class Question16 {
    static Scanner sc=new Scanner(System.in);
    static void printArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static int minArray(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int secondMinArray(int arr[]){
        int min=minArray(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        min=minArray(arr);
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length =sc.nextInt();
        int arr[]=new int[length];
        printArray(arr);
        System.out.println("The Second smallest element is: ");
        System.out.println(secondMinArray(arr));
        sc.close();
    }
}
