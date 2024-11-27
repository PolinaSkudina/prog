class Author {
    private String name;
    private String nationality;

    Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Приватный метод для отображения информации об авторе
    private String displayAuthorInfo() {
        return "Автор: " + name + ", Национальность: " + nationality;
    }

    // Публичный метод для отображения информации
    public String getAuthorInfo() {
        return displayAuthorInfo();
    }
}

class Book extends Author {
    private String title;
    private int publicationYear;
    private String genre; // Новое поле для жанра книги

    Book(String name, String nationality, String title, int publicationYear, String genre) {
        super(name, nationality); // Вызов конструктора базового класса
        this.title = title;
        this.publicationYear = publicationYear;
        this.genre = genre; // Инициализация жанра книги
    }

    // Переопределение метода для получения информации о книге
    public String getBookInfo() {
        return getAuthorInfo() + "\nНазвание книги: " + title + ", Год публикации: " + publicationYear + ", Жанр: " + genre;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой", "Россия");
        Book book1 = new Book("Федор Достоевский", "Россия", "Преступление и наказание", 1866, "Роман");
        
        System.out.println(book1.getBookInfo()); // Информация о книге и авторе
        
        // Пример вызова для другой книги
        Book book2 = new Book("Харпер Ли", "США", "Убить пересмешника", 1960, "Роман");
        System.out.println(book2.getBookInfo()); // Информация о книге и авторе

        // Ещё один пример вызова
        Book book3 = new Book("Джордж Оруэлл", "Великобритания", "1984", 1949, "Антиутопия");
        System.out.println(book3.getBookInfo()); // Информация о книге и авторе
    }
}
