package cell1;

/**
 * Created by group on 08.08.2017.
 */
public class Robot {
    protected int x;
    protected int y;
    //protected int z;

    public Robot(int x, int y){
        this.x = x;
        this.y = y;
        //this.z = z;
    }

    public void forvad(int curs){
        x = x + curs;
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

    public void printXyz(){
        System.out.println("coordinata X " + x);
        System.out.println("coordinata Y " + y);
    }
}
