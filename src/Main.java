import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner sx1 = new Scanner(System.in);
        Scanner sy1 = new Scanner(System.in);
        Scanner sz1 = new Scanner(System.in);

        double x1 = sx1.nextDouble();
        double y1 = sy1.nextDouble();
        double z1 = sz1.nextDouble();

        Scanner sx2 = new Scanner(System.in);
        Scanner sy2 = new Scanner(System.in);
        Scanner sz2 = new Scanner(System.in);

        double x2 = sx2.nextDouble();
        double y2 = sy2.nextDouble();
        double z2 = sz2.nextDouble();

        Scanner sx3 = new Scanner(System.in);
        Scanner sy3 = new Scanner(System.in);
        Scanner sz3 = new Scanner(System.in);

        double x3 = sx3.nextDouble();
        double y3 = sy3.nextDouble();
        double z3 = sz3.nextDouble();

        Point3D point1 = new Point3D(x1,y1,z1);
        Point3D point2 = new Point3D(x2,y2,z2);
        Point3D point3 = new Point3D(x3,y3,z3);

        Point3D point4 = new Point3D();

        if (!point1.isEqual(point2) && !point2.isEqual(point3)&&!point1.isEqual(point3))
            System.out.println(Point3D.computeArea(point1,point2,point3));
        else
            System.out.println("Введены неверные данные");
    }
}
