package enumration.ex3;

import static enumration.ex3.Grade.*;

public class DiscountService {

	//StringGrade를 사용하세요.
	public int discount(Grade grade, int price) {
		int discountPercent = 0;
		//x001
		if (grade == BASIC) {
			discountPercent = 10;
		} else if (grade == GOLD) {
			discountPercent = 20;
		} else if (grade == DIAMOND) {
			discountPercent = 30;
		} else {
			System.out.println("할인X");
		}

		// 10000 * (20/100) -> 2000
		return price * discountPercent / 100;
	}
}
