import java.util.Scanner;

public class BasicMaths {
    public static void digitExtraction(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            System.out.println(lastDigit);
        }
    }

    public static int evenlyDivides(int N) {
        int tempNo = N;
        int count = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit != 0 && tempNo % digit == 0) {
                count++;
            }
            N = N / 10;
        }
        return (count);
    }

    public static int reverse(int x) {
        int revNo = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            if (revNo > Integer.MAX_VALUE / 10 || (revNo == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (revNo < Integer.MIN_VALUE / 10 || (revNo == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }
            revNo = revNo * 10 + lastDigit;
        }
        return (revNo);
    }

    public static boolean palindrome(int n) {
        if (n < 0) {
            return false;
        }
        int orgNo = n;
        int revNo = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            revNo = revNo * 10 + lastDigit;
            n = n / 10;
        }
        if (revNo == orgNo)
            return true;
        else
            return false;
    }

    public static boolean armstrongNo(int n) {
        int orgNo = n;
        int armNo = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            armNo = armNo + lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }
        if (orgNo == armNo) {
            return true;
        } else
            return false;
    }

    public static void divisors(int n) {
        if (n <= 0) {
            System.out.println("Please give a valid positive integer");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }

        }
    }

    public static void prime(int n) {
        if (n <= 1) {
            System.out.println("Please give a valid positive integer");
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(n + " - is not a prime no.");
        } else
            System.out.println(n + " - is a prime no.");
    }

    public static void GcdorHcf(int n, int m) {
        if (n <= 0 || m <= 0) {
            System.out.println("Please give a valid positive integer");
            return;
        }
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int gcd = 0;
        for (int i = 1; i <= max; i++) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Gcd or Hcf of " + n + " and " + m + " is - " + gcd);
    }

    public static void EuclideanAlgorithmGcd(int n, int m) {
        if (n <= 0 || m <= 0) {
            System.out.println("Please give a valid positive integer");
            return;
        }
        while (n != 0 && m != 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }
        if (n == 0) {
            System.out.println("GCD is " + m);
        } else {
            System.out.println("GCD is " + n);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            // digitExtraction(n);
            // System.out.println(reverse(n));
            // System.out.println(evenlyDivides(n));
            // System.out.println(palindrome(n));
            // System.out.println(armstrongNo(n));
            // divisors(n);
            // prime(n);
            // GcdorHcf(n, m);
            EuclideanAlgorithmGcd(n, m);
        }
    }
}
