public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Roald Dahl", "roaldD@email.com", 'm');
        Author author2 = new Author("J.K Rowling", "jkrow@email.com", 'f');
        Book book1 = new Book("James and the Giant Peach", author1, 15.0);
        Book book2 = new Book("Harry Potter 1", author2, 30.5, 15);

        System.out.println(book1.toString());
        System.out.println(book2);
    }
}
