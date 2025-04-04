//Reverse an array in place no new array is used
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 1 2 3 4 5
// The Reverse array is:
// 5 4 3 2 1
import java.util.Scanner;
public class Question20 {
    static Scanner sc=new Scanner(System.in);
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void reverseArray(int arr[]){
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        //for while loop this code can be used
        // int i=0,j=arr.length-1;
        // while(i<j){
        //     int temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        reverseArray(arr);
        System.out.println("The Reverse array is: ");
        printArray(arr);
        sc.close();
    }
}
