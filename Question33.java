// Write a program to display Multiplication of two matrices
// entered by the user
// (r1*c1)   *    (r2*c2)    =(r1*c2)
// c1 == r2
// OUTPUT
// For 1st Matrix
// Enter the number of rows:
// 2
// Enter the number of column:
// 3
// Enter the array:
// 1 2 1
// 3 1 2
// For 2nd Matrix
// Enter the number of rows:
// 3
// Enter the number of column:
// 2
// Enter the array:
// 2 1
// 1 3
// 1 1
// The multiplication is:
// 5 8
// 9 8
import java.util.Scanner;
public class Question33 {
    static Scanner sc = new Scanner(System.in);
    static void multiply(int arr1[][],int arr2[][]){
        if(arr1[arr1.length-1].length!=arr2.length){
            System.out.println("Wrong input-Multiplication not possible");
            return;
        }
        int mul[][]=new int[arr1.length][arr2[arr2.length-1].length];
        for(int i=0;i<arr1.length;i++){//rows number
            for(int j=0;j<arr2[arr2.length-1].length;j++){//column number
                for(int k=0;k<arr1[arr1.length-1].length;k++){
                    /*
                     * i=1,j=0
                     * mul[i][j]=ith row of arr1*jth col of arr2
                     */
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("The multiplication is:");
        printArray(mul);
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
        multiply(arr1, arr2);
    }
}
