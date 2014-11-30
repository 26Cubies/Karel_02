/**
*
* An athlete navigates a maze while leaving a trail of beepers
*
* @author <Stefan Chao>
* @version <Nov 24 2014>
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
 		Display.openWorld("maps/maze.map");
 		Display.setSize(8, 8);
 		Display.setSpeed(12);
 		Athlete maria = new Athlete();
 		
 		maria.move();
 		maria.putBeeper();
 		maria.turnRight();
 		maria.putBeeper();
 		maria.move();
 		maria.putBeeper();

 		maria.turnRight();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnLeft();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnLeft();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnRight();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnRight();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnLeft();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.turnLeft();
 		maria.putBeeper();

 		for(int i = 0; i <=3; i++){
 			maria.move();
 	 		maria.putBeeper();

 		}
 		maria.turnRight();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		maria.move();
 		maria.putBeeper();

 		
 		
     }
}
