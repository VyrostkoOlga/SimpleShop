package realisations;

import interfaces.ICategory;

public class Category implements ICategory
{
	private String _name; //identification of the category
	
	public Category(String name) {setName(name);} //constructor with name initialization
	
	public String getName() {return _name;}
	public void setName(String name) {_name = name;}
	
	public String toString() {return getName();}
	public boolean equals(ICategory another)
	{
		try
		{
			Category other = (Category) another;
			return (_name.equals(other.getName()));
		}
		catch (Exception ex)
		{
			return false;
		}
	}
}
