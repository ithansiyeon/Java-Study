package poly.ex.pay1;

public class PayService {
	public void processPay(String option, int amount) {
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
		// 결재 수단 선택
		Pay pay = PayStore.findPay(option);
		// 결재를 실제로 실행
		boolean result = pay.pay(amount);

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}
}
