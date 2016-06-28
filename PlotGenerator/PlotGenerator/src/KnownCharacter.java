import java.util.ArrayList;
import java.util.List;


public class KnownCharacter {
	private Character character_start;
	private Character character_known;
//	private List<KnownSkill> knownSkills = new ArrayList<KnownSkill>();
//	private List<Goal> knownGoals = new ArrayList<Goal>();
//	private String knownName;
	
	public KnownCharacter(){
		character_start = null;
		character_known = null;
	}
	
	public KnownCharacter(Character start, Character known){
		character_start = start;
		character_known = known;
	}
	
	public Character getStartCharacter(){
		return character_start;
	}
	
	public void setStartCharacter(Character c){
		character_start = c;
	}
	
	public Character getKnownCharacter(){
		return character_known;
	}
	
	public void setKnownCharacter(Character c){
		character_known = c;
	}
}
