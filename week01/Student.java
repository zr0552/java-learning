package week01;

public class Student {
    private String id;
    private String name;
    private int age;
    private double score;

    public Student(String id,String name,int age,double score){
        this.id=id;
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age>150 ||age<0){
            System.out.println("年龄不合法"+age);
            return;
        }
        this.age=age;
    }
    public double getScore(){
        return this.score;
    }
    public void setScore(double score){
        this.score=score;
    }
    public String getLevel(){
        if (score>=90){
           return "优秀";
        }else if (score>=60){
           return "及格";
        }else {
           return "不及格";
        }

    }

    public static void main(String[] args) {
        Student student = new Student("20070812","小王",19,99);
        Student student1 = new Student("20070812","小王",19,50);
        System.out.println(student.getLevel());
        System.out.println(student1.getLevel());
        student.setAge(-5);
        System.out.println(student.getAge());


    }
}

