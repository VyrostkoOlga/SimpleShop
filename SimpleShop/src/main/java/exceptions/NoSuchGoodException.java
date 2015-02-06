package exceptions;

import interfaces.*;

public class NoSuchGoodException extends Exception
{
	private IWarehouse _whouse;
	private ICategory _cat;
	
	public NoSuchGoodException(ICategory cat, IWarehouse whouse)
	{
		_whouse = whouse;
		_cat = cat;
	}
	
	public String getMessage()
	{
		return new String(String.format("There isn't good {0} at warehouse {1}", _whouse, _cat));
	}
}
