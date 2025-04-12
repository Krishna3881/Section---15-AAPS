// Given a matrix "arr" of dimension n*m & 2 coordinates(l1,r1) & (l2,r2).
// Return the sum of the rectangle from(l1,r1) to (l2,r2).
// OUTPUT
// Enter the row:
// 7
// Enter the column:
// 7
// Enter l1,r1:
// 3 1
// Enter l2,r2:
// 5 4
// Rectangle Sum is: 12
import java.util.Scanner;
public class Question40 {
    static Scanner sc =new Scanner(System.in);
    static void inputArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // arr[i][j]=sc.nextInt();
                arr[i][j]=1;
            }
        }
    }
    static int sumMatrix(int arr[][]){
        int l1,r1,l2,r2,sum=0;
        System.out.println("Enter l1,r1:");
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.println("Enter l2,r2:");
        l2=sc.nextInt();
        r2=sc.nextInt();
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int r,c;
        System.out.println("Enter the row:");
        r=sc.nextInt();
        System.out.println("Enter the column:");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        inputArray(arr);
        int ans=sumMatrix(arr);
        System.out.println("Rectangle Sum is: "+ans);
    }
}
