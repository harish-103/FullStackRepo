enum Status
	{
	NEW(1),REJECTED(2),ACCEPTED(3),COMPLETED(4);
	int val;
	Status(int val)
		{
		this.val=val;
		}
	public int getValue()
		{
		return this.val;
		}
	public void setValue()
		{
		this.val=val;
		}
	
	}
class Order
{
	private int id,quantity;
	private String name;
	private Status status;
	public Order(String name,int id,int quantity,Status status)
	{
		this.id=id;
		this.quantity=quantity;
		this.name=name;
		this.status=status;
	}
	
public int getOrderStatus()
	{
	return status.getValue();
	}
}
class EnumMain
{
	public static void main(String args[])
	{
	Order o=new Order("ABC",123,1,Status.COMPLETED);
	System.out.println(o.getOrderStatus());
	}
}	

	