package generic.ex1;

public class RowTypeMain {
	public static void main(String[] args) {
//		GenericBox integerBox = new GenericBox();
		GenericBox<Object> integerBox = new GenericBox<>(); //권장
		integerBox.set(10); // 오토 박싱
		Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
		System.out.println("integer = " + integer);
	}
}
