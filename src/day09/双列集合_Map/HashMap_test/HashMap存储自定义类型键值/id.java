package day09.双列集合_Map.HashMap_test.HashMap存储自定义类型键值;
/**
 * 身份证
 *
 * */
public class id {
    private int id;

    public id() {
    }

    public id(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        id id1 = (id) o;

        return id == id1.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "id{" +
                "id=" + id +
                '}';
    }
}
