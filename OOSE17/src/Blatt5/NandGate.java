package Blatt5;


public class NandGate extends Component{
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		for (Component c : inputs) {
			if (!c.state)
				return true; // gebe true zur¨uck sobald ein Eingang false
		}
		return false; // falls alle Eingänge true gebe false zur¨uck
	}
}
