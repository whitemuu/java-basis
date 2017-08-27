package me.nichijou.markinterface;

public class CloneAble {

	public static void main(String[] args) throws CloneNotSupportedException {
		Apple apple = new Apple(Apple.Breed.FUSHI,90);
		System.out.println(apple);
		// kn one must implement Cloneable to be cloned
		Apple clonedApple = apple.clone();
		System.out.println(clonedApple);
	}

}

class Apple implements Cloneable {
	// kn will be compiled to a independent class named Apple$Breed.class, TODO while intellij not
	static enum Breed {GUOGUANG, FUSHI, WANGLIN}

	private Breed breed;
	private Integer days;

	Apple(Breed breed, Integer days) {
		this.breed = breed;
		this.days = days;
	}

	@Override // kn Change return type to subclass still pertain to Override
	// kn 因为 Main 和 Apple同包，能访问 protected 方法,但不能访问Object的protect方法，所以要在这里override
	protected Apple clone() throws CloneNotSupportedException {
		return (Apple)super.clone();
	}
}
