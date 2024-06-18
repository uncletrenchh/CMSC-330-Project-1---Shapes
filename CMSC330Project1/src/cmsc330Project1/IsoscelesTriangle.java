package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class that defines a solid IsoscelesTriangle object
 */

class IsoscelesTriangle extends SolidPolygon {

	private static final long serialVersionUID = 1L;

	// Constructor that initializes the vertices of the IsoscelesTriangle
    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color, 3);
        int[] x_points = { topVertex.x, topVertex.x - (width / 2), topVertex.x + (width / 2) };
        int[] y_points = { topVertex.y, topVertex.y + height, topVertex.y + height };
        drawPolygon(x_points, y_points);
    }

	private void drawPolygon(int[] x_points, int[] y_points) {
		// TODO Auto-generated method stub
		
	}
}		