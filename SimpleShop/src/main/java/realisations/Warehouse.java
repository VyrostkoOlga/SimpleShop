package realisations;

import java.util.ArrayList;
import java.util.List;

import interfaces.ICategory;
import interfaces.IGood;
import interfaces.IWarehouse;

public class Warehouse implements IWarehouse
{
	
	ArrayList<IGood> _goods; //list of goods presented in the warehouse
	
	public Warehouse() //simple constructor without adding goods 
	{
		_goods = new ArrayList<IGood>();
	}
	
	public Warehouse(ArrayList<IGood> goods) //constructor with adding goods
	{
		_goods = goods;
	}

	public void getOneGood(String name, int num) 
	{
		for (IGood one: _goods)
		{
			if (one.getName().equals(name))
			{
				int qty = one.getQty();
				if (qty >= num)
				{
					qty -= num;
					one.setQty(qty);
					break;
				}
			}
		}
	}

	public void addOneGood(IGood outGood) 
	{
		_goods.add(outGood);
	}
	
	public String toString()
	{
		return "SimpleWarehouse";
	}
	
	public String getInfo()
	{
		StringBuffer buf = new StringBuffer();
		for (IGood one: _goods)
		{
			buf.append(one.getInfo() + "\n");
		}
		return new String(buf);
	}
}
