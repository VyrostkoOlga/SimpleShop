
import interfaces.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import realisations.*;

public class Runner 
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "/beans.xml" );
		IWarehouse wh = (Warehouse)ctx.getBean("WH1");
		System.out.println(wh.getInfo());
		wh.getOneGood("apples", 5);
		System.out.println(wh.getInfo());
	}

}
