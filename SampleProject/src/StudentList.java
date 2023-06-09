import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private String mobileNo;
    private int creditCompleted;

    public Student() {

    }

    public Student(int id, String name, String mobileNo, int creditCompleted) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.creditCompleted = creditCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getCreditCompleted() {
        return creditCompleted;
    }

    public void setCreditCompleted(int creditCompleted) {
        this.creditCompleted = creditCompleted;
    }
}

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();

        Student s1 = new Student(1, "A", "123", 100);
        Student s2 = new Student(2, "B", "124", 90);
        Student s3 = new Student(3, "C", "125", 80);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(new Student(4, "D", "126", 110));

        for (Student s : studentList) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getMobileNo() + ", " + s.getCreditCompleted());
        }

        String searchName = "D";
        int searchIndex = -1;
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            if (s.getName().equals(searchName)) {
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1) {
            studentList.remove(searchIndex);
        }

        System.out.println("\nAfter removing:");
        for (Student s : studentList) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getMobileNo() + ", " + s.getCreditCompleted());
        }

    }
}
