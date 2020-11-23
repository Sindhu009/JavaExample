package xworkz.com.ThreadExtends;

public class PrintWholeNumber {
	public int name,i;
	public void run()
	{
	    for(i=0;i<=50;i++)
	    {
	        System.out.println("Thread" + name + " : " + i);
	        try
	        {
	           Thread.sleep(1000);
	        }
	        catch(Exception e)
	        {
	            System.out.println("some problem");
	        }
	    }
	
	    
	}}
	