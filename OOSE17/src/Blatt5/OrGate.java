package Blatt5;

public class OrGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		for (Component c : inputs) {
			if (c.state)
				return true; // gebe true zur¨uck sobald ein Eingang true
		}
		return false; // falls kein Eingang true gebe false zur¨uck
	}
}
