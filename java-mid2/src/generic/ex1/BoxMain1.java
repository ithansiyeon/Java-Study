package generic.ex1;

public class BoxMain1 {
	public static void main(String[] args) {
		IntegerBox integerBox = new IntegerBox();
		integerBox.set(10); //오토 박싱
		Integer integer = integerBox.get();
		System.out.println("integer = " + integer);

		StringBox stingBox = new StringBox();
		stingBox.set("hello");
		String str = stingBox.get();
		System.out.println("str = " + str);
	}
}
