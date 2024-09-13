package DataStructures.BigO;



public class Quasilinear {
    public static void main(String[] args) {
        int x = 50;
        int count = 0;
        while(x > 0){ //O(log n)
            for(int i = 0; i<20; i++){ //O(n)
                count++;
            }
            x /= 2;
        }
        System.out.println(count);
    }
}


