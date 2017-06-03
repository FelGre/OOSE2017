
public class NotGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		if(inputs.get(0).state == false) return true; //Betrachte nur ersten Eingang und negiere diesen
		else return false;
		
	}
}
