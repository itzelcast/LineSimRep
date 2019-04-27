public class Event{//coreesponds to either an arrival or departure

	private String type;//can be arrival or departure

	private int time; //if arrival, this will be the arrival time of a job; 
	//if departure, this will be the departure time of a job


	private int param; //if arrival, this will be the processing time of a job; if
    //departure, this will be the checkout line that had a departure event

    public Event(String t, int ti, int p){
    	type = t;
    	time = ti;
    	param = p;
    }

    public void setType(String t){type=t;}
    public void setTime(int t){time=t;}
    public void setParam(int p){param=p;}

    public String getType(){return type;}
    public int getTime(){return time;}
    public int getParam(){return param;}

}