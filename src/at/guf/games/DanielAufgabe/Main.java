package at.guf.games.DanielAufgabe;

import at.guf.games.fistgame.Rectangles;
import org.newdawn.slick.*;

public class Main extends BasicGame {

    private float x;
    private float y;
    private float speed;
    private boolean IsDown;

    private float xc;
    private float yc;
    private boolean IsRight;




    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.y=100;
        this.speed=10.0f;
        this.IsDown = true;
        this.xc = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        if (this.y >= 100 && IsDown == false){
            this.y -= (float)i/this.speed;
        }else {
            IsDown = true;
        }

        if (this.y<= 600 && IsDown == true){
            this.y += (float)i/this.speed;
        }else {
            IsDown = false;
        }

        if (this.xc >= 100 && IsRight==false){
            this.xc -= (float)i/this.speed;
        }else{
            IsRight=true;
        }

        if (this.xc<=800 && IsRight==true){
            this.xc += (float)i/this.speed;
        } else{
          IsRight=false;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawOval(this.xc,this.yc,50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("DanielwillSpiel"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
