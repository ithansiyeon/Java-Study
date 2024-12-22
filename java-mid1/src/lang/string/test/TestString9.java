package lang.string.test;

public class TestString9 {
	public static void main(String[] args) {
		String email = "hello@example.com";
		int index = email.indexOf("@");
		String[] parts = email.split("@");
		System.out.println("ID: " + parts[0]);
		System.out.println("Domain: " + parts[1]);
	}
}
