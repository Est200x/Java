import java.util.Scanner;

public class Five {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("wuttiphat mulphathi");
        System.out.println("68317001219");
        System.out.println("19");

        Scanner in =new Scanner(System.in);
        
        int mo;
        int e;
        int et;
        int ot;
        int b;
        int bb;
        int op;
        int wasd;
        int total;
        
        System.out.println("Money:"); mo = in.nextInt();
        System.out.println("water:"); e = in.nextInt();
        System.out.println("eletronices:"); et = in.nextInt();
        System.out.println("OT:"); ot = in.nextInt();
        System.out.println("Diligence allowance:"); b = in.nextInt();
        System.out.println("social security:"); bb = in.nextInt();

        wasd = mo+ot+b;
        op = e-et-bb;
        total = wasd - op;

        System.out.println("revenue:"+wasd);
        System.out.println("expenses:"+op);
        System.out.println("Net income:"+total);
        in.close();
    }
}

