import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileOps {
    private static final String INPUT_FILE_NAME = "in.txt";
//    private static final String OUTPUT_FILE_NAME = "out.txt";

    public static List<Student> readFromFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Student> studentList = new ArrayList();
        while (true) {
            String line = br.readLine();
            if (line == null) break;
//            System.out.println(line);
            String[] tokens = line.split(",");
            Student s = new Student();
            s.setId(Integer.parseInt(tokens[0]));
            s.setName(tokens[1]);
            s.setMobileNo(tokens[2]);
            s.setCreditCompleted(Integer.parseInt(tokens[3]));
            studentList.add(s);
        }
        br.close();
        return studentList;
    }

    public static void main(String[] args) throws Exception {
        List<Student> studentList = readFromFile();

        for (Student s : studentList) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getMobileNo() + ", " + s.getCreditCompleted());
        }
    }
}
