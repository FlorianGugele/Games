package at.guf.games.fistgame;

import at.guf.games.Aufgabe1Objects.Objects;
import org.newdawn.slick.*;


public class ObjectGame extends BasicGame {
    private Rectangles rectangles;
    private Rectangles rectangles2;
    private Rectangles rectangles3;
    private Circles circles;
    private Circles circles2;
    private Ovales ovales;
    private Ovales ovales2;

    public ObjectGame (String title){
        super(title);
    }

    @Override
        public void init(GameContainer gameContainer) throws SlickException{
            this.rectangles = new Rectangles(100,100,5);
            this.rectangles2 = new Rectangles(50,200,7);
            this.rectangles3 = new Rectangles(200,500,10);
            this.circles = new Circles(100,200,2);
            this.circles2 = new Circles(50,400,7);
            this.ovales = new Ovales(100,600,15);
            this.ovales2 = new Ovales(50,300,5);

        }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException{
        this.rectangles.update(delta);
        this.rectangles2.update(delta);
        this.rectangles3.update(delta);
        this.circles.update(delta);
        this.circles2.update(delta);
        this.ovales.update(delta);
        this.ovales2.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangles.render(graphics);
        this.rectangles2.render(graphics);
        this.rectangles3.render(graphics);
        this.ovales.render(graphics);
        this.ovales2.render(graphics);
        this.circles.render(graphics);
        this.circles2.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGame("ObjectsGame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
