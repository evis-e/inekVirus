import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class VDialog extends JDialog {
    public VDialog() {
        setSize(250, 250);
        setUndecorated(true); // remove the window bar
        // the following lines of code calculate a random coordinate to position the dialog
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        Random rn = new Random();
        int xPos = rn.nextInt(width-250);
        int yPos = rn.nextInt(height-250);
        this.setLocation(xPos, yPos);

        // set transparent background color
        Color c = new Color(0, 0, 0, 0);
        setBackground(c);

        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addKeyListener(new MKeyListener());
        // put the image of the cow
        try {
            this.add(new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/resources/cow_rszd.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pack();
        setVisible(true);
    }
    class MKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent event){
            char ch = event. getKeyChar();
            if(ch == 'i'){  // if the user presses the i key
                dispose();    // close the window
            }
        }
    }
}