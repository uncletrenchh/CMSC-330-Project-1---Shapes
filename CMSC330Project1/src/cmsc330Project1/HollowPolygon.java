/**
 * 
 */
package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class that defines all hollow polygons
 */

class HollowPolygon extends Polygon_ {

    // Constructor that calls super constructor
    public HollowPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
    }
}
