package nested.ex;

public class Library {
    private Book[] books;
    private int index;

    public Library(int length) {
        this.books = new Book[length];
        this.index = 0;
    }

    public void addBook(String title, String author) {
        if (index >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[index++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
        }
    }

    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
