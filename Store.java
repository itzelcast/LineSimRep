import java.util.*;

public class Store{

	int numberOfQueues;
	int totalDelay;
	LinkedList<Person>[] lines;
	Comparator<Event> comparator = new MyComparator();
	PriorityQueue<Event> eve = new PriorityQueue<Event>(2, comparator);

	public Store(int q){
		numberOfQueues = q;
		lines = new LinkedList[q];
		
		for(int i=0; i<q; i++){
			lines[i] = new LinkedList<Person>();
		}
	}

	public void addPerson(){

	}

	public void removePerson(int l){
		lines[l].poll();
	}

	public void fucky(){
		int totalATime = 0;
		int totalPTime = 0;
		Random r = new Random();

		for(int i=0; i<customers; i++){
			totalATime += r.nextInt(maxArrival-minArrival)+minArrival;
			totalPTime += r.nextInt(maxProcessing-minProcessing)+minProcessing;
			eve.add(new Event("Arrival", totalATime,totalPTime));
		}

		for(int i=0;i<customers; i++){
			System.out.println(eve.poll().getTime());
		}
	}
	// will probably need an add method that adds a Person to the PersonQueue with the
    //least number of people
    //will probably need a remove method that removes a person from a PersonQueue who
    //has finished the checkout process
}