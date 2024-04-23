package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = inputStudent();
        outputStudent(students);
        
        System.out.println("Danh sach sinh vien sau khi sap xep theo ten:");
        sortByName(students);
        outputStudent(students);
        
        System.out.println("Danh sach sinh vien sau khi sap xep theo gender:");
        sortByGender(students);
        outputStudent(students);
        
        System.out.println("Danh sach sinh vien loc theo ma lop 22:");
        filterById(students, "22");
    }
    
    public static ArrayList<Student> inputStudent() {
        Scanner scanner = new Scanner(System.in);
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

    public static ArrayList<Student> sortByName(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getName().compareTo(students.get(i).getName()) < 0) {
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }

        return students;
    }

    public static ArrayList<Student> sortByGender(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getGender().compareTo(students.get(i).getGender()) < 0) {
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }
        return students;
    }

    public static ArrayList<Student> filterByGender(ArrayList<Student> students, String inputGender) {
        ArrayList<Student> filterStudent = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender().equals(inputGender)) {
                filterStudent.add(students.get(i));
            }
        }
        return filterStudent;
    }

    public static ArrayList<Student> filterById(ArrayList<Student> students, String classKey) {
        ArrayList<Student> filterStudent = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i).getId().substring(0, 2)).equals(classKey)) {
                filterStudent.add(students.get(i));
            }
        }
        outputStudent(filterStudent);
        return filterStudent;
    }
}
