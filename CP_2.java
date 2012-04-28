
public class CP_2 {
	
	public static ListNode returnTheFirstCycleNode (LinkedList l)
	{
		ListNode current = l.front;
		ListNode check;
		
		while(current != null)
		{
			check = current;
			while(check != null)
			{
				if(check.next == current)//find the cycle 
					return current;
				check = check.next;
			}
			
			current = current.next;
		}
		
		return null;
	}
	
	public static LinkedList sumLists (LinkedList l1, LinkedList l2)
	{
		LinkedList result = new LinkedList();
		ListNode c1 = l1.front;
		ListNode c2 = l2.front;
		
		while(c1 != null || c2 != null)
		{
			int sum;
			int carry;
			
			if(c1 == null)
			{
				sum = c2.val;
				result.append(sum);
				c2 = c2.next;
			}
			else if (c2 == null)
			{
				sum = c1.val;
				result.append(sum);
				c1 = c1.next;
			}else
			{
				sum = (c1.val + c2.val) % 10;
				carry = (c1.val + c2.val) / 10;
				
				if(carry > 0)
				{
					if(c2.next == null)
					{
						l2.append(carry);
					}else
					{
						c2.next.val += 1;
					}
				}
				result.append(sum);
				c1 = c1.next;
				c2 = c2.next;
			}
		}	
		return result; 
	} 
	
	public static void main(String[] args) {
		

		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(5);
		
		//list.printList();
		//int nthVal = list.pointNth(1).val;
		//System.out.println(nthVal);
		//list.removeDuplicate();
		//System.out.println("");
		//list.printList();
		
		//2.4 test
		/*LinkedList l1 = new LinkedList();
		l1.append(8);
		l1.append(2);
		l1.append(8);
		LinkedList l2 = new LinkedList();
		l2.append(3);
		l2.append(2);
		l2.append(5);
		
		LinkedList result = new LinkedList (sumLists(l1,l2));
		
		result.printList();*/
		
	}

}
