//Level2 for snake game

import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

public class Level2 {
   
    public static LinkedList list;
   
   
    public Level2(){
       init();
    }
    public void init(){
       list = new LinkedList();
    }
   
    public void DrawWall(Graphics g){
       g.setColor(Color.black);


	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Point w=(Point)itr.next();
		g.fillRect(w.x*snakeCals.BOX_WIDTH, w.y*snakeCals.BOX_HEIGHT, snakeCals.BOX_WIDTH, snakeCals.BOX_HEIGHT);
		//itr=itr.next();
	}

      
    }
    public void level2(){
       //wall 1
       list.add(new Point(3,4));
       list.add(new Point(4,4));
       list.add(new Point(5,4));
       list.add(new Point(6,4));
       list.add(new Point(7,4));
       list.add(new Point(8,4));
       list.add(new Point(9,4));
       list.add(new Point(10,4));
       list.add(new Point(11,4));
      
       //wall 2
       list.add(new Point(3,12));
       list.add(new Point(4,12));
       list.add(new Point(5,12));
       list.add(new Point(6,12));
       list.add(new Point(7,12));
       list.add(new Point(8,12));
       list.add(new Point(9,12));
       list.add(new Point(10,12));
       list.add(new Point(11,12));
    }

}

