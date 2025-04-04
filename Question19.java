//Reverse an array consisting of integer values using new array
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 1 2 3 4 5
// The Reverse array is:
// 5 4 3 2 1
import java.util.Scanner;
public class Question19 {
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
    static int[] reverseArray(int arr[]){
        int ans[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        int ans[]=reverseArray(arr);
        System.out.println("The Reverse array is: ");
        printArray(ans);
        sc.close();
    }
}
