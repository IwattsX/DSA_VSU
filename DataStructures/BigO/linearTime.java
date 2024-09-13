package DataStructures.BigO;

public class linearTime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,20};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int curr = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > curr){
                curr = arr[i];
            }
        }
        return curr;
    }
}
