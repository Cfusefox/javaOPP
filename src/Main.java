import model.Student;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("fox", 22, "man", "11111111111");
        System.out.println("姓名: " + stu.getName());
        System.out.println("年龄: " + stu.getAge());
        System.out.println("性别: " + stu.getGender());
        System.out.println("身份证: " + stu.getIdNo());
    }
}
