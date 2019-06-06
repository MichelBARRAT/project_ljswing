package fr.project.ljswing.window;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = -4070063726936978079L;

    public MainWindow() throws Exception {

        setWindowSize();

        this.setLocationRelativeTo(null);
        this.setTitle("LjHelper");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    /**Set the window size.
    */
    private void setWindowSize() {
        this.setSize(650, 300);
    }
}