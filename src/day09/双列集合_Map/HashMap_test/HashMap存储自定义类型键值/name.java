package day09.双列集合_Map.HashMap_test.HashMap存储自定义类型键值;
/**
 * 名字
 * */
public class name {
    private String name;

    public name() {
    }

    public name(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        name name1 = (name) o;

        return name != null ? name.equals(name1.name) : name1.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name{" +
                "name='" + name + '\'' +
                '}';
    }
}
