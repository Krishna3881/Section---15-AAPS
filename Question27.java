//Given an array integer "arr" sorted in non DECREASING ORDER, return
//an array of the squares of each number sorted in non-decreasing order.
// OUTPUT
// Enter the length of the array:
// 6
// Enter the element:
// -10 -3 -2 1 4 5
// The sorted square is:
// 100 25 16 9 4 1
import java.util.Scanner;
public class Question27{
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
    static int[] sortSquare(int arr[]){
        int ans[]=new int[arr.length];
        int i=0;
        int left=0;
        int right=arr.length-1;
        while(right>=left){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[i++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[i++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");
        int length=sc.nextInt();
        int arr[]=new int[length];//heap memory
        inputArray(arr);
        int ans[]=sortSquare(arr);
        System.out.println("The sorted square is:");
        printArray(ans);
    }
}