package j2j;

public class Sample {
	public void sayNick(String nick) {
		throw new FoolException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		Animal dog = new Animal();
		cat.setName("탕이");
		dog.setName("릴리");
		System.out.println(cat.getName());
		System.out.println();
		Dog chiwawa = new Dog();
		chiwawa.setName("멍멍이");
		System.out.println(chiwawa.sound());
		chiwawa.sleep();
		
		HouseDog Doggy = new HouseDog("댕댕이");
		Doggy.sleep();
	
		
		ZooKeeper keeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Hippo hippo = new Hippo();
		
		keeper.feed(hippo);
		keeper.feed(tiger);
		keeper.feed(lion);

		
		
		Sample sample = new Sample();
		sample.sayNick("fool");
		sample.sayNick("genius");
		
		
		
		
	}

}
