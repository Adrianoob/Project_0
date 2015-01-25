import java.util.*;

public class Cashier
{
	Scanning sc = null;
	ArrayList<Item> itemList = new ArrayList<Item>();
	double sum = 0;
	double tax = 0;
    
    public Cashier (){
        sc = new Scanning();
        sc.loadInformation();
        sum=0;
        tax=0;
    }

	public void addItem(String barcode)
	{
		Item i = sc.scan(barcode);
		itemList.add(i);
	}

	public void deleteItem(String barcode)
	{
		sc.loadInformation();
		Item i = sc.scan(barcode);
		itemList.remove(i);
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
		double check = sum + tax;
		return "Total: "+sum+ " Tax: "+tax+" Total after tax: "+ check;
	}

}
