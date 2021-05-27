import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Component {
    public static void main(String[] args) {
        JFrame jf = new JFrame("1");
        jf.setSize(200,200);
        jf.setVisible(true);
        jf.add(new Board());


    }
}
class Board extends JPanel{
    @Override
    public void paintComponent(Graphics g){    //аргумент Graphics является холстом для рисования
//        super.paintComponent(g);
//        drow(g);
//        JButton button = new JButton("1");
//    }
//    public void drow(Graphics g){
//        Graphics2D g2d = (Graphics2D)g;    //Преобразование графикс в графикс2Д
//        g2d.setColor(Color.red);
//        g2d.drawLine(0, 0, getHeight(), getWidth());
//


        Image image = new ImageIcon().getImage();
        try {
            image = ImageIO.read(new URL("ссылка на картинку в интернете"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image, 15, 15, this);
    }
}



