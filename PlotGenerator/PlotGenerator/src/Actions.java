import java.util.ArrayList;
import java.util.List;


public class Actions {
	public static void runWorld(List<Character> characters, List<Location> locations, 
			List<LocationConnection> locationConnections, List<Object> objects){
		boolean done = false;
		while(!done){
			//for each character in step, look at goal
			for(Character c : characters){
				System.out.println(c.getName()+": ");
				List<Goal> goalList = c.getGoalList();
				//Look at all the goals and find the most common goal location
				Location dest = findMostCommonGoalLocation(goalList);
				Location start = c.getLocation();
				if(start.equals(dest)){
					
				} else{
					Location next = leadsToDestination(start, dest, locationConnections);
				}
			}
			done = true;
		}
	}
	
	public static Location findMostCommonGoalLocation(List<Goal> goals){
		List<Location> goalLocations = new ArrayList<Location>();
		for(Goal g : goals){
			Location l = g.getObjectWanted().getLocation();
			if(!listHasLocation(goalLocations, l)){
				goalLocations.add(l);
			}
		}	
		Location[] locationArray = new Location[goalLocations.size()];
		for(int i=0; i<goalLocations.size(); i++){
			locationArray[i] = goalLocations.get(i);
		}
		int[] locationCount = new int[locationArray.length];
		int value, maxcount;
		value = -1;
		maxcount = 0;
		for(int i=0; i<locationArray.length; i++){
			for(Goal g : goals){
				Location l = g.getObjectWanted().getLocation();
				if(l.equals(locationArray[i])){
					locationCount[i]++;
					if(maxcount < locationCount[i]){
						maxcount = locationCount[i];
						value = i;
					}
				}
			}
		}
		return locationArray[value];
	}
	
	public static boolean listHasLocation(List<Location> locationList, Location location){
		for(Location l : locationList){
			if(l.equals(location))
				return true;
		}
		return false;
	}

	public static Location leadsToDestination(Location start, Location dest, List<LocationConnection> lc){
		for(LocationConnection conn : lc){
			if(conn.isAdjacentToLocation(start)){
				if(conn.isAdjacentToLocation(dest)){
					return start;
				} else{
					return leadsToDestination(conn.getOppositeLocation(start), dest, lc);
				}
			}
		}
		return new Location();
	}
}
