public class Test {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
//            System.out.println("arr[6 = " + arr[6]);
//            arr[6] = 4;
//            int data = 0;
//            int div = 10 / data;
//            System.out.println("Average = " + div);

            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");
    }
}
