public class Coordinates {
    // Pythagoras Theorem
    public static double twoPointMeasure(double[] point1, double[] point2){
        return Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));
    }

    // Heron's Formula
    public static double threePointArea(double[] point1, double[] point2, double[] point3){
        double a, b, c, u;
        a = twoPointMeasure(point1, point2);
        b = twoPointMeasure(point2, point3);
        c = twoPointMeasure(point1, point3);
        u = (a+b+c)/2;
        return Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }

    // Quadrilateral as treated two triangles
    public static double fourPointArea(double[] point1, double[] point2, double[] point3, double[] point4){
        return threePointArea(point1,point2,point3)+threePointArea(point1,point3,point4);
    }
}
