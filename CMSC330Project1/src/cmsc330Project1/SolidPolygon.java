package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines all solid polygons
 * It is similar to HollowPolygon, but includes a step to fill in the polygon
 */

class SolidPolygon extends Polygon {
	
	private static final long serialVersionUID = 1L;
			
			// Constructor that calls super constructor
			public SolidPolygon(Color color, int vertexCount) {
		super();
		}
	
	public void drawPolygon(Graphics graphics, Polygon polygon) {
		graphics.drawPolygon(polygon);
        graphics.fillPolygon(polygon);
    }
}