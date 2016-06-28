
public class Skill {
	String name;
	final int MIN_LEVEL = 0;
	final int MAX_LEVEL = 10;
	
	public Skill(){
		name = "";
	}
	
	public Skill(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String toString(){
		return name;
	}
}
