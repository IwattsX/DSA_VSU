public class generics {

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        double intSum = getSum(intArray);
        System.out.println("Sum of integers: " + intSum);

        String[] stringArray = { "Hello", " ", "World" };
        String Hey = getSum(stringArray);
        System.out.println(Hey);

    }

    //extends Number so I can get java.lang 
    public static <T extends Number> double getSum(T[] array) {
        double res = 0.0;

        for (T element : array) {
            res += element.doubleValue();
        }

        return res;
    }

    public static String getSum(String[] array) {
        StringBuilder res = new StringBuilder();

        for (String element : array) {
            res.append(element);
        }

        return res.toString();
    }
}
