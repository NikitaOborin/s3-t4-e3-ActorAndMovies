import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы
        Movie movie = (Movie) obj; // открываем доступ к полям другого объекта
        return Objects.equals(title, movie.title) && // проверяем все поля
                (releaseYear == movie.releaseYear); // примитивы сравниваем через ==
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }

}