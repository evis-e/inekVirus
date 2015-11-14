/**
 * Created by evis on 15/01/11.
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VFrame extends JFrame {
    //this is the first window that asks the user to install the virus
    public VFrame(){
        setTitle("Installing Inek Virus");
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);  //position it in the middle of the screen
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //when the X button is clicked the window does not close

        JPanel pnl = new JPanel();
        pnl.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel pnl3 = new JPanel();
        pnl3.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Inek Virus will be installed in your computer.");
        lbl.setFocusable(true);
        pnl3.add(lbl);

        JPanel pnl2 = new JPanel();
        pnl2.setLayout(new FlowLayout());
        JButton btn = new JButton("Next >");
        btn.setSize(30, 10);
        btn.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                VFrameMain vfm = new VFrameMain(); //creates a new VFrameMain object
                dispose();    // closes the current window
            }
        });
        pnl2.add(btn);
        pnl.add(pnl3);
        pnl.add(pnl2);
        add(pnl);
        setVisible(true);
    }
    public static void main(String[] args){
        new VFrame();   //creates a new VFrame object
    }
}