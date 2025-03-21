//Find the last occurence of an element x in a given array
// OUTPUT
// Enter the array length:
// 5
// 1 2 1 2 1
// Enter the element to search:
// 1
// The last occurence of element 1 is
// 4 Index
import java.util.Scanner;
public class Question5 {
    static Scanner sc = new Scanner(System.in);
    static int lastOccurence(int n,int arr[]){
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                last=i;
            }
        }
        System.out.println("The last occurence of element "+n+" is ");
        return last;
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
        System.out.println("Enter the element: ");
        int element=sc.nextInt();
        System.out.println(lastOccurence(element,arr)+" Index");
        sc.close();
    }
}

