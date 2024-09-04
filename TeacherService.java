import java.util.ArrayList;

public class TeacherService {
    public void removeTeacher(ArrayList<Teacher> list, String name) {
        for (Teacher teacher : list) {
            if (teacher.getName().equals(name)) {
                list.remove(teacher);
            }
        }
    }

    public ArrayList<Teacher> sortById(ArrayList<Teacher> list) {
        list.sort((s1, s2) -> Integer.compare((int) s1.getId(), (int) s2.getId()));
        return list;
    }

    public ArrayList<Teacher> sortByName(ArrayList<Teacher> list) {
        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        return list;
    }
}
