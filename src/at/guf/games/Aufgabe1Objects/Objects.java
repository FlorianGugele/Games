package at.guf.games.Aufgabe1Objects;

import org.newdawn.slick.*;

public class Objects extends BasicGame {
    private float xRec;
    private float yRec;
    private float yCirc;
    private float xOval;
    private float RecSpeed;
    private float CircSpeed;
    private float OvalSpeed;
    private boolean IsDownRec = false;
    private boolean IsRightRec = true;
    private boolean IsLeftRec = false;
    private boolean IsUpRec = false;

    private boolean IsUpCirc = false;
    private boolean IsDownCirc = true;
    private boolean IsRightOval = true;
    private boolean IsLeftoval = false;

    public Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRec = 100;
        this.yRec=100;
        this.RecSpeed = 10.0f;
        this.xRec =100;
        this.yCirc=50;
        this.xOval =100;
        this.CircSpeed = 5.0f;
        this.OvalSpeed = 7.5f;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

//Rectangle
        if (this.xRec<= 600 && IsRightRec == true){
            this.xRec += (float)i/this.RecSpeed;
        }
        if (this.xRec >= 600 && IsRightRec == true ){
            IsRightRec = false;
            IsDownRec = true;
        }


        if (this.yRec <= 400 && IsDownRec ==true){
            this.yRec += (float)i/this.RecSpeed;
        }
        if (this.yRec >= 400 && IsDownRec==true){
            IsDownRec = false;
            IsLeftRec = true;
        }


        if (this.xRec >=100 && IsLeftRec == true){
            this.xRec -= (float)i/this.RecSpeed;
        }
        if (this.xRec <=100 && IsLeftRec == true){
            IsLeftRec = false;
            IsUpRec = true;
        }


        if (this.yRec >= 100 && IsUpRec ==true){
            this.yRec -= (float)i/this.RecSpeed;
        }
        if (this.yRec <= 100 && IsUpRec==true){
            IsUpRec = false;
            IsRightRec = true;
        }

//Oval

        if (this.xOval<= 750 && IsRightOval == true){
            this.xOval += (float)i/this.OvalSpeed;
        }
        if (this.xOval >= 750 && IsRightOval == true ){
            IsRightOval = false;
            IsLeftoval = true;
        }

        if (this.xOval >=100 && IsLeftoval == true){
            this.xOval -= (float)i/this.OvalSpeed;
        }
        if (this.xOval <=100 && IsLeftoval == true){
            IsLeftoval = false;
            IsRightOval = true;
        }

//circle

        if (this.yCirc <= 550 && IsDownCirc ==true){
            this.yCirc += (float)i/this.CircSpeed;
        }
        if (this.yCirc >= 550 && IsDownCirc==true){
            IsDownCirc = false;
            IsUpCirc = true;
        }

        if (this.yCirc >= 100 && IsUpCirc ==true){
            this.yCirc -= (float)i/this.CircSpeed;
        }
        if (this.yCirc <= 100 && IsUpCirc==true){
            IsUpCirc = false;
            IsDownCirc = true;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRec,this.yRec,100,100);
        graphics.drawOval(10,this.yCirc,50,50);
        graphics.drawOval(this.xOval,10,50,25);
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
