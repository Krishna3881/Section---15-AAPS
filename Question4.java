//Count the number of occurence of a particular element x
// OUTPUT
// Enter the array length:
// 5
// 1 2 1 2 1
// Enter the element to search:
// 1
// The number of Occurences of 1 is
// 3
import java.util.Scanner;
public class Question4 {
    static Scanner sc = new Scanner(System.in);
    static int elementOccurence(int n,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        System.out.println("The number of Occurence of "+n+" is ");
        return count;
    }
    static void inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the array length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        System.out.println("Enter the element to search: ");
        int element=sc.nextInt();
        System.out.println(elementOccurence(element,arr));
        sc.close();
    }
}
