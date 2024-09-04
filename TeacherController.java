import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class TeacherController {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    private ArrayList<Teacher> teachers;

    public void addTeachers(ArrayList<Teacher> list) {
        teachers.addAll(list);
    }

    public void addTeachers(Teacher teacher) {
        addTeachers(new ArrayList<>(Arrays.asList(teacher)));
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public TeacherController(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherController() {
        this(new ArrayList<Teacher>());
    }

    public void removeTeacher(ArrayList<Teacher> list, String name) {
        teacherService.removeTeacher(list, name);
    }

    public ArrayList<Teacher> sortById(ArrayList<Teacher> list) {
        return teacherService.sortById(list);
    }

    public ArrayList<Teacher> sortByName(ArrayList<Teacher> list) {
        return teacherService.sortByName(list);
    }

    public void create(ArrayList<Teacher> list, String name, String lastName, int age) {
        list.add(new Teacher(name, lastName, new Random().nextInt(30, 60), 1));
    }

    public void sendOnConsole(List<Teacher> list) {
        teacherView.sendOnConsole(list);
    }
}