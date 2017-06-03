package Blatt5;


public class XorGate extends Component{
	@Override
	public boolean function(java.util.ArrayList<Component> inputs){
		if(inputs.get(0).state == false && inputs.get(1).state == true) return true; //Wenn genau einer der Eingänge true, dann true
		if(inputs.get(0).state == true && inputs.get(1).state == false) return true;
		else return false;
	}
}
