package cell1;

import cell1.interfaces.IGoUp;

/**
 * Created by group on 14.08.2017.
 */
public abstract class RoboBug extends Robot implements IGoUp{
    public RoboBug(int x, int y) {
        super(x, y);
    }

}
