import java.awt.event.ActionListener;
import javax.swing.*;

public class SoloView extends JFrame{

    private JLabel story = new JLabel();
    private JLabel what = new JLabel("What do you do");
    private JButton choice1 = new JButton();
    private JButton choice2 = new JButton();
    private JButton choice3 = new JButton();

    SoloView() {

        JPanel gamePanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);

        gamePanel.add(story);
        gamePanel.add(what);
        gamePanel.add(choice1);
        gamePanel.add(choice2);
        gamePanel.add(choice3);

        this.add(gamePanel);
    }


}
