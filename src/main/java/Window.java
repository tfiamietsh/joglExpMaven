import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class Window implements GLEventListener {
    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        //  method body
    }
    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {
        //  method body
    }
    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        //  method body
    }
    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {
        //  method body
    }
    public static void main(String[] args) {
        final GLProfile profile = GLProfile.get(GLProfile.GL4);
        GLCapabilities capabilities = new GLCapabilities(profile);

        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Window b = new Window();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);

        final JFrame frame = new JFrame ("Mere Black Window");
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }
}
