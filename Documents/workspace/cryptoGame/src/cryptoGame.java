import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * Created by Victor on 12/2/17.
 */
public class cryptoGame {

    //instance variables
    private static JButton play = new JButton("Play");
    private static JButton quit = new JButton("Quit");

public static void main (String[] args){

    JFrame frame = new JFrame("Million dollar crypto challenge");
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setBackground(Color.black);
    ImageIcon image = new ImageIcon("");
    ImagePanel panel = new ImagePanel(Color.black, image);
    Container container = frame.getContentPane();
    container.add(panel);
    init();




    panel.add(play);
    panel.add(quit);


    frame.add(panel);
    frame.setVisible(true);
    frame.setResizable(true);

    final JPopupMenu menu = new JPopupMenu();
    JMenuItem easy = new JMenuItem("Easy");
    JMenuItem medium = new JMenuItem("Medium");
    JMenuItem hard = new JMenuItem("Hard");
    menu.add(easy);
    menu.add(medium);
    menu.add(hard);





    play.addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
            if (e.getButton() == 1) {
                menu.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    });

    easy.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == easy)
            {
                game start = new game();
                start.play();

            }
        }
    });

    medium.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == medium)
            {
                game start = new game();
                start.playMed();

            }
        }
    });



    hard.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == hard)
            {
                game start = new game();
                start.playHard();

            }
        }
    });









}//end of main






    private static void init() {
        /*play.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == play)
                {
                    game start = new game();
                    start.play();
                }
            }
        }
        );

        */






        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == quit) {
                    System.exit(0);
                }
            }
        }
        );




    }//end of init











}
