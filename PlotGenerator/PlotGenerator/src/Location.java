import java.util.ArrayList;
import java.util.List;


public class Location {
	String name;

	public Location(){
		name = "";
	}
	
	public Location(String n){
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
