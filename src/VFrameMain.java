/**
 * Created by evis on 15/01/11.
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class VFrameMain extends JFrame{
    public VFrameMain(){
        setTitle("Virus successfully installed!");
        setSize(507, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  //the window does not close when X is pressed
        addKeyListener(new MKeyListener()); //the keyListener is used to listen to the "i" key

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new VDialog(); //create a new VDialog object, which is the image of the cow
            }
        });

        VFrameMainDraw draw = new VFrameMainDraw(); //create a new VFrameMainDraw
        add(draw);
        setVisible(true);
    }
    class MKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent event){
            char ch = event. getKeyChar();
            if(ch == 'i'){  //if the user pressed key i
                dispose();   // the window is closed
            }
        }
    }
}