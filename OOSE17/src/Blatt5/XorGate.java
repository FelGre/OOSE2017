package Blatt5;


public class XorGate extends Component{
	@Override
	public boolean function(java.util.ArrayList<Component> inputs){
		if(inputs.get(0).state == false && inputs.get(1).state == true) return true; //Wenn genau einer der Eing�nge true, dann true
		if(inputs.get(0).state == true && inputs.get(1).state == false) return true;
		else return false;
		
		//Kommentar von Francois: Unn�tig viel Code. Alle boolschen Operatoren geben quasi schon boolsche Werte zur�ck, deswegen ist besser: 
		//return inputs.get(0).state != inputs.get(1).state
	}
}
