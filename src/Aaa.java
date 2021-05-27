import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aaa {

    public static void main(String[] args) {
        Aaa aaa = new Aaa();
        aaa.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(BorderLayout.CENTER, panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        JButton button = new JButton("Click");
        panel.setBackground(Color.green);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Введите свое имя");    //Подпись для поля ввода
        JRadioButton radio1 = new JRadioButton("yes");    //Кнопки с возможностью выбора
        JRadioButton radio2 = new JRadioButton("no");
        JCheckBox checkBox = new JCheckBox("agree", false);//Ставим галочку или нет
        JTextField input = new JTextField("", 5);

        JTextArea textArea = new JTextArea(10, 12);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        textArea.setLineWrap(true);
        panel.add(scrollPane);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        radio1.setSelected(true);

        panel.add(label);
        panel.add(input);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(checkBox);
        panel.add(button);

        button.addActionListener(new Cvc(button, checkBox, input, radio1, textArea));

//        String onOrOff = "off";
//        if (checkBox.isSelected()) onOrOff = "on";
//        System.out.println(checkBox + onOrOff);


    }
}

class Cvc implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    JTextField input;
    JRadioButton radio1;
    JTextArea area;
    Cvc(JButton button, JCheckBox checkBox, JTextField input, JRadioButton radio1, JTextArea area){
        this.button = button;
        this.checkBox = checkBox;
        this.input = input;
        this.radio1 = radio1;
        this.area = area;
    }
    public void actionPerformed(ActionEvent e) {
        String ms;
        ms = "Hi\n";
        ms += "Text is: " + input.getText() + "\n";
        ms += (radio1.isSelected() ? "radio1" : "radio2") + " is Selected" + "\n";
        ms += (checkBox.isSelected() ? "cheked" : "unChecked") + "\n";
        ms += area.getText();
        area.append("");
        JOptionPane.showMessageDialog(null, ms, "", JOptionPane.PLAIN_MESSAGE);
        button.setText("Спасибо конструктору");
    }
}

