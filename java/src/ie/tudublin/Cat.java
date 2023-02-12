package ie.tudublin;

public class Cat 
{
	String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Cat()
	{
	}
	
	public Cat(String name)
	{
	}
	
	public void kill(int numLives)
	{
		while (numLives > 0){
			numLives = numLives - 1;
			System.out.println("Ouch! Number of lives remaining:" + numLives);
		}
		System.out.println(name + " is now dead");
	}
}
