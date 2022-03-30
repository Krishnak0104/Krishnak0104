package linkedHashMap;

public class MylinkedHashmap<d1, d2> 
{
   Object[] a= new Object[16];
   Node<d1, d2> root;
   
   public void add(d1 key, d2 value)
   {
	   Node <d1, d2> obj= new Node<d1, d2>(key, value);
	   addInHashTable(obj);
	   addInLinkedList(obj);
   }

private void addInLinkedList(Node<d1, d2>obj) 
{
	if(root== null)
		root=obj;
	else
	{
		Node<d1, d2> temp=root;
		while(temp.linkedListnext!=null)
		{
			temp=temp.linkedListnext;
		}
		temp.linkedListnext=obj;
	}
}

private void addInHashTable(Node<d1, d2> obj) 
{
	int index=obj.key.hashCode()%a.length;
	Node<d1, d2> temp=(Node<d1, d2>) a[index];
	
	if(temp==null)
	{
		a[index]=obj;
	}
	else
	{
		while(temp.hashTablenext!=null)
		{
			temp=temp.hashTablenext;
			
		}
		temp.hashTablenext=obj;
	}
	}
public void print()
{
	Node <d1,d2> temp=root;
	while(temp!=null)
	{
		System.out.println(temp.key+" "+temp.value);
		temp=temp.linkedListnext;
	}
}
   

}
