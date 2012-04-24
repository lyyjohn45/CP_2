
public class CP_2 {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(2);
		list.append(4);
		list.append(5);
		list.append(5);
		
		list.printList();
		list.removeDuplicate();
		System.out.println("");
		list.printList();
	}

}
