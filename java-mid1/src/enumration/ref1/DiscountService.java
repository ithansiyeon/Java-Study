package enumration.ref1;

public class DiscountService {

	//StringGrade를 사용하세요.
	public int discount(ClassGrade classGrade, int price) {
		return price * classGrade.getDiscountPercent() / 100;
	}
}
