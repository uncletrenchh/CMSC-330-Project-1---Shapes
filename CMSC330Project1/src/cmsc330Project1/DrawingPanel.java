package cmsc330Project1;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines the panel for drawing the images
 */

class DrawingPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Image> images = new ArrayList<>();

    /*
     * Adds a graphic object to the drawing panel
     */
    public void addImage(Image image) {

        images.add(image);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Image image : images)
            image.draw(graphics);
    }
}
