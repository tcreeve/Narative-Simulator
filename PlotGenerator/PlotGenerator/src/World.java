import java.util.ArrayList;
import java.util.List;


public class World {
	
	public static void makeWorldState1(){
		//make skill list
		List<Skill> skills = new ArrayList<Skill>();
		Skill s1 = new Skill("pickpocket");
		skills.add(s1);
		Skill s2 = new Skill("fighting");
		skills.add(s2);
		Skill s3 = new Skill("charisma");
		skills.add(s3);
		
		//make location list
		List<Location> locations = new ArrayList<Location>();
		Location l1 = new Location("treasure room");
		locations.add(l1);
		Location l2 = new Location("hallway");
		locations.add(l2);
		Location l3 = new Location("bedroom");
		locations.add(l3);
		Location l4 = new Location("kitchen");
		locations.add(l4);
		
		//connect the locations
		List<LocationConnection> locationConnections = new ArrayList<LocationConnection>();
		LocationConnection lc1 = new LocationConnection(l1, l2, 1);
		locationConnections.add(lc1);
		LocationConnection lc2 = new LocationConnection(l2, l3, 1);
		locationConnections.add(lc2);
		LocationConnection lc3 = new LocationConnection(l2, l4, 1);
		locationConnections.add(lc3);
		
		//make object list
		List<Object> objects = new ArrayList<Object>();
		Object o1 = new Object("artifact", l1);
		objects.add(o1);
		Object o2 = new Object("gold pile", l1);
		objects.add(o2);
		
		//make goal list
		//make character list
		List<Character> characters = new ArrayList<Character>();
		Character c1 = new Character("Abequa Nova", l4);
		KnownSkill ks_abequa1 = new KnownSkill(c1, s1, 6);
		KnownSkill ks_abequa2 = new KnownSkill(c1, s2, 9);
		c1.addSkill(ks_abequa1);
		c1.addSkill(ks_abequa2);
		Goal abequa_g1 = new Goal(c1, o1);
		c1.addGoal(abequa_g1);
		characters.add(c1);
		Character c2 = new Character("Scientist", l3);
		KnownSkill ks_scientist1 = new KnownSkill(c2, s3, 9);
		c2.addSkill(ks_scientist1);
		Goal scientist_g1 = new Goal(c2, o2);
		c2.addGoal(scientist_g1);
		characters.add(c2);
		
//		Actions.runWorld(characters, locations, locationConnections, objects);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeWorldState1();
	}

}
