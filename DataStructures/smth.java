import java.util.*;

class smth {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Arrays.asList(arr).stream().flatMapToInt(Arrays::stream)
        .forEach(element -> System.out.println(element));
    }
}
