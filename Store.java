public class Store{
	PersonQueue[] mypg;
	EventPQueue myeq;

	int numberOfQueues;
	int totalDelay;

	public Store(int q){
		numberOfQueues = q;
		mypg = new PersonQueue[numberOfQueues];
	}

	// will probably need an add method that adds a Person to the PersonQueue with the
    //least number of people
    //will probably need a remove method that removes a person from a PersonQueue who
    //has finished the checkout process
}