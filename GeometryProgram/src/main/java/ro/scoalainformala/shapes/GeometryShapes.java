package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.Circle;
import ro.scoalainformala.shapes.domain.Triangle;

import java.util.Scanner;

/**OOD(Oriented Object Design)
 * Characteristics of geometry shapes:-triangle: 3 sides of different sizes (l)
 *                                    -rectangle 4 sides : 2 lengths (L) and 2 widths (w)
 *                                    -square: 4 sides (l)
 *                                    -circle: a radius (r)
 *The common actions(behaviours) of shapes:- ability to calculate perimeter:
 *                                                 -triangle -3 x l
 *                                                 -rectangle - (2 x l) + (2 x l)
 *                                                 -square - 4 x l
 *                                                 -circle - (2 x 3.14) x r
 *                                          - ability to calculate area:
 *                                                  -triangle:
 *                                                  -rectangle:L x l
 *                                                  -square:l x l
 *                                                  -circle:  3.14  x r x r
 */
public class GeometryShapes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println ("Introduce the value of x: ");
        double x = s.nextDouble();

        System.out.println ("Introduce the value of y: ");
        double y = s.nextDouble();

        System.out.println ("Introduce the value of z: ");
        double z = s.nextDouble();

        // TODO validate x, y, z

        Triangle myTriangle = new Triangle(x, y, z);
        System.out.println("Perimeter is: " + myTriangle.calculatePerimeter());
    }
}
