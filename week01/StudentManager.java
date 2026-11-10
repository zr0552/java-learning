package week01;

public class StudentManager {
    private Student[] students = new Student[10];
    private int count = 0;

    public void add(Student s) {
        students[count] = s;
        count++;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.add(new Student("001", "张三", 19, 95));
        manager.add(new Student("002", "李四", 20, 55));
        manager.add(new Student("003", "王五", 21, 88));

        System.out.println(manager.size());
    }
}