package j2j;

public class Lion extends Animal implements Predator, Barkable {
	public String getFood() {
		return "Lion";
	}
	
	public void bark() {
		System.out.println("으르렁 사자");
	}
}
