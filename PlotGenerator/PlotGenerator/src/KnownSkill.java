
public class KnownSkill {
	private Character character;
	private Skill skill;
	private int level;
	
	public KnownSkill(){
		character = null;
		skill = null;
		level = -1;
	}
	
	public KnownSkill(Character ch, Skill s, int lvl){
		character = ch;
		skill = s;
		if((lvl < skill.MAX_LEVEL) && (lvl > skill.MIN_LEVEL)){
			level = lvl;
		} else{
			level = -1;
		}
	}
	
	public Character getCharacter(){
		return character;
	}
	
	public void setCharacter(Character c){
		character = c;
	}
	
	public Skill getSkill(){
		return skill;
	}
	
	public void setSkill(Skill s){
		skill = s;
	}
	
	public int getLevelOfSkill(){
		return level;
	}
	
	public void setLevelOfSkill(int lvl){
		level = lvl;
	}
}
