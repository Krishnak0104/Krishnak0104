package linkedHashMap;

public class Node<d1, d2> {
	d1 key;
	d2 value;
	Node<d1, d2> hashTablenext;
	Node<d1, d2> linkedListnext;
	
	Node (d1 key, d2 value)
	{
		this.key=key;
		this.value=value;
		
	}

}
