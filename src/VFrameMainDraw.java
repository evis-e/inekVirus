/**
 * Created by evis on 15/01/11.
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class VFrameMainDraw extends JPanel{
    private BufferedImage image;
    public VFrameMainDraw() {
        URL resource = getClass().getResource("/resources/cow.png");
        // set the image in the window
        try {
            image = ImageIO.read(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
}