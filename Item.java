public class Item
{
	String barcode;
	String item;
	double price;

	public Item()
	{
		barcode = "000";   
		item = "no item";
		price = 0.00;
	}

	public Item(String bc, String it, double p)
	{
		barcode = bc;
		item = it;
		price = p;
	}

	//get info methods
	public String getBarcode()
	{
		return barcode;
	}

	public String getItem()
	{
		return item;
	}

	public double getPrice()
	{
		return price;
	}

	//set info methods
	public void setBarcode(String bc)
	{
		barcode = bc;
	}

	public void setItem(String it)
	{
		item = it;
	}

	public void setPrice(double p)
	{
		price = p;
	}

	//to String
	public String toString()
	{
		return "barcode: "+barcode+ " item: "+item+ " price: "+price; 
	}

}