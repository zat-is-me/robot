
class RobotDemo{
     static int dx;
     static int dy;

    public static void main(String[] args) {

        Robot redRobot = new Robot ("Red",2,4);

        Robot blueRobot = new Robot ("Blue",0,2);

        for (int i = 1; i < 3; i++) {

            System.out.println ("\nTracking Red robot");
            redRobot.printCurrentCoordinates ();
            redRobot.moveX(dx);
            redRobot.printLastMove ();
            redRobot.printCurrentCoordinates ();
            redRobot.moveY (dy);
            redRobot.printLastMove ();
            redRobot.printPreviousCoordinates ();
            redRobot.printCurrentCoordinates ();

            System.out.println ("\nTracking Blue robot");
            blueRobot.printCurrentCoordinates ();
            blueRobot.moveX (dx);
            blueRobot.printLastMove ();
            blueRobot.printCurrentCoordinates ();
            blueRobot.moveY (dy);
            blueRobot.printLastMove ();
            blueRobot.printPreviousCoordinates ();
            blueRobot.printCurrentCoordinates ();

            dx += i * i;
            dy -= i * i;
        }
    }
}



class Robot {

    String name;

    int currentX = 0;
    int currentY = 5;

    int previousX;
    int previousY;

    int myDx =0;
    int myDy =0;

    boolean xChange;
    boolean yChange;



    public Robot() {
        super();
        previousX = currentX;
        previousY = currentY;
    }
    public Robot(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;

        previousX = currentX;
        previousY = currentY;
    }
    public Robot(String name, int currentX, int currentY) {
        this.name = name;
        this.currentX = currentX;
        this.currentY = currentY;

        this.previousX = currentX;
        this.previousY = currentY;
        System.out.print(name+" robot created at "+"("+currentX+","+currentY+")\n");
    }

    public void moveX(int dx){
        currentX = currentX + dx;
        previousX = currentX - dx;
        if (myDx != dx) {
            xChange = true;
            myDx = dx;
        }
    }

    public void moveY(int dy){
        currentY = currentY + dy;
        previousY = currentY - dy;
        if (myDy != dy) {
            yChange = true;
            myDy = dy;
        }
    }

    public void printCurrentCoordinates(){
        System.out.println("("+currentX+", " +currentY +") Current position");
    }
    public void printPreviousCoordinates(){
        System.out.println("("+previousX +", "+ previousY+") Previous position");
    }
    public void printLastMove(){
        if (xChange) {
            System.out.println ("X = "+ myDx+" moved");
            xChange = false;

        }
        if (yChange){
            System.out.println ("Y = " +myDy+" moved");
            yChange = false;
        }
    }
}
/*import java.util.Scanner;

*//*
 * Create the class Robot. Do not use the public access modifier in your class declaration.
 *//*
class Robot {

    int currentX = 0;
    int currentY = 5;

    int previousX = currentX;
    int previousY = currentY;

    int myDx =0;
    int myDy =0;

    boolean xChange;
    boolean yChange;



    public Robot() {
        super();

    }
    public Robot(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;

    }

    public void moveX(int dx){

        currentX = currentX + dx;
        previousX = currentX - dx;
        xChange = true;
        myDx = dx;
    }
    public void moveY(int dy){
        currentY = currentY + dy;
        previousY = currentY - dy;
        yChange = true;
        myDy = dy;
    }

    public void printCurrentCoordinates(){
        System.out.println (currentX+ " " +currentY );
    }
    public void printLastCoordinates(){
        System.out.println ((previousX+myDx)+" "+ (previousY) );
    }
    public void printLastMove(){
        if (xChange) {
            System.out.println ("x " + myDx );
        }
        else if (yChange){
            System.out.println ("y " +myDy);
        }
    }
}*/
/*public class RobotMoves {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        int dx = scan.nextInt();
        int dy = scan.nextInt();

        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();

        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();

            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }
    }
}*/
