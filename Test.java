abstract class animal 
{
	
	
public	abstract void sound() ; 

}

class Dog extends animal
{
	public void sound()   
	{
		System.out.println("Dog is barking0");
	}
}

class Lion extends animal {
	public void sound() 
	{
		System.out.println("Lion is king");
	}
}
public class Test {
	
	public static void main (String[] args)  {
		
		Dog d = new Dog () ;
		Lion l = new Lion () ; 
		
		d.sound() ; 
		l.sound() ; 
	}

}
