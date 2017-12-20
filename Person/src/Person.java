/*
 * Peter Song
 * S3C7
 * APCS
 * Mr.Daniel
 * This program generates a person class.
 */

public class Person {

	// Constructer
	private String language;
	private int age;
	private int color;

	public Person(String language) {
		this.language = language;
		this.age = 0;
		this.color = 0;
	}

	public String getMessage() {
		if (this.age < 3) {
			return "a...a...";
		} else if (this.language.equals("English")) {
			return "Hello I am" + this.age + " years old.";
		} else
			return "你好 我" + this.age + " 岁了。";
	}

	public void color(int whatColor) {
		this.color += whatColor;
	}

	public void grow(int years) {
		this.age += years;
	}

	public int getAge() {
		return this.age;
	}

	public int skinColor() {
		return this.color;
	}

	public void SayHello() {
		if (this.language.equals("English"))
			System.out.println("Hello World." + this.age + " years old.");
		else
			System.out.println("你好" + this.age + " 岁。");
	}

	public void SayGoodBye() {
		if (this.language.equals("English")) {
			System.out.println("Good Bye." + this.age + " years old.");
		} else
			System.out.println("再见" + this.age + " 岁。");
	}

}
