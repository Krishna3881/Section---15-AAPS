//Rotate the given array 'arr' by k steps, where k is
//non-negative WITHOUT USING EXTRA SPACE. Note:- K can be greater than n as well
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 1 2 3 4 5
// Enter the K value:
// 7
// Original array:
// 1 2 3 4 5
// Rotated array:
// 4 5 1 2 3
import java.util.Scanner;
public class Question22 {
    static Scanner sc=new Scanner(System.in);
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void reverseArray(int a,int b,int arr[]){
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    static void rotateArray(int n,int arr[]){
        n%=arr.length;
        reverseArray(0, arr.length-1-n, arr);
        reverseArray(arr.length-n, arr.length-1, arr);
        reverseArray(0, arr.length-1, arr);
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        System.out.println("Enter the K value:");
        int k=sc.nextInt();
        System.out.println("Original array:");
        printArray(arr);
        rotateArray(k, arr);
        System.out.println("Rotated array:");
        printArray(arr);
        sc.close();
    }
}
