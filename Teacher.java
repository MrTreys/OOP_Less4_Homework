public class Teacher extends User implements Comparable<Teacher> {
    private final long id;
    private Integer group;
    private static int defaultName = 1;
    private static long defaultId = 128; 

    public Teacher(String name, String lastName, Integer age, long id, Integer group) {
        super(name, lastName, age);
        this.id = id;
        this.group = group;
    }

    public Teacher(String name, String lastName, Integer age, Integer group) {
        this(name, lastName, age, defaultId++, group);
    }

    public Teacher(String name, Integer group, Integer age) {
        this(name, "Unknown", age, group);
    }

    public Teacher(String name) {
        this (name, 1, 30);
    }

    public Teacher() {
        this(String.format("Teacher %d", defaultName++));
    }

    public long getId() {
        return this.id;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("%s, %d years old, currently teaching group %d\n", super.name, super.age, this.group);
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(this.age, o.getAge());
    }
}
