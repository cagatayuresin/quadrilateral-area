import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Please select:\nLine measure -> (1)\nTriangle area -> (2)\nQuadrilateral area -> (3)\nExit -> (0)");
        byte choice = kb.nextByte();

        switch (choice) {
            case 1 -> choice1();
            case 2 -> choice2();
            case 3 -> choice3();
            default -> System.exit(0);
        }
    }

    public static void choice1(){
        Scanner kb = new Scanner(System.in);
        double[] point1 = new double[2], point2 = new double[2];
        System.out.println("Line measure selected!");
        System.out.print("Point 1 x: ");
        point1[0] = kb.nextDouble();
        System.out.print("Point 1 y: ");
        point1[1] = kb.nextDouble();
        System.out.print("Point 2 x: ");
        point2[0] = kb.nextDouble();
        System.out.print("Point 2 y: ");
        point2[1] = kb.nextDouble();
        System.out.printf("The measure of the two point is: %f%n",Coordinates.twoPointMeasure(point1,point2));
        main(new String[]{"",""});
    }

    public static void choice2(){
        Scanner kb = new Scanner(System.in);
        double[] point1 = new double[2], point2 = new double[2], point3 = new double[2];
        System.out.println("Triangle area selected!");
        System.out.print("Point 1 x: ");
        point1[0] = kb.nextDouble();
        System.out.print("Point 1 y: ");
        point1[1] = kb.nextDouble();
        System.out.print("Point 2 x: ");
        point2[0] = kb.nextDouble();
        System.out.print("Point 2 y: ");
        point2[1] = kb.nextDouble();
        System.out.print("Point 3 x: ");
        point3[0] = kb.nextDouble();
        System.out.print("Point 3 y: ");
        point3[1] = kb.nextDouble();
        System.out.printf("The area of the triangle is: %f%n",Coordinates.threePointArea(point1,point2,point3));
        main(new String[]{"",""});
    }

    public static void choice3(){
        Scanner kb = new Scanner(System.in);
        double[] point1 = new double[2], point2 = new double[2], point3 = new double[2], point4 = new double[2];
        System.out.println("Quadrilateral area selected!");
        System.out.print("Point 1 x: ");
        point1[0] = kb.nextDouble();
        System.out.print("Point 1 y: ");
        point1[1] = kb.nextDouble();
        System.out.print("Point 2 x: ");
        point2[0] = kb.nextDouble();
        System.out.print("Point 2 y: ");
        point2[1] = kb.nextDouble();
        System.out.print("Point 3 x: ");
        point3[0] = kb.nextDouble();
        System.out.print("Point 3 y: ");
        point3[1] = kb.nextDouble();
        System.out.print("Point 4 x: ");
        point4[0] = kb.nextDouble();
        System.out.print("Point 4 y: ");
        point4[1] = kb.nextDouble();
        System.out.printf("The area of the quadrilateral is: %f%n",Coordinates.fourPointArea(point1,point2,point3,point4));
        main(new String[]{"",""});
    }
}
