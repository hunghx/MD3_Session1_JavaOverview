package ra;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        // Khai báo tỉ giá
        float tyGia = 24382.5f;
        // nhập vào số tiên
        System.out.println("Nhập USD muốn đổi");
        float usd = (new Scanner(System.in)).nextFloat();
        // tính toán
        float vnd = usd*tyGia;
        System.out.printf("%f usd = %.1f vnd",usd,vnd);
        
    }
}
