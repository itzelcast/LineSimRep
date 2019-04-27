public class Person{//corresponds to a customer
	private int arrivalTime;
	private int departureTime;
	private int processingTime;

	public Person(int a, int d, int p){
		arrivalTime = a;
		departureTime = d;
		processingTime = p;
	}

	public int getATime(){return arrivalTime;}
	public int getDTime(){return departureTime;}
	public int getPTime(){return processingTime;}

	public void setATime(int i){arrivalTime=i;}
	public void setDTime(int i){departureTime=i;}
	public void setPTime(int i){processingTime=i;}	
}