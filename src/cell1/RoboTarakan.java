package cell1;

/**
 * Created by group on 14.08.2017.
 */
public class RoboTarakan extends RoboBug {
    public RoboTarakan(int x, int y) {
        super(x, y);
    }

    @Override
    public void moveUp() {
        System.out.println("New coordinates RoboTarakan X - " + (x + x2) + " Y - " + (y + y2));
    }
}
