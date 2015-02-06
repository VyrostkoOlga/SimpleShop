package interfaces;

public interface IGood 
{
	public void setPrice(double price);
	public double getPrice();
	
	public void setName(String name);
	public String getName();
	
	public void setCategory(ICategory cat);
	public ICategory getCategory();
	
	public void setQty(int qty);
	public int getQty();
	
	public String getInfo();

}
