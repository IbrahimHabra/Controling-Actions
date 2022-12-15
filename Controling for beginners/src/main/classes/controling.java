package main.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class controling{

    private static JButton main_jButton;
    private static Color color1 = new Color(100, 197, 139, 255);
    private static Color color2 = new Color(147, 117, 255, 255);
    private static int x = 210;
    private static int y = 210;

//UPDATING THE FORM
    private static void changingForm() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {
        }
        JPanel main_jPanel = new JPanel();
        main_jButton = new JButton();
        main_jButton.setBackground(color1);
        main_jPanel.setBounds(15, 15, 455, 435);
        main_jPanel.setBackground(color2);
        main_jButton.setBounds(210, 210, 64, 67);
        main_jPanel.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.add(main_jButton);
        jFrame.add(main_jPanel);
        Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println("start dimension");
        jFrame.setLocation(dimension.width / 2 - jFrame.getWidth() / 2, dimension.height / 2 - jFrame.getHeight() / 2);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            main_jButton.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent evt) {
                    Controling(evt);
                    Controling(evt);
                }

            });

        }
//CONTROLING BY ARROWS
    private static void Controling(KeyEvent evt){
    if (evt.getKeyCode() == KeyEvent.VK_UP ){
        if (y > 0){
            y--;y--;y--;
            main_jButton.setBounds(x, y, 64, 67);}
    }
    if (evt.getKeyCode() == KeyEvent.VK_DOWN){
        if (y < 394){
            y++;y++;y++;
            main_jButton.setBounds(x, y, 64, 67);}
    }
    if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        if (x < 419){
            x++;x++;x++;
            main_jButton.setBounds(x, y, 64, 67);}
    }
    if (evt.getKeyCode() == KeyEvent.VK_LEFT){
        if (x > 0){
            x--;x--;x--;
            main_jButton.setBounds(x, y, 64, 67);}

    }
}
//THE METHOD OF START
    public static void main(String[] args) {
        changingForm();
    }
}
/*|||||||||||||    ||||||||||||||
* |||||||||||||    ||||||||||||||
* |||||||||||||    ||||||||||||||
* ||||||    DEVELOPED BY   ||||||
* ||||||                   ||||||
* ||||||IBRAHIM WASIM HABRA||||||
* ||||||                   ||||||
* ||||||   NO.0988240620   ||||||
* ||||||    SYRIA.ALEPPO   ||||||
* |||||| 2018/12/31        ||||||
* |||||||||||||    ||||||||||||||
* |||||||||||||    ||||||||||||||
* |||||||||||||    ||||||||||||||
* */
