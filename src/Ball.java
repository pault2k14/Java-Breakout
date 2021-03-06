/**
 * Created by Paul on 7/26/2017.
 */

import javax.swing.ImageIcon;

public class Ball extends Sprite implements Commons{

    private int xdir;
    private int ydir;

    public Ball() {

        xdir = 1;
        ydir = -1;

        ImageIcon ii = new ImageIcon("ball.png");
        image = ii.getImage();

        i_width = image.getWidth(null);
        i_height = image.getHeight(null);

        resetState();
    }

    public void move() {

        x += xdir;
        y += ydir;

        if(x == 0) {
            setXDir(1);
        }

        if(x == WIDTH - 25) {
            setXDir(-1);
        }

        if(y == 0) {
            setYDir(1);
        }
    }

    private void resetState() {
        x = INIT_BALL_X;
        y = INIT_BALL_Y;
    }

    public void setXDir(int x) {
        xdir = x;
    }

    public void setYDir(int y) {
        ydir = y;
    }

    public int getYDir() {
        return ydir;
    }
}
