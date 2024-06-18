/**
 * 
 */
package cmsc330Project1;

import java.awt.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines a Text object
 */

class Text_ extends Image {
    private Point vertex;
    private String text;
    private Color color;

    // Constructor that initializes the vertices, text, and color of the text
    public Text_(Color color, Point vertex, String text) {
        super(color);
        this.color = color;
        this.vertex = vertex;
        this.text = text;
    }

    // Sets correct color and draws text object
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.drawString(text, vertex.x, vertex.y);
    }
}
