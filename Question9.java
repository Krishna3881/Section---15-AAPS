//Find the kth largest and smallest element in array
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 15 78 46 85 35
// Enter the Kth element:
// 2
// The smallest element is: 35
// The largest element is: 78

//arr[n-1] will also give smallest output
//arr[arr.length-n] will also give largest output
//reason SHALLOW COPY is being done because array reference is there
//no new memory is created
import java.util.Arrays;
import java.util.Scanner;
public class Question9{
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[]){
        System.out.println("Enter the elements: ");
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
    static int[] kthSmallestAndLargestElement(int arr[],int n){
        Arrays.sort(arr);
        int result[]={arr[n-1],arr[arr.length-n]};//heap memory created
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];//heap memory created
        inputArray(arr);
        System.out.println("Enter the Kth element: ");
        int n=sc.nextInt();
        int ans[]=kthSmallestAndLargestElement(arr,n);
        System.out.println("The smallest element is: "+ans[0]);//arr[n-1] will also give same output
        System.out.println("The largest element is: "+ans[1]);//arr[arr.length-n] will also give same output
        sc.close();
    }
}
