package nested.nested.ex2;

public class Network {

	public void sendMessage(String text) {
		NetworkMessage networkMessage = new NetworkMessage(text);
		networkMessage.print();
	}

	private static class NetworkMessage {
		private String text;

		NetworkMessage(String text) {
			this.text = text;
		}

		void print() {
			System.out.println(text);
		}
	}
}
