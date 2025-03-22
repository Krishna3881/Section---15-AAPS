//Check if the given array is sorted or not
// OUTPUT
// Enter the length of the array: 
// 5
// Enter the elements: 
// 12 14 16 16 18
// The element is Sorted: 
// true
import java.util.Scanner;
public class Question7 {
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static boolean checkSort(int arr[]){
        boolean ans = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                ans=false;
                break;
            }
        }
        System.out.println("The element is Sorted: ");
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        System.out.println(checkSort( arr));
        sc.close();
    }
}
