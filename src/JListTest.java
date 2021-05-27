import javax.swing.*;

public class JListTest {
    public static void main(String[] args) {
        JListTest jListTest = new JListTest();
        jListTest.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String [] list = {"1", "2", "3", "4", "5",};
        JList jList = new JList(list);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        panel.add(jList);

        JScrollPane scrollPane = new JScrollPane(jList);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jList.setVisibleRowCount(3);
        panel.add(scrollPane);
    }
}
