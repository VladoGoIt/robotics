package cell1;

/**
 * Created by group on 08.08.2017.
 */
public class RobotKuka extends Robot {
    protected int z;
    public RobotKuka(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public void printXyz(){
        super.printXyz();
        System.out.println("coordinata Z " + z);
    }
}
