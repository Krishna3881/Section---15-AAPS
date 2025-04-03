// ARRAY MANIPULATION
//Find the second largest element in the given array
//IMPORTANT ans will always exist/work for negative integers also
//                ALGORITHM
//      1:-Find maximum
//      2:-Mark all maximum as -Infinte
//      3:-Find maximun -->Second Maximum
// OUTPUT
// Enter the length of the array:
// 5
// Enter the element:
// 15 46 85 34 82
// The second maximum value is: 82
import java.util.Scanner;
public class Question13{
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    // static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    static int findMax(int arr[]){
        int mx=Integer.MIN_VALUE;//-2147483648
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int arr[]){
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;//-2147483648
            }
        }
        max=findMax(arr);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];//heap memory created
        System.out.println("Enter the element: ");
        inputArray(arr);
        System.out.println("The second maximum value is: "+secondMax(arr));
        sc.close();
        // printArray(arr);
    }
}