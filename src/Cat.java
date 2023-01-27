import java.util.Comparator;
import java.util.logging.StreamHandler;

public class Cat implements Comparable<Cat> {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return o.equals(name);
    }

    @Override
    public int compareTo(Cat o){return this.name.compareTo(o.name);}
}