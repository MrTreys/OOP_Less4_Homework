import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentController implements UserController<Student> {
    private final StudentView stView = new StudentView();

    public static void removeStudent(StudyingGroup group, String name) {
        StudyingGroupService.removeStudent(group, name);
    }

    public static ArrayList<Student> sortById(StudyingGroup group) {
        return StudyingGroupService.sortById(group);
    }

    public static ArrayList<Student> sortByName(StudyingGroup group) {
        return StudyingGroupService.sortByName(group);
    }

    @Override
    public void create(StudyingGroup group, String name, String lastName, int age) {
        group.acceptStudent(new Student(name, lastName, new Random().nextInt(18, 27), 1));
    }

    public void sendOnConsole(List<Student> list) {
        stView.sendOnConsole(list);
    }
}
