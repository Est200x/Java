หาพื้นที่วงกลม

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่ารัศมีจากผู้ใช้
        System.out.print("กรอกรัศมีของวงกลม: ");
        double radius = scanner.nextDouble();

        // คำนวณพื้นที่ (สูตร: πr²)
        double area = Math.PI * Math.pow(radius, 2);

        // แสดงผลลัพธ์
        System.out.println("พื้นที่ของวงกลมคือ: " + area);

        scanner.close();
    }
}
