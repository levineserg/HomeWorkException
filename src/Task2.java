public class Task2 {
    public static void main(String[] args) {


        try {
            int[] intArray = {1, 2, 3, 4, 5};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }


    }
}
