public class Event{//coreesponds to either an arrival or departure

	String type;//can be arrival or departure

	int time; //if “arrival”, this will be the arrival time of a job; 
	//if “departure”, this will be the departure time of a job


	int param; //if “arrival”, this will be the processing time of a job; if
    //“departure”, this will be the checkout line that had a departure event

}