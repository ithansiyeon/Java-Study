package lang.object.tostring;

public class ToStringMain1 {
	public static void main(String[] args) {
		Object object = new Object();
		String string = object.toString();

		//toString() 반홥값 출력
		System.out.println(string); //클래스정보@인스턴스정보

		//object 직접 출력
		System.out.println(object);
	}
}
