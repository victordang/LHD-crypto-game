import javax.swing.*;
import java.awt.*;

/**
 * Created by Victor on 12/2/17.
 */
public class game {


    public game(){

    }

    public void play()  {
        JFrame frame = new JFrame("");
        frame.setLayout(new BorderLayout());

        gamePanel GamePanel = new gamePanel();
        frame.add(GamePanel,BorderLayout.CENTER);

        frame.setUndecorated(true);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }


    public void playMed(){
        JFrame frame = new JFrame("");
        frame.setLayout(new BorderLayout());

        gamePanelMed GamePanelMed = new gamePanelMed();
        frame.add(GamePanelMed,BorderLayout.CENTER);
        frame.setUndecorated(true);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }




    public void playHard(){
        JFrame frame = new JFrame("");
        frame.setLayout(new BorderLayout());
        gamePanelHard GamePanelHard = new gamePanelHard();
        frame.add(GamePanelHard,BorderLayout.CENTER);
        frame.setUndecorated(true);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
