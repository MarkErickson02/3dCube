/* File: Basic3D.java
*  Authors: Mark Erickson, Kevin Kuhlman, Karen Cheung
*  Class: CS 445 Computer Graphics
*  Assignment: Final Project Checkpoint 1
*  Date Last Modified: 5/3/2016
*  Purpose: This program creates a 3D cube with 6 different colored faces.
 */
package CS445FinalProject;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.glu.GLU;

public class Basic3D {

    private DisplayMode displayMode;
    private FPCamera fp = new FPCamera(0.0f, 0.0f, 0.0f);

    // Method: start
    // Purpose: This method calls the create window and initGL methods to draw the scene.
    public void start() {
        try {
            createWindow();
            initGL();
            fp.gameLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method: createWindow
    // Purpose: This method sets the title and size of the window
    private void createWindow() throws Exception {
        Display.setFullscreen(false);
        DisplayMode d[] = Display.getAvailableDisplayModes();
        for (int i = 0; i < d.length; i++) {
            if (d[i].getWidth() == 640 && d[i].getHeight() == 480 && d[i].getBitsPerPixel() == 32) {
                displayMode = d[i];
                break;
            }
        }
        Display.setDisplayMode(displayMode);
        Display.setTitle("CS 445 Checkpoint 1");
        Display.create();

    }

    // Method: initGL
    // Purpose: This method sets various options for openGL
    private void initGL() {
        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        GLU.gluPerspective(100.0f, (float) displayMode.getWidth() / (float) displayMode.getHeight(), 0.1f, 300.0f);
        glMatrixMode(GL_MODELVIEW);
        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
    }

    // Method: main
    // Purpose: The start point of the program. 
    public static void main(String[] args) {
        Basic3D basic = new Basic3D();
        basic.start();
    }
}
