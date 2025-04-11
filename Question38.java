// Given an n*m matrix 'a' return all elements of the matrix
// in SPIRAL ORDER.
// OUTPUT
// Enter no of rows:
// 5
// Enter no of column:
// 5
// Enter the array:
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
// 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
import java.util.Scanner;
public class Question38 {
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[][]){
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void spiralMatrix(int arr[][]){
        int r=arr.length;
        int c=arr[arr.length-1].length;
        int topRow = 0, bottomRow=r-1 , leftCol=0 , rightCol=c-1;
        int total=0;
        while(total<r*c){
            //topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && total<r*c;j++){
                System.out.print(arr[topRow][j]+" ");
                total++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && total<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                total++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && total<r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && total<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                total++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int r,c;
        System.out.println("Enter no of rows:");
        r=sc.nextInt();
        System.out.println("Enter no of column:");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        inputArray(arr);
        spiralMatrix(arr);
    }
}