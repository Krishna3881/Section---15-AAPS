// ARRAY MANIPULATION
//Find the unique number in a given Array where all the element
//are being repeated twice with one value being unique
//IMPORTANT only positive value in the array
//                ALGORITHM
//      1:-Traverse all pairs
//      2:-Equal Pairs--> Mark -1
//      3:-Traverse array again,value > 0 is answer
// OUTPUT
// Enter the length of the array:
// 7
// Enter the element:
// 1 4 2 1 3 2 3
// The unique no is:
// 4
import java.util.Scanner;
public class Question12{
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static int findUnique(int arr[]){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }

        System.out.println("The unique no is: ");
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];//heap memory created
        System.out.println("Enter the element: ");
        inputArray(arr);
        System.out.println(findUnique(arr));
        sc.close();
    }
}