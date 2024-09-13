package DataStructures.BigO;

public class lognTime {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch(int[] arr, int value){
        int lp = 0;
        int rp = arr.length - 1;

        while (lp < rp){
            int middle = lp + (rp-lp)/2;

            if(arr[middle] == value){
                return middle;
            }
            if(arr[middle] > value){
                rp = middle - 1;
            }
            if(arr[middle] < value){
                lp = middle + 1;
            }
        }
        return -1;
    }
}
