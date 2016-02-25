
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxia2242
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        Robot Andrew = new Robot(AM,4,0,Direction.EAST);
        
        new Wall(AM,4,2,Direction.NORTH);
        new Wall(AM,4,2,Direction.WEST);
        new Wall(AM,3,3,Direction.WEST);
        new Wall(AM,3,3,Direction.NORTH);
        new Wall(AM,2,4,Direction.WEST);
        new Wall(AM,2,4,Direction.NORTH);
        new Wall(AM,2,5,Direction.NORTH);
        new Wall(AM,2,5,Direction.EAST);
        new Wall(AM,3,6,Direction.NORTH);
        new Wall(AM,3,6,Direction.EAST);
        new Wall(AM,4,7,Direction.NORTH);
        new Wall(AM,4,7,Direction.EAST);
        
        new Thing(AM,4,1);
        new Thing(AM,3,2);
        new Thing(AM,2,3);
        new Thing(AM,1,4);
        
        
        
        
        while(Andrew.frontIsClear()){
              Andrew.move();
        if (Andrew.canPickThing()){
            Andrew.pickThing();
        }
        if(!Andrew.frontIsClear()){
            Andrew.turnLeft();
            Andrew.move();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.turnLeft();
        }   
        if(Andrew.getStreet() == 1 && Andrew.getAvenue() == 4){
            Andrew.move();
            break;
        }
        }
            
          
            
        
            
    
        
        if(Andrew.getAvenue() == 5 && Andrew.getStreet() == 1){
            
            Andrew.putThing();
            
        }
        while(Andrew.countThingsInBackpack() > 0){
            Andrew.move();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.move();
            Andrew.putThing();
            Andrew.turnLeft();
        }
            
            
            
            
    
}
}
