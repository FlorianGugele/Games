package at.guf.games.fistgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class Rectangles {


    private enum DIRECTION {RIGHT,DOWN,LEFT,UP};
    private float x;
    private float y;
    private float speed;

    public Rectangles(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render (Graphics graphics){
        graphics.drawRect(this.x,this.y,10,10 );
    }
    public void update (int delta){
        this.x += (float)delta/speed;
        if (this.x>600){
            this.x=0;
        }
    }
}
