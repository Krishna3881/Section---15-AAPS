//Search the given element x in the array.If present then return the index
//else return -1
// input= 1 2 3 4 5 6 7 8 9
// output= Enter the number to be searched:
//         5
//         Element found at index: 4

import java.util.Scanner;
public class Question3 {
    static int searchArray(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.print("Element found at index: ");
                return i;
            }
        }
        System.out.print("Element Not found: ");
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number to be searched: ");
        int n=sc.nextInt();
        System.out.println(searchArray(n,arr));
        sc.close();
    }
}
