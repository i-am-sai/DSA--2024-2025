public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(13));

        int m = 132;
        checkPRime(m);
        System.out.println(isPrime(m));
    }

    public static void checkPRime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " : is not a Prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " : is not a Prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " : is a Prime number");
            }
        }
    }


    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}

