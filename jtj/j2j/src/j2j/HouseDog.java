package j2j;

public class HouseDog extends Dog {
	
	HouseDog(String name){
		this.setName(name);
	}
	
	void sleep() {
		System.out.println(this.getName() + "는 지금 zzz");
	}
}
