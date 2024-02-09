package hackerrank;

/*
 * Create the class Robot. Do not use the public access modifier in your class declaration.
 */

import java.util.Scanner;

class Robot {
    int currentX;
    int currentY;
    int previousX;
    int previousY;
    //The robot's initial location is at (x,y) coordinate (0,5)
    Robot() {
        this.currentX = 0;
        this.currentY = 5;
    }

    Robot(int x, int y) {
        //The robot created by this constructor is considered to have spawned at (0,5) and moved to (currentX, currentY) so (previousX, previousY) starts as (0,5)
        this.currentX = x;
        this.currentY = y;
        if(x != 0 || y != 5) {
            this.previousX = 0;
            this.previousY = 5;
        }
    }

    void moveX (int dx) {
        //move the robot from current position(x,y) to new position(x + dx, y).
        //remember to maintain previousX.
        previousX = currentX;
        currentX += dx;
    }

    void moveY (int dy) {
        //move the robot from current position (x,y) to new position(x,y + dy).
        //remember to maintain previousY.
        if (dy != 0) {
            previousY = currentY;
            currentY += dy;

        }

    }
    void printCurrentCoordinates() {
        //Print two space-separated integers describing the robot's current x and y coordinates
        System.out.println(currentX + " " + currentY);

    }
    void printLastCoordinates() {
        //print two space-separated integers describing the robot's previousX and previousY coordinates.
        // This will be called after the robot has moved from position (0,5) at least once.
        System.out.println(previousX);
    }

    void printLastMove() {
        //print two space-separated values describing the robot's most recent movement
        //if the last move was moveX(dx), print x dx where x is the actual character x and dx is the distance moved in the x-direction during the last call to moveX.
        //if the last move was moveY(dy), print y dy where y is the actual character y and dy is the distance moved in the y-direction during the last call to moveY
        if (currentX != previousX) {
            System.out.println("x " + (currentX - previousX));
        } else if (currentY != previousY) {
            System.out.println("y " + (currentY - previousY));
        }
    }
}




public class RobotMoves {
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
}