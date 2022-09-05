package j2j;

public class Dog extends Animal{
	
	private String sound="멍멍";
	
	String sound() {
		return this.sound;
	}
	
	void sleep() {
		System.out.println(this.getName() + "는 지금 자고 있습니다.");
	}
}
