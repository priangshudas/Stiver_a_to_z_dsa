import java.util.Scanner;

public class Code {
    static void pattern1(int n) {
        System.out.println("Pattern 1");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        System.out.println("Pattern 2");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        System.out.println("Pattern 3");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        System.out.println("Pattern 4");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        System.out.println("Pattern 5");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        System.out.println("Pattern 6");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        System.out.println("Pattern 7");
        int i, j, k, l;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            for (l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        System.out.println("Pattern 8");
        int i, j, k, l;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            for (l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        System.out.println("Pattern 9");
        int i, j, k, l;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            for (l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            for (l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        System.out.println("Pattern 10");
        int i, j, k;
        for (i = 1; i <= 2 * n - 1; i++) {
            k = i;
            if (i > n) {
                k = 2 * n - i;
            }
            for (j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        System.out.println("Pattern 11");
        int start = 1;

        // Outer loop for the no. of rows
        for (int i = 0; i < n; i++) {

            // if the row index is even then 1 is printed first
            // in that row.
            if (i % 2 == 0)
                start = 1;

            // if odd, then the first 0 will be printed in that row.
            else
                start = 0;

            // We alternatively print 1's and 0's in each row by using
            // the inner for loop.
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // pattern1(n);
            // pattern2(n);
            // pattern3(n);
            // pattern4(n);
            // pattern5(n);
            // pattern6(n);
            // pattern7(n);
            // pattern8(n);
            // pattern9(n);
            // pattern10(n);
            pattern11(n);
        }
    }
}