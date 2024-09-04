public interface UserController<T extends User> {
    void create(StudyingGroup group, String name, String lastName, int age);
}
