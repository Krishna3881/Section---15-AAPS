// Given a SQUARE matrix, turn it by 90 degree in a clockwise
// direction without using extra space.
// eg
//   1 2 3       7 4 1
//   4 5 6  -->  8 5 2
//   7 8 9       9 6 3   rotated by 90 degree
// OUTPUT
// Enter the number of rows:
// 4
// Enter the number of column:
// 4
// Enter the array:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// The 90 degree rotated array is:
// 13 9 5 1
// 14 10 6 2
// 15 11 7 3
// 16 12 8 4
import java.util.Scanner;
public class Question36 {
    static Scanner sc = new Scanner(System.in);
    static void inPlaceTranspose(int arr[][]){
        int r=arr.length;
        int c=arr[arr.length-1].length;
        for(int i=0;i<c;i++){//rows number
            for(int j=i;j<r;j++){//column number
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //System.out.println("Transpose of the matrix is:");
    }
    static void reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static void rotate90(int arr[][]){
        int r=arr.length;//Square matrix r==c
        inPlaceTranspose(arr);
        for(int i=0;i<r;i++){
            reverseArray(arr[i]);
        }
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
        rotate90(arr1);
        System.out.println("The 90 degree rotated array is:");
        printArray(arr1);
    }
}
