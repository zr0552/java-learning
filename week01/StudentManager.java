package week01;

public class StudentManager {
   private Student[] students=new Student[10];
   private int count=0;

   public void add(Student s){
      students [count]=s;
      count++;
   }
   public  int size(){
    return count;
   }
   public void remove(String id){
       for (int i = 0; i < count; i++) {
           if (students[i].getId().equals(id)){
               for (int j = i; j < count-1; j++) {
                    students[j]=students[j+1];
               }
               count--;
               return;
           }

       }


       System.out.println("没找到");
       }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.add(new Student("001","张三",19,95));
        manager.add(new Student("002","李四",20,55));
        manager.add(new Student("003","王五",21,88));
        System.out.println(manager.size());
        System.out.println("====================");
        manager.remove("002");
        System.out.println(manager.size());
        manager.remove("001");
        System.out.println(manager.size());
    }
}