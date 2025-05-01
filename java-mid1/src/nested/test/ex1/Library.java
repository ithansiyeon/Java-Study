package nested.test.ex1;


public class Library {
	//코드 작성
	private Book[] books;
	private int bookCount;

	public Library(int size) {
		books = new Book[size];
		bookCount = 0;
	}

	private static class Book {
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}

	public void addBook(String title, String author) {
		//검증 로직을 다 처릭하고
		if (books.length <= bookCount) {
			System.out.println("도서관 저장 공간이 부족합니다.");
			return;
		}
		//정상 로직을 처리
		books[bookCount++] = new Book(title, author);
	}

	public void showBooks() {
		System.out.println("== 책 목록 출력 ==");
		for (Book book : books) {
			System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
		}
	}
}
