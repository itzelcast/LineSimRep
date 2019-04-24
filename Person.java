public class Person{//corresponds to a customer
	private int arrivalTime;
	private int departureTime;
	private int processingTime;
	private Person next, prev = null;

	public Person(int a, int d, int p){
		arrivalTime = a;
		departureTime = d;
		processingTime = p;
	}

	public int getATime(){return arrivalTime;}
	public int getDTime(){return departureTime;}
	public int getPTime(){return processingTime;}

	public void setNext(Person p){next = p;}
	public void setPrev(Person p){prev = p;}

	public Person getNext(){return next;}
	public Person getPrev(){return prev;}
}