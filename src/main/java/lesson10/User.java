package lesson10;

import lombok.Data;
import lombok.Setter;

import java.util.Objects;

@Setter
public class User {
    private String Name;

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Name, user.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public User(String name) {
        Name = name;
    }
}
