import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class GUiTest2 extends JFrame {

    private JButton button = new JButton("click");            //создаем кнопку
    private JTextField input = new JTextField("asd", 5); //создаем поле для ввода текста
    private JLabel label = new JLabel("Введите свое имя");    //Подпись для поля ввода
    private JRadioButton radio1 = new JRadioButton("yes");    //Кнопки с возможностью выбора
    private JRadioButton radio2 = new JRadioButton("no");
    private JCheckBox checkBox = new JCheckBox("agree", false);//Ставим галочку или нет

    GUiTest2() {
        super("Окно");  //название окна//вызываем конструктор нашего основного классам JFrame, работает и без него
        this.setBounds(200, 100, 250, 100);  //отступы от границ экрана и размеры окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //закрываем окно после выполнени операции

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));  //Размеры не понятно чего...
        container.add(label);
        container.add(input);

        ButtonGroup group= new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);          //помещаем в контейнер все наши кнопки и записи
        radio1.setSelected(true);
        container.add(radio2);
        container.add(checkBox);
        button.addActionListener(new ButtonEventListener());  //Позволяет вызвать класс в котором будет реализация
        container.add(button);                                //действия, а именно нажатия на кнопку
    }                                                         //прописываем в ней новый класс, который будем вызывать

    class ButtonEventListener implements ActionListener{  //реализует интерфейс, это стандартно
        public void actionPerformed(ActionEvent e) {      //тоже по определению
            String masage = "";       //создаем пустую строку и добавляем к ней все, что ниже, как с числами...
            masage = " " + "Button was pressed \n";
            masage += "Text is: " + input.getText() + "\n";
            masage += (radio1.isSelected() ? "radio1" : "radio2") + " is Selected" + "\n";
            masage += (checkBox.isSelected() ? "cheked" : "unChecked") + "\n";
            JOptionPane.showMessageDialog(null, masage, "Output", JOptionPane.PLAIN_MESSAGE);
            //Благодаря последней записи, выводим сообщения в новом окне
            button.setText("меняется текст кнопки после нажатия");
        }
    }
}

class Main {
    public static void main(String[] args) {
        GUiTest2 a = new GUiTest2();
        a.setVisible(true);
    }
}

