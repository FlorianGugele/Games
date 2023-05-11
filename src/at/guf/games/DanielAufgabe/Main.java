package at.guf.games.DanielAufgabe;

import at.guf.games.fistgame.Rectangles;
import org.newdawn.slick.*;

public class Main extends BasicGame {

    private float x;
    private float y;
    private float speed;




    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.y=100;
        this.speed=40.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.y += (float)i/this.speed;
        if (this.y >= 600){
            this.y -= (float)i/this.speed;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
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
