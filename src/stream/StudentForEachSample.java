package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample=new StudentForEachSample();
        List<StudentDTO> studentList=new ArrayList<>();
        studentList.add(new StudentDTO("aa",12,123,13));
        studentList.add(new StudentDTO("bb",12,123,13));
        studentList.add(new StudentDTO("cc",12,123,13));
        studentList.add(new StudentDTO("dd",12,123,13));
        sample.mapStudentName(studentList);
        //sample.printStudentNames(studentList);
    }
    public void printStudentNames(List<StudentDTO> students){
        students.stream().forEach(student->System.out.println(student));
    }
    public void mapStudentName(List<StudentDTO> students){
        students.stream().map(student->student.getName()).forEach(student->System.out.println(student));
    }
}
