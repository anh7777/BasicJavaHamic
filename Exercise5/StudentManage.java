package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = inputStudent(scanner);
        outputStudent(students);

        sortAndDisplay(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        }, "Danh sach sinh vien sap xep theo ten: ");

        sortAndDisplay(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGender().compareTo(s2.getGender());
            }
        }, "Danh sach sinh vien theo gender:");
        
        filterByIdAndDisplay(students, "22");
    }
    
    public static ArrayList<Student> inputStudent(Scanner scanner) {
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + (i+1) + ":");
            String id = scanner.next();
            String name = scanner.next();
            String birth = scanner.next();
            String address = scanner.next();
            Student student = new Student(name, id, birth, null, address);
        
            students.add(student);
            scanner.nextLine();
        }
        
        return students;
    }
    
    public static void outputStudent(ArrayList<Student> students) {
        System.out.println("Danh sach sinh vien:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }
    
    public static void sortAndDisplay(ArrayList<Student> students, Comparator<Student> comparator, String message) {
        Collections.sort(students, comparator);
        System.out.println(message);
        outputStudent(students);
    }

    public static void filterByIdAndDisplay(ArrayList<Student> students, String classKey) {
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getId().startsWith(classKey)) {
                filteredStudents.add(student);
            }
        }
        System.out.println("Danh sach sinh vien loc theo ma lop:");
        outputStudent(filteredStudents);
    }
}
