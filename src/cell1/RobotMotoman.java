package cell1;

import cell1.interfaces.IGoUp;

/**
 * Created by group on 08.08.2017.
 */
public class RobotMotoman extends Robot implements IGoUp {
    public RobotMotoman(int x, int y) {
        super(x, y);
    }

    @Override
    public void moveUp() {
        System.out.println("New coordinates RobotMotoman X - " + (x + x2) + " Y - " + (y + y2));
    }
}
