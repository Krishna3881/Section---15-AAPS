//Sort an Array consisting of only 0s and 1s
//NOTE:- In single traversal(loop)
//using two pointer approach
// OUTPUT
// Enter the length of the array:
// 6
// Enter the elements:
// 1 0 1 0 1 1
// The sorted array is:
// 0 0 1 1 1 1
import java.util.Scanner;
public class Question25 {
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
    static void swap(int left,int right,int arr[]){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void sortZeroAndOnes(int arr[]){
        int left=0;                 //first pointer
        int right=arr.length-1;     //second pointer
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(left,right,arr);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        System.out.println("The sorted array is:");
        sortZeroAndOnes(arr);
        printArray(arr);
        sc.close();
    }

}
