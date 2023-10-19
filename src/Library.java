public class Library {
    public static void main(String[] args) {
        // Создание объектов авторов
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Петр", "Петров");

        // Создание объектов книг
        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);

        // Изменение года публикации одной из книг
        book1.setYear(2005);

        // Вывод информации о книгах
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getYear());

        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getYear());
    }
}
