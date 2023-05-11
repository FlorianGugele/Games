package at.guf.games.Aufgabe1Objects;

import org.newdawn.slick.*;

public class Objects extends BasicGame {
    private float xRec;
    private float yRec;
    private float speed;
    private boolean IsDownRec = false;
    private boolean IsRightRec = true;
    private boolean IsLeftRec = false;
    private boolean IsUpRec = false;
    private float xc;

    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRec = 100;
        this.yRec=100;
        this.speed = 10.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        if (this.xRec<= 600 && IsRightRec == true){
            this.xRec += (float)i/this.speed;
        }else {
            IsRightRec = false;
            IsDownRec = true;
        }

        if (this.yRec <= 400 && IsDownRec ==true){
            this.yRec += (float)i/this.speed;
        }else {
            IsDownRec = false;
            IsLeftRec = true;
        }
        //Riedmann fragen an was es liegt
        if (this.xRec >=100 && IsLeftRec == true){
            this.xRec -= (float)i/this.speed;
            System.out.println("s");
        }else {
            IsLeftRec = false;
            IsUpRec = true;
            System.out.println("j");
        }



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRec,this.yRec,100,100);
        graphics.drawOval(10,10,50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
