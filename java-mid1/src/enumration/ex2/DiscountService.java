package enumration.ex2;

import enumration.ex1.StringGrade;

public class DiscountService {

	//StringGrade를 사용하세요.
	public int discount(ClassGrade classGrade, int price) {
		int discountPercent = 0;
		//x001
		if (classGrade == ClassGrade.BASIC) {
			discountPercent = 10;
		} else if (classGrade == ClassGrade.GOLD) {
			discountPercent = 20;
		} else if (classGrade == ClassGrade.DIAMOND) {
			discountPercent = 30;
		} else {
			System.out.println("할인X");
		}

		// 10000 * (20/100) -> 2000
		return price * discountPercent / 100;
	}
}
