package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines a hollow rectangle object
 */

class Rectangle extends HollowPolygon {
	
	// Constructor that initializes the vertices of the rectangle
	public Rectangle(Color color, Point upperLeft, int height, int width) {
        super(color, 4);
        int[] x_points = { upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x };
        int[] y_points = { upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height };
        createPolygon(x_points, y_points);
    }
}