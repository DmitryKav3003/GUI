import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        BorderLayoutTest borderLayoutTest = new BorderLayoutTest();
        borderLayoutTest.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("North");
        JButton button1 = new JButton("South");
        JButton button2 = new JButton("West");
        JButton button3 = new JButton("East");
        JButton button4 = new JButton("Center");

        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.WEST, button2);
        frame.getContentPane().add(BorderLayout.EAST, button3);
        frame.getContentPane().add(BorderLayout.CENTER, button4);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}

