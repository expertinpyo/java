package j2j;

public class Hippo extends Animal implements Predator, Barkable{
	
	public String getFood() {
		return "Hippo";
	}
	
	public void bark() {
		System.out.println("음메 하마");
	}
}
