/**
 * Created by Paul on 7/26/2017.
 */

import java.awt.EventQueue;
import javax.swing.*;

public class Breakout extends JFrame {

    public Breakout() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setTitle("Breakout");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Breakout game = new Breakout();
                game.setVisible(true);
            }
        });
    }























}
