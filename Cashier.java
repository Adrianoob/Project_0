import java.util.*;

public class Cashier
{
	Scanning sc = null;
	ArrayList<Item> itemList = new ArrayList<Item>();
	double sum = 0;
	double tax = 0;
    
	public Cashier()
	{
		sc.loadInformation();
	}

	public void addItem(String barcode)
	{

		Item i = sc.scan(barcode);
		itemList.add(i);
	}

	public void deleteItem(String barcode)
	{
		Item i = sc.scan(barcode);
		for(int j = 0; j<itemList.size(); j++)
		{
			if(itemList.get(j).getBarcode().equals(barcode)){
				itemList.remove(j);
			}
		}
	}

	public double sum()
	{
		for(int i = 0; i<itemList.size(); i++)
		{
			sum = sum + itemList.get(i).getPrice();
		}
		return sum;
	}

	public double tax()
	{
		tax = sum*0.09;
		return tax;
	}

	public String print()
	{	
		String receipt = "\n";
		for(int i = 0; i<itemList.size(); i++)
		{
			receipt = receipt+itemList.get(i).toString()+"\n";
		}
		double check = sum + tax;
		return receipt+"Total: "+sum+ " Tax: "+tax+" Total after tax: "+ check;
	}

}
