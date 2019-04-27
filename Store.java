import java.util.*;

public class Store{

	int numberOfQueues;
	int totalDelay;
	LinkedList<Person>[] lines;

	public Store(int q){
		numberOfQueues = q;
		lines = new LinkedList[q];
		
		for(int i=0; i<q; i++){
			lines[i] = new LinkedList<Person>();
		}
	}

	public void addPerson(){
		System.out.println(lines[0].size());
	}

	public void removePerson(){

	}
	// will probably need an add method that adds a Person to the PersonQueue with the
    //least number of people
    //will probably need a remove method that removes a person from a PersonQueue who
    //has finished the checkout process
}