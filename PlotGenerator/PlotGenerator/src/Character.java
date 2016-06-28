import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Character {
	private String name;
	private Location isHere;
	private List<Object> inventory = new ArrayList<Object>();
	private List<KnownSkill> skillList = new ArrayList<KnownSkill>();
	private List<Goal> goalList = new ArrayList<Goal>();
	private List<Location> knownLocation = new ArrayList<Location>();
	private List<KnownObject> knownObjects = new ArrayList<KnownObject>();
	private List<KnownCharacter> knownCharacters = new ArrayList<KnownCharacter>();

	
	public Character(){
		name = "";
		isHere = null;
	}
	
	public Character(String n, Location located){
		name = n;
		isHere = located;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public Location getLocation(){
		return isHere;
	}
	
	public void setLocation(Location l){
		isHere = l;
	}
	
	public List<KnownSkill> getSkillList(){
		return skillList;
	}
	
	public boolean hasSkill(KnownSkill s){
		for(KnownSkill skill : skillList){
			if(skill.equals(s))
				return true;
		}
		return false;
	}

	public boolean addSkill(KnownSkill s){
		if(!hasSkill(s)){
			skillList.add(s);
			return true;
		}
		return false;
	}

	public List<Goal> getGoalList(){
		return goalList;
	}

	public boolean hasGoal(Goal g){
		for(Goal goal : goalList){
			if(goal.equals(g)){
				return true;
			}
		}
		return false;
	}
	
	public boolean addGoal(Goal g){
		if(!hasGoal(g)){
			goalList.add(g);
			return true;
		}
		return false;
	}

	public String toString(){
		return name;
	}
}
