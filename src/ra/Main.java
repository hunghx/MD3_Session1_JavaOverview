package ra;

import java.util.Date;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a; // khai báo biến a có kiểu dữ liệu int
        a = 1000 ; // gán giá trị cho biến
        Integer b  = null;// vừa khai báo vừa gán giá trị  // chưa các hàm

        // khởi tạo đối tượng
        Date date = new Date() ; // jvm sẽ cấp phát vùng nhớ động
        // cho biến khởi tạo thng qua từ khóa new
        System.out.println("Giá trị của a = "+a);
        System.out.println("Giá trị của b = "+b);
        System.out.println("Date =>>>>>>"+ date);

        // chuỗi trong java
        String name = "Hồ Xuân Hùng";
        StringBuilder nameBuilder = new StringBuilder(name);
//        name += " - 24 tuổi";
        nameBuilder.append(" - 24 tuổi");
        System.out.println(nameBuilder);

        // đọc dữ liệu nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào tên của bạn : ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập chiều cao cua bạn: ");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.printf("Hello bạn %s , chiều cao của bạn là %.1f",fullName,height);
        // in ra chuỗi lỗi màu đỏ
        System.err.println("\nĐây là lỗi");

        // Lưu ý : nuốt dòng : nhập số => nhập chuỗi
        // scanner.nextLine();
        String description = scanner.nextLine();
        System.out.println(description); //""
    }
}