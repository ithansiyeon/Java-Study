package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data); //추가

		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 | SendExceptionV3 e) {
			System.out.println("[연결 또는 전송 오류] 주소: , 메시지: " + e.getMessage());
		} finally {
			client.disconnect();
		}
	}
}
