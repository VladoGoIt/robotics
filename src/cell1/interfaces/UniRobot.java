package cell1.interfaces;

/**
 * Created by Vlado on 15.08.2017.
 */
public class UniRobot {
           // Текущая координата X
        private double x = 0;
        // Текущая координата Y
        private double y = 0;
        // Текущий курс (в градусах)
        private double course = 0;

        private double z;

        // Теперь конструктор выполняет присваивание
        public UniRobot(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Передвижение на дистанцию distance
        public void forward(int distance) {
            // Обращение к полю объекта X
            x = x + distance * Math.cos(course / 180 * Math.PI);
            // Обращение к полю объекта Y
            y = y + distance * Math.sin(course / 180 * Math.PI);
        }

        // Печать координат робота
        public void printCoordinates() {
            System.out.println(x + "," + y);
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getCourse() {
            return course;
        }

        public void setCourse(double course) {
            this.course = course;
        }

}
