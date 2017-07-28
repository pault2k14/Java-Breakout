/**
 * Created by Paul on 7/26/2017.
 */

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Paddle extends Sprite implements Commons {

    private int dx;

    public Paddle() {

        ImageIcon ii = new ImageIcon("paddle.png");
        image = ii.getImage();

        i_width = image.getWidth(null);
        i_height = image.getHeight(null);

        resetState();
    }

    public void move() {

        x += dx;

        if(x <= 0) {
            x = 0;
        }

        if(x >= WIDTH - 65) {
            System.out.println("i_width: " + i_width);
            x = WIDTH - 65;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT) {
                dx = -1;
        }

        if(key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if(key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    private void resetState() {

        x = INIT_PADDLE_X;
        y = INIT_PADDLE_Y;
    }
}
