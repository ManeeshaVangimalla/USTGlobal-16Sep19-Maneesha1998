package encapsulation;

public class Account {
    private long accountNumber;
    private String name;
    private long contact;
    private double balance;
    public void setAccount(long accountNumber)
    {
    	if(accountNumber>0 && accountNumber<=1234)
    	{
    	this.accountNumber=accountNumber;
    	}
    	else
    	{
    		System.out.println("invalid accountnumber");
    	}
    }
    public long getAccount()
    {
    	return this.accountNumber;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return this.name;
    }
}
