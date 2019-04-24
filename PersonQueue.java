public class PersonQueue{
	int totalTime;//the sum of all processing times in this queue
	Person head, tail = null;

	public void enqueue(Person p){
		if(head == null) {
			head = p;
			tail = p;
		}
		else{
			tail.setNext(p);
			p.setPrev(tail);
			tail = p;
		}
	}
	//can use any structure
	//because this is a queue, you will need enqueue(), dequeue(), isEmpty()
}