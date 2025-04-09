// Write a program to display transpose of matrix
// entered by the user.
// the index changes column become row(vice versa)
// original matrix r1 c1
// transpose matrix c1 r1
// OUTPUT
// Enter the number of rows:
// 3
// Enter the number of column:
// 3
// Enter the array:
// 1 2 3
// 4 5 6
// 7 8 9
// Transpose of the matrix is:
// 1 4 7
// 2 5 8
// 3 6 9
import java.util.Scanner;
public class Question34 {
    static Scanner sc = new Scanner(System.in);
    static int[][] findTranspose(int arr[][]){
        int tran[][]=new int[arr[arr.length-1].length][arr.length];
        for(int i=0;i<arr[arr.length-1].length;i++){//rows number
            for(int j=0;j<arr.length;j++){//column number
                    tran[i][j]=arr[j][i];
                }
        }
        System.out.println("Transpose of the matrix is:");
        return tran;
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
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r1,c1;
        System.out.println("Enter the number of rows:");
        r1=sc.nextInt();
        System.out.println("Enter the number of column:");
        c1=sc.nextInt();
        int arr1[][]= new int[r1][c1];
        inputArray(arr1);
        int ans[][]=findTranspose(arr1);
        printArray(ans);
    }
}
