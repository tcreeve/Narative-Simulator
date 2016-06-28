import java.util.ArrayList;
import java.util.List;


public class LocationConnection {
	private Location l1;
	private Location l2;
	private int distance;
	
	public LocationConnection(){
		l1 = null;
		l2 = null;
		distance = -1;
	}
	
	public LocationConnection(Location one, Location two, int dist){
		l1 = one;
		l2 = two;
		distance = dist;
	}
	
	public boolean isAdjacentToLocation(Location l){
		if(l1.equals(l) || l2.equals(l))
			return true;
		return false;
	}
	
	public Location getOppositeLocation(Location l){
		if(l.equals(l1))
			return l2;
		else if(l.equals(l2))
			return l1;
		return null;
	}
	
	public int getDistance(){
		return distance;
	}
	
	public void setDistance(int dist){
		distance = dist;
	}
	
	public String toString(){
		return l1.toString()+" is "+distance+" units apart from "+l2.toString();
	}
}
