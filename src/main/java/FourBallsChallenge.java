import processing.core.PApplet;
public class FourBallsChallenge extends PApplet{
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public int drawCircle(int ballCoordinate,int heightOfBall, int diameterOfBall, int step){
        ellipse(ballCoordinate,heightOfBall,diameterOfBall,diameterOfBall);
        ballCoordinate+=step;
        return ballCoordinate;
    }
}

