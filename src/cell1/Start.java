package cell1;

/**
 * Created by group on 08.08.2017.
 */
public class Start {
    public static void main(String[] args){
        Robot robot = new Robot(5,10);
        RobotKuka robotKuka = new RobotKuka(1, 2, 3);
        RoboTarakan tarakan  = new RoboTarakan(1,1);
        RoboSpider spider = new RoboSpider(2,2);
        RobotMotoman motoman = new RobotMotoman(3, 3);

        robot.forvad(25);

        robot.printXyz();

        robotKuka.printXyz();

        tarakan.moveUp();

        spider.moveUp();

        motoman.moveUp();

    }
}
