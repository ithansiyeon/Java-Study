package lang.string.builder;

public class SpringBuilderMain1_2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A").append("B").append("C").append("D").insert(4, "Java").delete(4,8).reverse();
		String string = sb.toString();
		System.out.println("string = " + string);
	}
}
