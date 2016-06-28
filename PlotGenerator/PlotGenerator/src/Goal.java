
public class Goal {
	Character c;
	Object object;
	
	public Goal(){
		c = null;
		object = null;
	}

	public Goal(Character character, Object obj){
		c = character;
		object = obj;
	}
	
	public Character getCharacter(){
		return c;
	}
	
	public void setCharacter(Character character){
		c = character;
	}
	
	public Object getObjectWanted(){
		return object;
	}
	
	public void setObjectWanted(Object obj){
		object = obj;
	}
	
	public String toString(){
		return c.getName()+" wants "+object.getName();
	}
}
