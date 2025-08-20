เกรด

public class TotalScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double midterm, finalExam, report, total;

        System.out.print("กรอกคะแนนกลางภาค: ");
        midterm = sc.nextDouble();

        System.out.print("กรอกคะแนนปลายภาค: ");
        finalExam = sc.nextDouble();

        System.out.print("กรอกคะแนนรายงาน: ");
        report = sc.nextDouble();

        total = midterm + finalExam + report;

        System.out.println("คะแนนรวมคือ: " + total);

        // เงื่อนไขตัดเกรด
        if(total >= 80){
            System.out.println("เกรด: A");
        } else if(total >= 70){
            System.out.println("เกรด: B");
        } else if(total >= 60){
            System.out.println("เกรด: C");
        } else if(total >= 50){
            System.out.println("เกรด: D");
        } else {
            System.out.println("เกรด: F");
        }

        sc.close();
    }
}
