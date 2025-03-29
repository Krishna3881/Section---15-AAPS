//Find the total numbers of pairs in the Array whose sum is
//equal to the given value x
// TARGET SUM
// OUTPUT
// Enter the length of the array:
// 6
// Enter the elements:
// 4 6 3 5 8 2
// Sum you need:
// 7
// No of pairs:
// 2
import java.util.Scanner;
public class Question10 {
    static Scanner sc = new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static int pairSum(int n,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    count++;
                }
            }
        }
        System.out.println("No of pairs: ");
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter the elements:");
        inputArray(arr);
        System.out.println("Sum you need: ");
        int sum=sc.nextInt();
        System.out.println(pairSum(sum, arr));
        sc.close();
    }
}
