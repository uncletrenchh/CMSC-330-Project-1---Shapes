package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines a solid Parallelogram object
 */

class Parallelogram extends SolidPolygon {
	private static final long serialVersionUID = 1L;

    // Constructor that initializes the vertices of the Parallelogram
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
        super(color, 4);
        int[] x_points = { upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset, };
        int[] y_points = { upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y, };
        createPolygon(x_points, y_points);
    }

	private void createPolygon(int[] x_points, int[] y_points) {
		// TODO Auto-generated method stub
		
	}
}