// Given a positive integer n, generate an n*n matrix filled with
// elements from 1 to n^2 in SPIRAL ORDER.
// OUTPUT
// Enter no of rows & column:
// 3
// The spiral matrix is:
// 1 2 3
// 8 9 4
// 7 6 5
import java.util.Scanner;
public class Question39 {
    static Scanner sc =new Scanner(System.in);
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int arr[][]){
        int r=arr.length;
        int topRow = 0, bottomRow=r-1 , leftCol=0 , rightCol=r-1;
        int total=1;
        while(total<=r*r){
            //topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && total<=r*r;j++){
                arr[topRow][j]=total++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && total<=r*r;i++){
                arr[i][rightCol]=total++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && total<=r*r;j--){
                arr[bottomRow][j]=total++;
            }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && total<=r*r;i--){
                arr[i][leftCol]=total++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no of rows & column:");
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        spiralMatrix(arr);
        System.out.println("The spiral matrix is:");
        printArray(arr);
    }
}
