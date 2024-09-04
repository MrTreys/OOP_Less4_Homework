import java.util.ArrayList;

public class StudyingGroupService {
    public static void removeStudent(StudyingGroup group, String name) {
        for (Student student : group) {
            if (student.getName().equals(name)) {
                group.removeStudent(student);
            }
        }
    }

    public static ArrayList<Student> sortById(StudyingGroup group) {
        ArrayList<Student> newGroup = group.getGroup();
        newGroup.sort((s1, s2) -> Integer.compare((int) s1.getId(), (int) s2.getId()));
        return newGroup;
    }

    public static ArrayList<Student> sortByName(StudyingGroup group) {
        ArrayList<Student> newGroup = group.getGroup();
        newGroup.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        return newGroup;
    }
}
