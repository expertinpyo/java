package j2j;

public class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "Tiger";
	}
	
	public void bark() {
		System.out.println("으르렁 호랑이");
	}
}
