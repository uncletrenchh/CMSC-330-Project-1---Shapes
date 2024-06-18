package cmsc330Project1;

import java.awt.*;
import java.lang.Math;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class that defines a Solid RegularPolygon object
 * It uses calculus/geometry to calculate coordinates for any number of sides
 */

class RegularPolygon extends SolidPolygon {
	
	private static final long serialVersionUID = 1L;

    // Constructor that initializes the vertices of the RegularPolygon given the center, number of sides, and radius
    public RegularPolygon(Color color, Point center, int numSides, int radius) {
        super(color, numSides);

        double angle = (2 * Math.PI) / numSides;
        int[] x_points = new int[numSides + 1]; 
        int[] y_points = new int[numSides + 1];

        int index = 0; // keep track for filling in int[]
        // start at 0; don't go past a full 2pi rotation; get to the next angle
        for (double currentAngle = 0; currentAngle < (2 * Math.PI); currentAngle += angle) {
            // cosine of the angle, offset by radius and center -> x coord
            x_points[index] = (int) (radius * Math.cos(currentAngle) + center.x);
            // sine of the angle, offset by radius and center -> y coord
            y_points[index] = (int) (radius * Math.sin(currentAngle) + center.x);
            index += 1;
        }

        createPolygon(x_points, y_points);
    }

	private void createPolygon(int[] x_points, int[] y_points) {
		// TODO Auto-generated method stub	
	}
}
