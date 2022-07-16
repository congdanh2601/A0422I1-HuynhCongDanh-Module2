package ss2_loop;

public class ShowPrimesSmallerThan100 {
    public static void main(String[] args) {
        showPrimesSmallerThan(100);
    }

    public static void showPrimesSmallerThan(int number) {
        String result = "";
        for (int i = 2; i < number; i++) {
            if (checkPrime(i)) {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
