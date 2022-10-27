import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;


    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы
        Actor actor = (Actor) obj; // открываем доступ к полям другого объекта
        return Objects.equals(firstName, actor.firstName) && // проверяем все поля
                Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
