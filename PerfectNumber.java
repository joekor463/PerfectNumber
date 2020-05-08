public class PerfectNumber {
    public static void main(String args[]) {
        System.out.println ( isPerfectNumber ( 9 ));

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int pNumber = 0;
        int ostatok = 0;

        for (int i = 1; i <= number; i++) {
            ostatok = number % i;
            if (ostatok == 0) {
                pNumber = pNumber + i;
                //System.out.println (pNumber);
            }
            if (pNumber == number) return true;
        }
        return false;
    }
}
