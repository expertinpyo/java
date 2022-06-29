package com.inheritance;

public abstract class AbstractRecipe {
	// 추상 클래스는 하위 클래스들에게 정의하는 것 등을 떠넘긴다.
	// 전체적으로 이런게 필요하겠거니 생각하고 청사진을 그리는 역할을 하고
	// 하위 클래스에서 그 것들에 대한 구체적인 작업을 들어가게끔 한다.

	// 이렇게 하게 되면 각 하위클래스 마다 이름은 동일하지만 다른 동작을 할 수 있는 메서드들을 만들 수 있다.

	// 그렇가도 추상 클래스 안에 비추상적 방법들을 사용하지 못하는 것은 아니다.

	public void execute() {
		First();
		Second();
		Third();
	}

	abstract void First();

	abstract void Second();

	abstract void Third();
}
