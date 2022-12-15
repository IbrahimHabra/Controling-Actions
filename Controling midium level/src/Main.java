import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Tutorial tutorial = new Tutorial();
        JFrame jFrame = new JFrame("hi");
        jFrame.setSize(600,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(tutorial);
    }
}
