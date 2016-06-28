
public class Object {
	private String name;
	private Location located;
	
	public Object(){
		name = "";
		located = null;
	}
	
	public Object(String n, Location l){
		name = n;
		located = l;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}

	public Location getLocation(){
		return located;
	}
	
	public void setLocation(Location l){
		located = l;
	}
	
	public String toString(){
		return name;
	}
}
