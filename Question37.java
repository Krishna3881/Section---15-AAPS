// Given an integer n,return the first n rows of pascal's triangle.
// In pascal's triangle,each number is the sum of the two numbers directly
// above it as shown
// for eg n=5
//             1
//            1 1
//           1 2 1
//          1 3 3 1
//         1 4 6 4 1
// OUTPUT
// Enter n:
// 5
// Pascal triangle is:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
import java.util.Scanner;
public class Question37 {
    static Scanner sc =new Scanner(System.in);
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int ans[][]= new int[n][];
        for(int i=0;i<n;i++){
            //ith row has i+1 columns
            ans[i]=new int[i+1];
            //1st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n:");
        n=sc.nextInt();
        int ans[][]=pascal(n);
        System.out.println("Pascal triangle is:");
        printArray(ans);
    }
}
