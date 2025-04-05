//Sort an Array consisting of only 0s and 1s
// OUTPUT
// Enter the length of the array:
// 8
// Enter the elements:
// 1 0 1 0 1 0 1 0
// The sorted array is:
// 0 0 0 0 1 1 1 1
import java.util.Scanner;
public class Question24 {
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
    static void sortZeroAndOnes(int arr[]){
        int zero =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else{
                arr[i]=1;
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
