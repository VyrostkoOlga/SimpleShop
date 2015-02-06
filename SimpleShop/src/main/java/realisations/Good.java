package realisations;

import interfaces.IGood;
import interfaces.ICategory;

public class Good implements IGood
{
	//Constructor with name(String), price(double), category and quantity (int) initialization
	public Good(String name, double price, ICategory cat, int qty)
	{
		_name = name;
		_price = price;
		_cat = cat;
		_qty = qty;
	}
	
	private double _price; //a price of a good (floating point value)
	private String _name; //identification of a good
	private ICategory _cat; //category of a product
	private int _qty; //quantity of a product 
	
	public void setPrice(double price) {_price = price;}
	public double getPrice() {return _price;}
	
	public void setName(String name) {_name = name;}
	public String getName() {return _name;}
	
	public void setCategory(ICategory cat) {_cat = cat;}
	public ICategory getCategory() {return _cat;}
	
	public void setQty(int qty) {_qty = qty;}
	public int getQty() {return _qty;}
	
	public String toString() {return getName();}
}
