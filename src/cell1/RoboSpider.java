package cell1;

/**
 * Created by group on 14.08.2017.
 */
public class RoboSpider extends RoboBug {
    public RoboSpider(int x, int y) {
        super(x, y);
    }

    @Override
    public void moveUp() {

            System.out.println ("New coordinates RoboSpider X - " + (x + x2) + " Y - " + (y + y2));
    }
}
