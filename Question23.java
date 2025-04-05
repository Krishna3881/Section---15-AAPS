//Given Q queries check if the given number is present in the array or not
//Note value of all the element in the array is less than 10 to the power 5
// OUTPUT
// Enter the length of the array:
// 5
// Enter the elements:
// 45 68 45 41 25
// Enter no of query:
// 2
// Enter the number to search:
// 68
// YES
// Enter the number to search:
// 70
// NO
import java.util.Scanner;
public class Question23 {
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
    static void query(int freq[]){
        System.out.println("Enter no of query:");
        int query =sc.nextInt();
        for(int i=0;i<query;i++){
            System.out.println("Enter the number to search:");
            int num=sc.nextInt();
            if(freq[num]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    static void makeFrequencyArray(int arr[]){
        int freq[]=new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        query(freq);
    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        inputArray(arr);
        makeFrequencyArray(arr);
        sc.close();
    }

}
