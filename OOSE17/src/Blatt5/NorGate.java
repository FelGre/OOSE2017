package Blatt5;

public class NorGate extends Component{
	public boolean function(java.util.ArrayList<Component> inputs){
		for (Component c : inputs){
			if (c.state) return false; //Falls ein Eingang true, dann false
		}
		return true; //Alle Eingänge false, dann true
	}
	
}