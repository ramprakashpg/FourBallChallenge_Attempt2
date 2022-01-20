import processing.core.PApplet;
public class FourBallsChallengeMain extends FourBallsChallenge{

    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeMain", args);
    }
    public static final int heightOfWindow = 480;
    public static final int heightOfBall4 = heightOfWindow * 4 / 5;
    public static final int heightOfBall3 = heightOfWindow * 3 / 5;
    public static final int heightOfBall2 = heightOfWindow * 2 / 5;
    public static final int heightOfBall1 = heightOfWindow / 5;
    public static final int widthOfWindow = 640;
    public static final int diameterOfBall = 10;
    public int ball1Coordinate = 0;
    public int ball2Coordinate = 0;
    public int ball3Coordinate = 0;
    public int ball4Coordinate = 0;
    @Override
    public void settings() {
        super.settings();
        size(widthOfWindow, heightOfWindow);
    }

    @Override
    public void setup() {
        super.setup();
        background(0);
    }

    @Override
    public void draw() {
        ball1Coordinate = drawCircle(ball1Coordinate, heightOfBall1,diameterOfBall,1);
        ball2Coordinate = drawCircle(ball2Coordinate, heightOfBall2,diameterOfBall,2);
        ball3Coordinate = drawCircle(ball3Coordinate, heightOfBall3,diameterOfBall,3);
        ball4Coordinate = drawCircle(ball4Coordinate, heightOfBall4, diameterOfBall,4);

    }
}
