package view;

import javax.swing.*;
import java.awt.*;

public class CounterView extends JFrame {
    private JLabel clickCountLabel = new JLabel("0");
    private JButton incrementButton = new JButton("Increment");
    private JButton resetButton = new JButton("Reset");
    private JButton decrementButton = new JButton("Decrement");

    public CounterView(int x, int y){
        setTitle("Click Counter");
        setSize(x, y);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(incrementButton);
        add(clickCountLabel);
        add(decrementButton); //Moved the positions of the buttons for more intuitiveness.
        add(resetButton);
        setVisible(true);
    }

    public JLabel getClickCountLabel() {
        return clickCountLabel;
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getResetButton(){
        return resetButton;
    }

    public JButton getDecrementButton(){ return decrementButton; }
}
