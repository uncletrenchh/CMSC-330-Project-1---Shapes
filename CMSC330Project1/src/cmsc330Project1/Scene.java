package cmsc330Project1;

import javax.swing.*;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class defines a scene
 */

class Scene {

    private JFrame window;
    private DrawingPanel drawing;

    // Constructor that must be supplied the height and width of the drawing window for the scene
    public Scene(String name, int height, int width) {
        window = new JFrame(name);
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing = new DrawingPanel();
        window.add(drawing);
    }

    // Adds a graphic object to the scene's drawing panel
    public void addImage(Image image) {
        drawing.addImage(image);
    }

    // Causes the drawing panel to be repainted
    public void draw() {
        window.setVisible(true);
        drawing.repaint();
    }

	public void addImage(IsoscelesTriangle isoscelesTriangle) {
		// TODO Auto-generated method stub
		
	}

	public void addImage(Parallelogram parallelogram) {
		// TODO Auto-generated method stub
		
	}

	public void addImage(RegularPolygon regularPolygon) {
		// TODO Auto-generated method stub
		
	}
}
