//Find the largest and smallest element in array
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 15 78 46 85 35
// The smallest element is: 15
// The largest element is: 85

//arr[0] will also give smallest output
//arr[arr.length-1] will also give largest output
//reason SHALLOW COPY is being done because array reference is there
//no new memory is created 
import java.util.Arrays;
import java.util.Scanner;
public class Question8{
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
    static int[] smallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        int result[]={arr[0],arr[arr.length-1]};//heap memory created
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];//heap memory created
        inputArray(arr);
        int ans[]=smallestAndLargestElement(arr);
        System.out.println("The smallest element is: "+ans[0]);//arr[0] will also give same output
        System.out.println("The largest element is: "+ans[1]);//arr[arr.length] will also give same output
        sc.close();
    }
}
