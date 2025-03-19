//Calculate the maximum value of out of all the elements in the array
// input= 1 2 3 4 5 6 7 8 9
// output=9
public class Question2 {
    static int maxArray(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("The maximum element in the array is: ");
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(maxArray(arr));
    }
}
