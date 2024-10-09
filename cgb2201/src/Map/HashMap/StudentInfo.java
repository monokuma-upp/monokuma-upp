package Map.HashMap;

public class StudentInfo implements Comparable<StudentInfo>{

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String phone;

    public StudentInfo(Integer id, String name, String sex, int age) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("学号:%s姓名:%s,性别:%s,年龄:%d,电话:%s", id, name, sex, age,
                phone);
    }


    @Override
    public int compareTo(StudentInfo student) {
        int l = this.id - student.id;
        return l == 0 ? this.name.compareTo(student.name) : l;
    }

}
