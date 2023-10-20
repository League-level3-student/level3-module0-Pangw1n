package _00_Intro_To_Arrays;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _03_FindTheHiddenButton implements ActionListener{
    JFrame window;
    JPanel panel;

    // 1. create an array of JButtons. Don't initialize it yet.
    JButton[] Buttons;
    // 2. create an integer variable called hiddenButton
    int hiddenButton;
    public static void main(String[] args) throws InterruptedException {
        new _03_FindTheHiddenButton().start();
    }

    public void start() throws InterruptedException {
        window = new JFrame("Find the Button");
        panel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Ask the user to enter a positive number and convert it to an int
        int size = Integer.parseInt(JOptionPane.showInputDialog("Input A Size"));
        // 4. Initialize the array of JButtons to be the size of the int
        //    created in step 3
        Buttons = new JButton[size];
        // 5. Make a for loop to iterate through the JButton array
        for (int i = 0; i < Buttons.length; i++)
        {
            // 6. initialize each JButton in the array
        	Buttons[i] = new JButton();
            // 7. add the ActionListener to each JButton
        	Buttons[i].addActionListener(this);
            // 8. add each JButton to the panel
        	panel.add(Buttons[i]);
        }
        // 9 add the panel to the window
        window.add(panel);
        // 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // 11. set the JFrame to visible.
        window.setVisible(true);
        // 12. Give the user the instructions for the game.
        JOptionPane.showMessageDialog(null, "Click on the button that flashes");
        // 13. initialize the hiddenButton variable to a random number less than
        //     the int created in step 3
        hiddenButton = new Random().nextInt(size);
        System.out.println(hiddenButton);
        // 14. Set the text of the JButton located at hiddenButton to read "ME"
        Buttons[hiddenButton].setText("ME");
        // 15. Use Thread.sleep(100); to pause the program.
        Thread.sleep(100);
        // 16. Set the text of the JButton located at hiddenButton to be blank.
        Buttons[hiddenButton].setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();

        // 17. if the hiddenButton is clicked, tell the user that they win.
        if (buttonClicked == Buttons[hiddenButton])
        {
        	JOptionPane.showMessageDialog(null, "Correct");
        }
        // 18. else tell them to try again
        else
        {
        	JOptionPane.showMessageDialog(null, "Try Again");
        }
    }
}
