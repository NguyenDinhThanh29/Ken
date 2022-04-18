public class Student {
    String name;
    int age;

    public Student(String Thanh) {
        name = Thanh;
    }
    public Student(int a){
         age = a;
    }
    public String getName(){

        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[]args){
        Student a1 = new Student("Thanh");
        System.out.println("Name is : "+ a1.getName());

        Student a2 = new Student(18);
        System.out.println("Age : "+a2.getAge());
    }
}

