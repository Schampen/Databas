import java.awt.event.ActionListener;
import javax.swing.*;
public class SoloView extends JFrame {
    private JTextField story = new JTextField(10);
    private JLabel label = new JLabel("-");
    private JTextField choices = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    SoloView() {
        // Sets up the view and adds the components
        JPanel soloPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        soloPanel.add(story);
        soloPanel.add(label);
        soloPanel.add(choices);
        soloPanel.add(calculateButton);
        soloPanel.add(calcSolution);
        this.add(soloPanel);
        // End of setting up the components --------
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}