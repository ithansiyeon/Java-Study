package enumration.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthGradeMain2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
		String grade = kb.nextLine();
		AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
		System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
		System.out.println("==메뉴 목록==");
		List<String> list = new ArrayList<>();
		list.add("- 메인 화면");
		list.add("- 이메일 관리 화면");
		list.add("- 관리 화면");
		for (int i = 0; i < authGrade.getLevel(); i++) {
			System.out.println(list.get(i));
		}
	}
}
