package akpractice;

public class SingleLink {
	AkNode head;
	
	public void insert1(int data)
	{
		AkNode addTo = new AkNode();
		addTo.data = data;
		addTo.adrese = null;
		
		
		if(head == null)
		{
			head = addTo;
		}
		else {
			AkNode tem = head;
			while (tem.adrese != null) 
			{
				tem = tem.adrese;	
			}
			tem.adrese = addTo;
			
		}
	}
	
	public void insertAtStart(int data)
	{
		AkNode atStart = new AkNode();
		atStart.data =data;
		atStart.adrese = null;
		atStart.adrese = head;
		head = atStart;
	}
	void print()
	{
		AkNode tem = head;
		while(tem != null)
		{
			System.out.println(tem.data+" ");
			tem = tem.adrese;
		}
	}

}
