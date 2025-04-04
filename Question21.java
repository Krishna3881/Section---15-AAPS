//Rotate the given array 'arr' by k steps, where k is
//non-negative WITH USING EXTRA SPACE. Note:- K can be greater than n as well
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 1 2 3 4 5
// Enter the K value:
// 7
// Original array:
// 1 2 3 4 5 Rotated array:
// 4 5 1 2 3
import java.util.Scanner;
public class Question21 {
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
    static int[] rotateArray(int n,int arr[]){
        n%=arr.length;
        int ans[]=new int[arr.length];//New heap memory is created
        int j=0;
        for(int i=arr.length-n;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length-n;i++){
            ans[j++]=arr[i];
        }
        return ans;
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
        System.out.println("Rotated array:");
        int ans[]=rotateArray(k, arr);
        printArray(ans);
        sc.close();
    }
}
