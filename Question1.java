// Calculate the sum of all elements in the given array
// input= 1 2 3 4 5 6 7 8 9
// output=45
public class Question1 {
    static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("The sum of the given array is: ");
        System.out.println(sumOfArray(arr));
    }
}
