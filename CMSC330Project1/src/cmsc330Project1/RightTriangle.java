package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: Nove,ber 14, 2023
 * Description: This class defines a hollow right triangle
 */

class RightTriangle extends HollowPolygon {

    // Constructor that initializes the vertices of the right triangle
    public RightTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = { upperLeft.x, upperLeft.x, upperLeft.x + width };
        int[] y_points = { upperLeft.y, upperLeft.y + height, upperLeft.y + height };
        createPolygon(x_points, y_points);
    }
}