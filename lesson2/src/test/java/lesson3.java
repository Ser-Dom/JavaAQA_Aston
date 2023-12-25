public class lesson3 {
    public static void main(String[] args) {

        boolean a = checkTen(9,2);
        System.out.println(a);

        checkPositive(-2);

        boolean b = retPosOrNeg(7);
        System.out.println(b);

        printText("Строка", 2);

        boolean c = checkYear(2024);
        System.out.println(c);

        int[] d = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeNumb(d);

        int[] array100 = new int[100];
        for (int i = 0; i < 99; i++) {
            array100[i] = 1 + i;
        }

        int[] k = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < k.length; i++) {
            if(k[i] < 6) {
                k[i] = k[i] * 2;
            }
        }

        int[][] bArr = new int[5][5];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i][i] =  1;
            bArr[i][bArr.length - i] =  1;
        }

    }

    public static boolean checkTen(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkPositive(int a) {
        if(a >=0) {
            System.out.println(a + " это положительное число");
        }
        else {
            System.out.println(a + " это отрицательное число");
        }
    }

    public static boolean retPosOrNeg(int a) {
        return a < 0;
    }

    public static void printText(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkYear(int a) {
        return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
    }

    public static void changeNumb(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] a = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            a[i] = initialValue;
        }
        return a;
    }
}
