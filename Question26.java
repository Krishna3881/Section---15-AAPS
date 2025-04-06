//Given an array integer "arr" move all the even integer at the
//beginning of the array followed by all the odd integers.The relative
//order of odd or even integers does not matter.
//Return any array that satisfies the condition
// OUTPUT
// Enter the length of the array:
// 7
// Enter the element:
// 1 2 3 4 5 6 7
// The sorted array Even then odd:
// 6 2 4 3 5 1 7
import java.util.Scanner;
public class Question26{
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int arr[]){
        System.out.println("Enter the element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortArrayOddEven(int arr[]){
        int left=0;
        int right=(arr.length-1);
        while(left<right){
            if(arr[left]%2==1&& arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        sortArrayOddEven(arr);
        System.out.println("The sorted array Even then odd:");
        printArray(arr);
    }
}