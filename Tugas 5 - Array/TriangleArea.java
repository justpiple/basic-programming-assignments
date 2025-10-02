import java.util.Scanner;

public class TriangleArea {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
    double[][] points = new double[3][2];
    for (int i = 0; i < 3; i++) {
      points[i][0] = input.nextDouble(); // x
      points[i][1] = input.nextDouble(); // y
    }

    double area = getTriangleArea(points);

    if (area == 0) {
      System.out.println("The three points are on the same line");
    } else {
      System.out.println("The area of the triangle is " + area);
    }

    input.close();
  }

  public static double getTriangleArea(double[][] points) {
    double x1 = points[0][0];
    double y1 = points[0][1];
    double x2 = points[1][0];
    double y2 = points[1][1];
    double x3 = points[2][0];
    double y3 = points[2][1];

    double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

    double s = (a + b + c) / 2;

    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    if (Double.isNaN(area)) {
      return 0;
    }

    return area;
  }
}
