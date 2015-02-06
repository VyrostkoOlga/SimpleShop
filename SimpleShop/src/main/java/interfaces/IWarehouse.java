package interfaces;

public interface IWarehouse 
{
	public void getOneGood(String name, int num);
	public void addOneGood(IGood outGood);
	public String getInfo();
}
