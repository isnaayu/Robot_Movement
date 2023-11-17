import model.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value, command;

        System.out.print("Determine the initial position of the Robot = ");
        value = input.next();

        System.out.print("enter command = ");
        command = input.next();

        String[] position = value.split(",");

        String[] commands = command.split("");

        Robot robot = new Robot();
        robot.setCommands(commands);
        robot.setX(Integer.parseInt(position[1]));
        robot.setY(Integer.parseInt(position[2]));
        robot.setDirection(position[0]);
        robot.robotMovement(position[0], Integer.parseInt(position[1]) , Integer.parseInt(position[2]));


    }
}