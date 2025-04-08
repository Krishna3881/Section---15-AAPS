//Addition of 2 matrices
// 2 3  +  1 2   =3 5
// 4 5     3 4    7 9
//  A       B     SUM
// OUTPUT
// For 1st Matrix
// Enter the number of rows:
// 2
// Enter the number of column:
// 2
// Enter the array:
// 1 2
// 3 4
// For 2nd Matrix
// Enter the number of rows:
// 2
// Enter the number of column:
// 2
// Enter the array:
// 1 2
// 3 4
// The sum is:
// The 2D array is:
// 2 4
// 6 8
import java.util.Scanner;
public class Question32 {
    static Scanner sc = new Scanner(System.in);
    static void sum(int arr1[][],int arr2[][]){
        if(arr1.length!=arr2.length||arr1[arr1.length-1].length!=arr2[arr2.length-1].length){
            System.out.println("Wrong input-Addition not possible");
            return;
        }
        int sum[][]=new int[arr1.length][arr1[arr1.length-1].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum is:");
        printArray(sum);
    }
    static void inputArray(int arr[][]){
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void printArray(int arr[][]){
        System.out.println("The 2D array is: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        System.out.println("For 1st Matrix");
        System.out.println("Enter the number of rows:");
        r1=sc.nextInt();
        System.out.println("Enter the number of column:");
        c1=sc.nextInt();
        int arr1[][]= new int[r1][c1];
        inputArray(arr1);
        System.out.println("For 2nd Matrix");
        System.out.println("Enter the number of rows:");
        r2=sc.nextInt();
        System.out.println("Enter the number of column:");
        c2=sc.nextInt();
        int arr2[][]= new int[r2][c2];
        inputArray(arr2);
        sum(arr1, arr2);
    }
}
