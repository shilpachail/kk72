public class n1 {
    public static void main(String[] args) {
        int arr[] = {3, 0};

        try {
            int i = arr[0] / arr[1];
            System.out.println("Result: " + i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}


