import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนยอดขาย: ");
        double sales = sc.nextDouble();

        double commission;

        if (sales <= 0) {
            commission = 0;
        } else if (sales <= 5000) {
            commission = sales * 0.05;
        } else if (sales <= 10000) {
            commission = sales * 0.10;
        } else if (sales <= 20000) {
            commission = sales * 0.15;
        } else {
            commission = sales * 0.20;
        }

        System.out.println("ยอดขาย: " + sales + " บาท");
        System.out.println("ค่าคอมมิชชั่น: " + commission + " บาท");
    }
}
