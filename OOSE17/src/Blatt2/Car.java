package Blatt2;

public class Car {
	//ZU
	private Delict[] delicts = new Delict[5]; //Array zum speichern von Delikten
	private String licensePlate; //Nummernschild
	private String owner;	//Besitzer	
	private String address;	//Adresse
	
	public Car(String licensePlate, String owner, String address){
		this.licensePlate = licensePlate;
		this.owner = owner;
		this.address = address;
	}
	
	public void registerDelict(Delict del){
		for (int i = 0; i<5; i++){
			if (delicts[i] == null){
				delicts[i] = del;
				return;
			}
		}
	}
	
	public void printDelicts(){
		for(int i = 0; i<5; i++){
			if (delicts[i] != null){
				System.out.println("Punkte: "+ delicts[i].getPoints() + " Gebühren:" + delicts[i].getFees());
			}
		}
	}
	
	public String getLicensePlate(){
		return this.licensePlate;
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public String getAddress(){
		return this.address;
	}
}
