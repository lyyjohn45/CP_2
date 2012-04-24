
public class LinkedList {
	public ListNode front;
	
	public LinkedList ()
	{
		this.front = null;
	}
	
	public LinkedList (ListNode x)
	{
		this.front = x;
	} 
	
	public LinkedList (int x)
	{
		this.front = new ListNode(x);
	} 
	
	public void append (int x)
	{
		if(front == null)
		{
			front = new ListNode(x);
			
		}else{
		
			ListNode current = front;
			
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = new ListNode(x);
		}
	}
	
	public ListNode delete(int x)
	{
		if(front.val == x)
		{
			front = front.next;
			return front;
		}
		
		ListNode current = front;
		
		while(current.next != null)
		{
			if(current.next.val == x)
			{
				ListNode temp = current.next;
				current.next = current.next.next;
				return temp;
			}	
			current = current.next;
		}
		
		return null;
	}
	
	public void printList()
	{
		ListNode current = front;
		while(current != null)
		{
			System.out.print(current.val +"->");
			current = current.next;
		}
	}
	
	public void removeDuplicate()
	{
		int[] map = new int[256];
		for(int i : map)
		{
			i = 0;
		}
		
		ListNode current = front;
		while(current != null)
		{
			map[current.val]++;
			current = current.next;
		}
		
		for(int i = 0; i < map.length; ++i)
		{
			while(map[i] > 1)
			{
				this.delete(i);
				--map[i];
			}
		}
	}
}
