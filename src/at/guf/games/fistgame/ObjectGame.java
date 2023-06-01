package at.guf.games.fistgame;

import org.newdawn.slick.*;

public class ObjectGame extends BasicGame {
    private Rectangles rectangles;

    public ObjectGame (String title){
        super(title);
    }

    @Override
        public void init(GameContainer gameContainer) throws SlickException{
            this.rectangles = new Rectangles(100,100,5);
        }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException{
        this.rectangles.update(delta);
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException{
        this.rectangles.render(graphics);
    }

}
