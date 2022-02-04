class DataKeeper
{
	private String info;
	public void setData(String info_){
		info=info_;
	}
	public String getData()
	{
		return this.info;
	}
}

public class Question12
{
	public static void main(String args[])
	{
		DataKeeper obj=new DataKeeper();
		obj.setData("Secret Message");
		System.out.println(obj.getData());
	
	}
}