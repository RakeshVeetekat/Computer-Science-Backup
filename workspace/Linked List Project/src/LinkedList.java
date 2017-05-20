public class LinkedList<String> 
{
	
	private Node<String> head;
	private int size = 0;

	public LinkedList()
	{
		head = null;
	}

	public void add(String add)
	{
		size ++;

		Node<String> tempAdd = new Node<String>(add,null);

		if(head == null)
		{
			head = tempAdd;
		}
		else if(tempAdd.toString().compareToIgnoreCase(head.toString()) < 0) 
		{
			tempAdd.setNext(head);
			head = tempAdd;
		}
		else 
		{
			Node<String> nodeRight = head.getNext();
			Node<String> nodeLeft = head;
			boolean flag = false;
			while (nodeRight != null && !flag)
			{
				 if(tempAdd.toString().compareToIgnoreCase(nodeRight.toString()) < 0) 
				 {
					 flag = true;
				 } 
				 else
				 {
					 nodeLeft = nodeRight;
					 nodeRight = nodeRight.getNext();
				 }
			}
			tempAdd.setNext(nodeLeft.getNext());
			nodeLeft.setNext(tempAdd);
		}
	}

	public void delete(String delete)
	{

		Boolean flag = false;

		if( head != null) 
		{

			while(head.toString().equalsIgnoreCase(delete.toString())) 
			{
				head = head.getNext();
				flag = true;
				size--;
			}

			Node<String> nodeLeft = head;
			Node<String> nodeRight = head.getNext();

			while (nodeRight != null)
			{
					if (nodeRight.toString().equalsIgnoreCase(delete.toString()))
					{
						nodeLeft.setNext(nodeRight.getNext());
						nodeRight = nodeLeft.getNext();
						flag = true;
						size--;
					} 
					else 
					{
						nodeLeft = nodeRight;
						nodeRight = nodeLeft.getNext();
					}
			}

			if (!flag)
			{
				System.out.println("Unable to delete: " + delete.toString());
			}
		}
	}

	public int size()
	{
		return size;
	}

	public String toString()
	{
		String temp = "";
		Node<String> tempNode = head;
		if(tempNode == null)
		{
			return temp;
		}
		else
		{
			while(tempNode != null)
			{
				temp = temp + tempNode.toString() + ";";
				tempNode = tempNode.getNext();
			}
		}
		return temp;
	}

}