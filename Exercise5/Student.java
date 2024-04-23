package student;

public class Student {
    private String name; // Tên
    private String id; // Mã sinh viên
    private String birth; // Ngày sinh
    private String gender; // Giới tính
    private String address; // Địa chỉ

    public Student(String name, String id, String birth, String gender, String address) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Student[ID=%s, Name=%s, Birth=%s, Address=%s, Gender=%s]", id, name, birth, address, gender);
    }
}