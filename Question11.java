//Count the number of triplet whose sum is
//equal to the given value x
// TARGET SUM
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 1 4 5 6 3
// Sum you need:
// 12
// No of triplet:
// 2
import java.util.Scanner;
public class Question11 {
    static Scanner sc = new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static int tripletSum(int n,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){//First number
            for(int j=i+1;j<arr.length;j++){//Second number
                for(int k=j+1;k<arr.length;k++){//Third number
                    if(arr[i]+arr[j]+arr[k]==n){
                        count++;
                    }
                }
            }
        }
        System.out.println("No of triplet: ");
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
        System.out.println(tripletSum(sum, arr));
        sc.close();
    }
}
