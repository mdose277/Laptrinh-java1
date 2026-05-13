package community.ni;
import java.util.Scanner;



public class Bai1 {
	// Hàm tìm UCLN
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm kiểm tra số hoàn thiện
    public static boolean soHoanThien(int n) {
        int tong = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // Hàm kiểm tra toàn chữ số chẵn
    public static boolean toanChan(int n) {
        while (n > 0) {
            int so = n % 10;

            if (so % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    // Hàm tính giai thừa
    public static long giaiThua(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // Hàm tính S(x,n)
    public static double tinhS(double x, int n) {
        double s = x;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, 2 * i + 1) / giaiThua(2 * i + 1);
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Tìm UCLN
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + ucln(a, b));

        // 2. Kiểm tra số hoàn thiện
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (soHoanThien(n)) {
            System.out.println(n + " la so hoan thien");
        } else {
            System.out.println(n + " khong phai so hoan thien");
        }

        // 3. Kiểm tra toàn số chẵn
        System.out.print("Nhap so can kiem tra: ");
        int k = sc.nextInt();

        if (toanChan(k)) {
            System.out.println("Toan chu so chan");
        } else {
            System.out.println("Khong phai toan chu so chan");
        }

        // 4. Tính S(x,n)
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap n: ");
        int m = sc.nextInt();

        System.out.println("S(x,n) = " + tinhS(x, m));

        sc.close();
    }

}
