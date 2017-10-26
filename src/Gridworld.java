import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
 World w=new World();   
    w.show();
Color red=new Color(250, 0, 0);
Color white=new Color(0, 0, 0);
    Bug b=new Bug();
    Bug b2=new Bug();
Flower f=new Flower();
Flower f2=new Flower();
Location fl3=new Location(0,0);
for (int i = 0; i < 10; i++) {
	if (i%2==1) {
		
		
		f.setColor(red);
		}
	else{
	f.setColor(white);	
	}
	
	for (int j = 0; j < 10; j++) {
	fl3=new Location(i,j);
	w.add(fl3, f);
	}
}

}
    /*Location l2=new Location(5,8);
    Location l=new Location(1, 2);
    Location fl=new Location(5,7);
    		Location fl2=new Location(5,9);
    		
    w.add(l, b);
    w.add(l2, b2);
    w.add(fl, f);
    w.add(fl2, f2);
    b2.setColor(blue);
    b2.turn();
    b2.turn();*/
    
}

