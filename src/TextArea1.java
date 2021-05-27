import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea1 implements ActionListener {

    public static void main(String[] args) {
        TextArea1 textArea1 = new TextArea1();
        textArea1.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click");
        button.addActionListener(this);
        JTextArea text = new JTextArea(10, 20);
        text.setLineWrap(true);             //перенос текста

        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scrollPane);
        frame.add(BorderLayout.CENTER, panel);
        frame.add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, null, "", JOptionPane.PLAIN_MESSAGE);
    }
}
